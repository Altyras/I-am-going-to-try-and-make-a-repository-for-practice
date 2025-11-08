import java.util.Scanner;

public class BitParity{
    private int[] a = new int[11];
    private int[] b = {};
    public void inputBinary(Scanner sc){
        for(int i=0; i<a.length;i++) a[i] = sc.nextInt();
    }
    public boolean isPowerOfTwo(int i){
        while(i % 2 == 0) i /=2;
        return i==1;
    }
    public void bLength(){
        int n=0;
        for(int i=0;i<a.length;i++)if (isPowerOfTwo(a[i])) n++;
        b=new int[a.length+n];
    }
    public void powersOfTwoSkipped(){
        int j=0;
        b[j++]=0;
        for(int i=0; i<a.length;i++)b[j++]=(isPowerOfTwo(a[i])) ? 0 : a[i];
    }
    public boolean isOdd(int a){
        if (a % 2 !=0);
        return true;
    }
    public void parity1(){
        int zero=0;
        for(int i=1; i<b.length;i+=2){
            for(int j=0;j<1;j++)if (b[j] == 0) zero++;
        }
        if(isOdd(zero))b[1]=1;
    }
    public void parity2(){
        int zero=0;
        for(int i=2; i<b.length;i+=3){
            for(int j=0;j<2;j++)if (b[j] == 0) zero++;
        }
        if(isOdd(zero))b[2]=1;
    }
    public void parity3(){
        int zero=0;
        for(int i=4; i<b.length;i+=5){
            for(int j=0;j<4;j++)if (b[j] == 0) zero++;
        }
        if(isOdd(zero))b[4]=1;
    }
    public void parity4(){
        int zero=0;
        for(int i=8; i<b.length;i+=9){
            for(int j=0;j<8;j++)if (b[j] == 0) zero++;
        }
        if(isOdd(zero))b[8]=1;
    }
    public void encoder(){
        bLength();
        powersOfTwoSkipped();
        parity1();
        parity2();
        parity3();
        parity4();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BitParity bp = new BitParity();
        bp.inputBinary(sc);
        bp.encoder();
        sc.close();
    }
}