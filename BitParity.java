import java.util.Scanner;

public class BitParity{
    private int[] a = new int[11];
    private int[] b = new int[16];
    public void inputBinary(Scanner sc){
        for(int i=0; i<a.length;i++) a[i] = sc.nextInt();
    }
    public boolean isPowerOfTwo(int i){
        while(i % 2 == 0) i /=2;
        return i==1;
    }
    public void encoder(){
        for(int i=0, n=0; i<a.length;i++){
            if(i==0){
                b[i]=0;
                n++;
                continue;
            }
            if(isPowerOfTwo(a[i-n]))b[i]=0;
            else b[i]=a[i-n];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BitParity bp = new BitParity();
        bp.inputBinary(sc);
        sc.close();
    }
}