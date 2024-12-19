import java.util.Scanner;

public class Ex6At6{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Entrer un l'operande 1 : ");
        numero1= scan.nextInt();
        System.out.println("Entrer un l'operande 2 : ");
        numero2= scan.nextInt();


        System.out.println("addition : "+addition(numero1,numero2));
        System.out.println("Soustraction : "+soustraction(numero1,numero2));
        System.out.println("EMultiplication : "+multiplication(numero1, numero2));
        System.out.println("division : "+division(numero1,numero2));



    }
    public static int addition(int op1,int op2){
        return op1+op2;
    }
    public static int soustraction(int op1,int op2){
        return op1-op2;
    }

    public static int multiplication(int op1,int op2){
        return op1*op2;
    }

    public static double division(int op1,int op2){
        return (double)op1/op2;
    }

}

