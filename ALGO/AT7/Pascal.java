import java.util.Scanner;


public class Pascal{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int taille = scan.nextInt();
        scan.close();
        int tab[][]=new int[taille][taille];
        for (int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                tab[i][j]=0;
            }
        }


        tab[0][1]=1;
        for(int i=1;i<taille;i++){
            for(int j=1;j<taille;j++){
                tab[i][j]=tab[i-1][j]+tab[i-1][j-1];

            }
        }
        for (int i=1;i<taille;i++){
            for(int j=1;j<(i+j);j++){
                System.out.print(tab[i][j]+" ");
            }
            System.out.print("\n");

        }

    }
}