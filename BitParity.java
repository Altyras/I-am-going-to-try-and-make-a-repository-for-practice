import java.util.Scanner;

public class BitParity{
    private int[] a = new int[11], b = {};
    public void inputBinary(Scanner sc){
        //for(int i=0; i<a.length;i++)
        //    a[i] = sc.nextInt();
        a = new int[] {0,0,1,1,0,0,0,1,1,1,0};
    }
    public boolean isPowerOfTwo(int i){
        if (i < 1) return false;
        while(i % 2 == 0) i /=2;
        return i==1;
    }
    public void bLength(){
        int n=0;
        for(int i=1;i<a.length;i++)
            if (isPowerOfTwo(a[i])) n++;
        b=new int[a.length+n];
    }
    public void powersOfTwoSkipped(){
        for(int i=1,j=0;i<b.length;i++)
            b[i]=(isPowerOfTwo(i)) ? 0 : a[j++];
    }
    public void parity(int n){
        int one=0;
        int v = (n == 0) ? 1 : n;
        for(int i=v;i<b.length;i+=v*2)
            for(int j=0;j<v && (i+j) <b.length;j++)
                if (b[i+j]==1) one++;
            ;
        ;
        if (one % 2 !=0) b[n]=1;
    }
    public void parityCheck(){
        for(int i=1;i<b.length-1;i+=i)
            parity(i);
        parity(0);
    }
    public void printOutEncodedBitParity(){
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
            if((i+1)%4==0)
                System.out.println();
        }
        if(b.length % 4 != 0) System.out.println();
    }
    public void encoder(){
        bLength();
        powersOfTwoSkipped();
        parityCheck();
        printOutEncodedBitParity();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BitParity bp = new BitParity();
        bp.inputBinary(sc);
        bp.encoder();
        sc.close();
    }
}