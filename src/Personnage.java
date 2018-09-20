public abstract class Personnage implements Victime {

    protected float pdv;
    protected String name;

    public Personnage(float pdv, String name){
        this.pdv = pdv;
        this.name = name;
    }

    public void afficher(){
        if(this.mort()){
            System.out.println("Je m'appelle " + this.name + " et j'ai " + this.pdv + " points de vie.");
        }
        else{
            System.out.println(this.name + " est mort");
        }
    }

    public String toString(){
        if(this.mort()){
            return("Je m'appelle " + this.name + " et j'ai " + this.pdv + " points de vie.");
        }
        else{
            return (this.name + " est mort");
        }
    }

    public String getNom(){
        return this.name;
    }
    public boolean mort(){
        return this.pdv>0;
    }    //return true si vivant et false si mort.
    public float getVie(){
        return this.pdv;
    }

    public void addVie(float num){
        this.pdv += num;
    }
    public abstract void attaque(Victime p);

}