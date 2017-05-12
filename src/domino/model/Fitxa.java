package domino.model;

public class Fitxa {

    private int[] valors;

    public Fitxa(int[] valors) {
        this.valors = valors;
    }

    public int[] getValors() {
        return valors;
    }

    /**
     * Es permuten els valors de la fitxa.
     */
    public void canviarOrientacio() {
        int aux = valors[0];
        valors[0] = valors[1];
        valors[1] = aux;
    }

    public void setValors(int[] valors) {
        this.valors = valors;
    }

    
    
    @Override
    public String toString() {
        return "[" + valors[0] + "," + valors[1] + ']';
    }
    

}
