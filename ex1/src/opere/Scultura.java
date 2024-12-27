package opere;

public class Scultura extends OperaDarte{
    private double altezza;
    private double larghezza;
    private double profondita;

    //Costruttore
    public Scultura(String titolo, String artista,double altezza,double larghezza,double profondita) {
        super(titolo, artista);
        setAltezza(altezza);
        setLarghezza(larghezza);
        setProfondita(profondita);
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
    public double getProfondita() { return this.profondita; }
    public void setProfondita(double profondita) {
        if (profondita <=0)
            this.profondita = 1.0;
        else
            this.profondita = profondita;
    }

    //Metodi
    @Override
    public double ingombro() {
        return this.altezza*this.larghezza*this.profondita;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Scultura){
            Scultura r=(Scultura) obj;
            return super.equals(r) && r.getAltezza() == this.altezza && r.getLarghezza() == this.larghezza && this.profondita == r.getProfondita();
        }
        return false;
    }
    @Override
    public String toString(){ return super.toString()+" Larghezza: "+this.larghezza+" Altezza: "+this.altezza+" Profondità: "+this.profondita; }
}
