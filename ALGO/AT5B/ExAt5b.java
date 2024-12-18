import java.util.Scanner;

public class ExAt5b{
    public static void main(String[] args) {

        char[][] tab= new char[26][26];
        StringBuilder mot= new StringBuilder();
        Scanner scan= new Scanner(System.in);
        System.out.println("Entrer un la phrase a chiffrer : ");
        String chiffrer=scan.nextLine();
        System.out.println("Entrer un la clé: ");
        String cle=scan.nextLine();
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                if (('A'+j+i)<91){
                    tab[i][j]=(char)('A'+j+i);
                }
                else{
                    tab[i][j]=(char)((('A'+j+i)%91)+'A');
                }
            }
        }
        for(int i=0;i<chiffrer.length();i++){
            char c=chiffrer.charAt(i);
            char ch=cle.charAt(i%cle.length());
            mot.append(tab[ch- 'A'][c- 'A']);

        }



        System.out.println(mot.toString());
    
    }        
}    
     