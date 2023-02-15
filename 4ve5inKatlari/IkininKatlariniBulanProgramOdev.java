import java.util.Scanner;
public class IkininKatlariniBulanProgramOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i,j,n;
        System.out.print("Sayı Giriniz:");
        n = input.nextInt();
        System.out.println("4'ün Katları:");
        for(i=1; i<n; i*=4){

            System.out.println(i);
        }
        System.out.println("5'in Katları:");
        for (j=1; j<n; j*=5){

            System.out.println(j);
        }

    }
}
