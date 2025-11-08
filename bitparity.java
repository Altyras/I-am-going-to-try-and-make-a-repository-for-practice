import java.util.Scanner;

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //I FINALLY GOT JAVA RUNNING IN VSCODE, I DITCHED VSCODE FOR ONLINE ALTERNATIVES LIKE CODECHUM BUT THIS ACTUALLY WORKS!!
    int[] a= new int[16];
    for(int i=0; i<a.length;i++){
        a[i] = sc.nextInt();
    }
    sc.close();
}