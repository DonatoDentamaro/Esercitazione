import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner tastiera = new Scanner(System.in);

        System.out.println("Digitare un numero intero: ");
        int x = tastiera.nextInt();
        System.out.println("Digitare un numero intero positivo o uguale a zero:");
        int y = tastiera.nextInt();

        System.out.println("la potenza di "+ x+ " elevato alla " +y+ " è " + potenza(x,y));
    }



    static int potenza(int x , int y) {
        int p = x;
        for (int i = 1; i < y; i++) {
            p = p * x;
        }
        return p;
    }
}
