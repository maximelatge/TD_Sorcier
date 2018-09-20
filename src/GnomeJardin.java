public class GnomeJardin extends NainJardin implements superPouvoir {

    public GnomeJardin(int solidity) {
        super(solidity);
    }

    public float sort() {
        return (float) Math.random() * solidity;
    }

    public float subitCharme(float coup){
        float riposte = sort();
        if(riposte>coup){
            return -coup;
        }
        else{
            return 0;
        }
    }
}
