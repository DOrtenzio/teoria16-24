package azienda;

public class DipendenteOrario extends Dipendente{
    private double tariffaOraria;
    private int oreLavorate;

    //Costruttore
    public DipendenteOrario(String nome, String cognome, String codiceFiscale, double tariffaOraria, int oreLavorate) {
        super(nome, cognome, codiceFiscale);
        setTariffaOraria(tariffaOraria);
        setOreLavorate(oreLavorate);
    }

    //get e set
    public int getOreLavorate() { return oreLavorate; }
    public void setOreLavorate(int oreLavorate) {
        if (oreLavorate<0)
            this.oreLavorate = 0;
        else
            this.oreLavorate = oreLavorate;
    }
    public double getTariffaOraria() { return tariffaOraria; }
    public void setTariffaOraria(double tariffaOraria) {
        if (tariffaOraria<=0)
            this.tariffaOraria = 8.0;
        else
            this.tariffaOraria = tariffaOraria;
    }

    //Metodi
    @Override
    public double paga() {
        if (oreLavorate>40)
            return tariffaOraria*oreLavorate+tariffaOraria*(oreLavorate-40);
        else
            return tariffaOraria*oreLavorate;
    }
    @Override
    public String toString(){ return super.toString()+" Tariffa oraria: "+this.tariffaOraria+" Ore lavorate: "+this.oreLavorate; }
}
