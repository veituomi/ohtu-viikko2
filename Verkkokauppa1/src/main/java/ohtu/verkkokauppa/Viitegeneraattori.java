package ohtu.verkkokauppa;

public class Viitegeneraattori implements ViitegeneraattoriPinta {
    
    private int seuraava;
    
    public Viitegeneraattori(){
        seuraava = 1;    
    }
    
    public int uusi(){
        return seuraava++;
    }
}
