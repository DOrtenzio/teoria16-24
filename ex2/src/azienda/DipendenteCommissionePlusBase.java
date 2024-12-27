package azienda;

public class DipendenteCommissionePlusBase extends DipendenteCommissione{
    private double stipendioSettimanale;

    //Costruttore
    public DipendenteCommissionePlusBase(String nome, String cognome, String codiceFiscale, double vendite, double percentualeVendita, double stipendioSettimanale) {
        super(nome, cognome, codiceFiscale, vendite, percentualeVendita);
       setStipendioSettimanale(stipendioSettimanale);
    }

    //get e set
    public double getStipendioSettimanale() { return stipendioSettimanale; }
    public void setStipendioSettimanale(double stipendioSettimanale) {
        if (stipendioSettimanale <= 0 )
            this.stipendioSettimanale = 100.0;
        else
            this.stipendioSettimanale = stipendioSettimanale;
    }

    //Metodi
    @Override
    public double paga() { return super.paga()+this.stipendioSettimanale; }
    @Override
    public String toString(){ return super.toString()+" Stipendio settimanale: "+this.stipendioSettimanale; }
}
