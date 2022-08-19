import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        int i,j,k;

        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        n=inp.nextInt();

        for( i=1;i<=n;i++ ){
            for( j=1;j<=(i-1);j++)
                System.out.print(" ");
            for (k=1;k<=((2*n)-(2*i-1));k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
