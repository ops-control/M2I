import java.util.Scanner;
import java.util.Random;

public class Ex1At7{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String numero1;
        int numero=1;

        while(numero!=0){

            System.out.println("Lancer la piece en appuyant sur entree : ");
            numero1= scan.nextLine();
            Random rand =new Random();
            int piece=rand.nextInt(1);
            switch (piece) {
                case 0:
                    System.out.println("Vous etes tombé sur pile ");
                    break;
                case 1:
                    System.out.println("Vous etes tombé sur face ");    
                    break;
                default:
                    System.out.println("heu je ne pense pas que ca soit une piece ");    
                    break;
            }

            System.out.println("Entre 0 pour arrter!!!");
            numero= scan.nextInt();

        }

    }
}


