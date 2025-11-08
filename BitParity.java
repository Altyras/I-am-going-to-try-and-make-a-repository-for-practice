import java.util.Scanner;

public class BitParity{
    private int[] a = new int[11];
    private int[] b = {};
    public void inputBinary(Scanner sc){
        System.out.println("Here");
        for(int i=0; i<a.length;i++) a[i] = sc.nextInt();
    }
    public boolean isPowerOfTwo(int i){
        System.out.println("Here2");
        int j=i;
        if (i < 1) return false;
        while(i % 2 == 0) {i /=2;}
        System.out.println(j+"is"+(i==1));
        return i==1;
    }
    public void bLength(){
        System.out.println("Here3");
        int n=0;
        for(int i=1;i<a.length;i++)
            if (isPowerOfTwo(a[i])) n++;
        b=new int[a.length+n];
        System.out.println(b.length);
    }
    public void powersOfTwoSkipped(){
        System.out.println("Here4");
        for(int p=0; p<a.length;p++){System.out.print(a[p]);}
        for(int i=0; i<b.length;i++){System.out.print(b[i]);}
        for(int i=1,j=0;i<b.length;i++){
            if (isPowerOfTwo(i)){b[i]=0;System.out.print(b[i]+"b[i] skip");}
            else{b[i]=a[j++];System.out.print(b[i]+"a[j++]");}
        }
        /*
        for(int i=0; i<a.length;i++){
            if (isPowerOfTwo(j)){b[j]=0; j++; continue;}
            b[j]=a[i];
        } */
        for(int p=0; p<a.length;p++){System.out.print(a[p]);}
        for(int i=0; i<b.length;i++){System.out.print(b[i]);}
    }
    public boolean isOdd(int a){
        System.out.println("Here5");
        return a % 2 !=0;
    }
    public void parity(int n){
        System.out.println("Here6");
        int zero=0;
        for(int i=n; i<b.length;i+=n+1)
            for(int j=0;j<n;j++)
                if (b[j] == 0) zero++
        ;
        if(isOdd(zero))b[n]=1;
    }
    public void parityCheck(){
        System.out.println("Here7");
        parity(1);
        for(int i=2;i<b.length-1;i+=i)
            parity(i);
        parity(0);
    }
    public void encoder(){
        System.out.println("Here8");
        bLength();
        powersOfTwoSkipped();
        parityCheck();
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
            if((i+1)%4==0)
                System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BitParity bp = new BitParity();
        bp.inputBinary(sc);
        bp.encoder();
        sc.close();
    }
}