package azienda;

public class DipendenteStipendiato extends Dipendente{
    private double stipendioSettimanale;

    //Costruttore
    public DipendenteStipendiato(String nome, String cognome, String codiceFiscale, double stipendioSettimanale) {
        super(nome, cognome, codiceFiscale);
        setStipendioSettimanale(stipendioSettimanale);
    }

    //get e set
    public double getStipendioSettimanale() { return stipendioSettimanale; }
    public void setStipendioSettimanale(double stipendioSettimanale) {
        if (stipendioSettimanale <= 0 )
            this.stipendioSettimanale = 0.0;
        else
            this.stipendioSettimanale = stipendioSettimanale;
    }

    //Metodi
    @Override
    public double paga() { return this.stipendioSettimanale; }
    @Override
    public String toString(){ return super.toString()+" Stipendio settimanale: "+this.stipendioSettimanale; }
}
