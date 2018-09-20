public class Monstre extends Personnage {

    public Monstre(float pdv, String name){
        super(pdv,name);
    }

    public void attaque(Victime p){
        if(this.mort()){
            float coup = (this.pdv/2);
            this.addVie(p.subitFrappe(coup));
        }
    }

    public float subitFrappe(float coup){
        this.addVie(-coup);
        if(this.mort()) {
            return (-this.pdv / 2);
        }
        else{
            return 0;
        }
    }

    public float subitCharme(float coup){
        this.addVie(-coup);
        if(this.mort()) {
            return (this.pdv / 2);
        }
        else{
            return 0;
        }
    }
}
