import java.lang.Math;

public class Sorcier extends Personnage {

    protected float pouvoir = (float)Math.random();

    public Sorcier(float pdv, String name){
        super(pdv,name);
    }

    public void attaque(Victime p){
        if(this.mort()){
            float coup = this.pdv*getPouvoir();
            this.addVie(p.subitCharme(coup));
        }
    }
    public float subitFrappe(float coup){
        this.addVie(-coup);
        if(this.mort()) {
            return (-this.pdv*pouvoir);
        }
        else{
            return 0;
        }
    }
    public float subitCharme(float coup){
        return 0;
    }

    public float getPouvoir(){
        return pouvoir;
    }
}
