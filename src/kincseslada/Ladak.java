
package kincseslada;


public class Ladak {
    private String nev;
    private String felirat;
    private int kincs;
    
    Ladak(String nev,String felirat, int kincs){
        this.nev=nev;
        this.felirat=felirat;
        this.kincs=kincs;
    }

    public String getNev() {
        return nev;
    }

    public String getFelirat() {
        return felirat;
    }

    public int getKincs() {
        return kincs;
    }
    
    @Override
    public String toString(){
        return getNev()+":"+ getFelirat();
    }
    
    
}
