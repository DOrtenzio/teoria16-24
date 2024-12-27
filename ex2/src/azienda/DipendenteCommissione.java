package azienda;

public class DipendenteCommissione extends Dipendente{
    private double vendite;
    private double percentualeVendita;

    //Costruttore
    public DipendenteCommissione(String nome, String cognome, String codiceFiscale, double vendite, double percentualeVendita) {
        super(nome, cognome, codiceFiscale);
        setVendite(vendite);
        setPercentualeVendita(percentualeVendita);
    }

    //get e set
    public double getVendite() { return vendite; }
    public void setVendite(double vendite) {
        if (vendite<0.0)
            this.vendite = 0.0;
        else
            this.vendite = vendite;
    }
    public double getPercentualeVendita() { return percentualeVendita; }
    public void setPercentualeVendita(double percentualeVendita) {
        if (percentualeVendita<=0)
            this.percentualeVendita = 10.0;
        else
            this.percentualeVendita = percentualeVendita;
    }

    //Metodi
    @Override
    public double paga() {
        return (vendite/100)*percentualeVendita;
    }
    @Override
    public String toString(){ return super.toString()+" Vendite: "+this.vendite+" percentuale su vendite: "+this.percentualeVendita; }
}
