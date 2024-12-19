import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*class Carte{
    private int valeur;
    public Carte (int valeur){
        this.valeur=valeur;
    }
    public void setValeur(int v){
        this.valeur=v;
    }
    public int getValeur(){
        return valeur;
    }
}*/


class Joueur{
    private List<Integer> pioches;
    public Joueur(){
        this.pioches= new ArrayList<>();
    }

    public void pioche(int c){
        pioches.add(c);
    }

    public int somme(){
        int somme=0;
        for(int car: pioches){
            somme+=car;
        }
        return somme;
    }

    public int retourner(){
        
    }

    private void choixAs(){
        System 

    }
}

class Croupier extends Joueur{

}


public class Blackjack{
    public static void main(String[] args) {

        System.out.println("Le Blackjack....");
        System.out.println("Premier tirage");
        Random rand = new Random(); 

        int x = rand.nextInt(13)+1;

        int x = rand.nextInt(13)+1;
        int x = rand.nextInt(13)+1;
        int x = rand.nextInt(13)+1;

        while(gagant || sommeC<=21 || sommeJ<=21 ){

        }
    }
}