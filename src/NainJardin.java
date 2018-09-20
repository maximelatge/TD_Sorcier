public class NainJardin implements Victime {

    protected int solidity;

    public NainJardin(int solidity){
        this.solidity = solidity;
    }

    public float subitFrappe(float coup){
        if(coup>solidity){
            int temp = solidity;
            solidity = 0;
            return -temp;
        }
        else{
            return -coup;
        }
    }

    public float subitCharme(float coup){
        return -1;
    }

}
