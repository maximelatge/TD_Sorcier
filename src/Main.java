import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        int runflag = 0;
        //test

        if(runflag==0){

        Personnage[] warfield = new Personnage[10];
        String[] noms = new String[10];
        noms[0]="Patrick"; noms[1]="Cédric";noms[2]="Saruman";noms[3]="Maxime";noms[4]="Sam";noms[5]="Melvin";noms[6]="Roger";noms[7]="Jacques";noms[8]="DarthMaul";noms[9]="Maurice";

        for(int i=0; i<5; i=i+1){
            warfield[i] = new Monstre(100*(float)Math.random(), noms[i]);
        }
        for(int i=5; i<10; i=i+1){
            warfield[i] = new Sorcier(100*(float)Math.random(), noms[i]);
        }

        int nbmort = 0;

        while(nbmort<9){  //Condition d'arrêt

            int a = (int)(10*Math.random());
            while(!warfield[a].mort()){
                a = (int)(10*Math.random());
            }
            int b = (int)(10*Math.random());
            while(b==a || !warfield[b].mort()){
                b = (int)(10*Math.random());         //Choix des deux combattants: différents et vivants
            }

            warfield[a].attaque(warfield[b]);

            if(!warfield[a].mort()){
                nbmort++;
                System.out.println(warfield[a]);
            }

            if(!warfield[b].mort()){
                nbmort++;
                System.out.println(warfield[b]);
            }

        }

        System.out.println("\nIl y a eu " + nbmort + " morts.");

        for(int i=0; i<10; i=i+1){
            if(warfield[i].mort()){
                System.out.println("Je m'appelle " + warfield[i].getNom() + " et j'ai gagné avec " + warfield[i].getVie() + " points de vies." );
            }
        }}

        else{

            Magicien ma1 = new Magicien(100,"Joe");
            Magicien ma2 = new Magicien(100,"Jack");

            ma1.attaque(ma2);

            NainJardin n1 = new NainJardin(50);
            Monstre mo1 = new Monstre(50,"Patrick");
            Monstre mo2 = new Monstre(150,"Phill");

            ma2.attaque(n1);

            mo1.attaque(n1);

            mo2.attaque(n1);

            System.out.println(ma2+"\n"+mo1+"\n"+mo2);


        }


    }
}
