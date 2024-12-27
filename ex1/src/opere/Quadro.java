package opere;

public class Quadro extends OperaDarte{
    private double altezza;
    private double larghezza;

    //Costruttore
    public Quadro(String titolo, String artista,double altezza,double larghezza) {
        super(titolo, artista);
        setAltezza(altezza);
        setLarghezza(larghezza);
    }

    //Get e set
    public double getAltezza() { return this.altezza; }
    public void setAltezza(double altezza) {
        if (altezza <=0)
            this.altezza = 1.0;
        else
            this.altezza = altezza;
    }
    public double getLarghezza() { return this.larghezza; }
    public void setLarghezza(double larghezza) {
        if (larghezza <=0)
            this.larghezza = 1.0;
        else
            this.larghezza = larghezza;
    }

    //Metodi
    @Override
    public double ingombro() {
        return this.altezza*this.larghezza;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Quadro){
            Quadro r=(Quadro) obj;
            return super.equals(r) && r.getAltezza() == this.altezza && r.getLarghezza() == this.larghezza;
        }
        return false;
    }
    @Override
    public String toString(){ return super.toString()+" Larghezza: "+this.larghezza+" Altezza: "+this.altezza; }
}
