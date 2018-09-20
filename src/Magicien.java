public class Magicien extends Sorcier implements superPouvoir {

    public Magicien (float pdv, String name){super(pdv,name);}

    public float getPouvoir(){
        return pouvoir*extra;
    }

    public float sort(){
        return (float)Math.random();
    }

    public float subitCharme(float coup){
        return -sort()*coup;
    }
}
