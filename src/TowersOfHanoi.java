import java.util.Scanner;

public class TowersOfHanoi {

    public static void TOH(int n, char A, char B, char C){


        if (n>0){
            TOH(n-1, A, C, B);
            System.out.println(A + " -> " + C);
            TOH(n-1, B, A, C);
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter number of discs:");
        n = scanner.nextInt();
        TOH(n, 'A', 'B', 'C');
    }

}
