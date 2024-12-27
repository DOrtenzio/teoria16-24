package azienda;

public abstract class Dipendente implements Comparable<Dipendente>{
    private String nome;
    private String cognome;
    private String codiceFiscale;

    //Costruttore
    public Dipendente(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    //Get e set
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public String getCodiceFiscale() { return codiceFiscale; }
    public void setCodiceFiscale(String codiceFiscale) { this.codiceFiscale = codiceFiscale; }

    //Metodi
    @Override
    public String toString(){ return "Dipendente: "+this.nome+"  "+this.cognome+" - "+this.codiceFiscale+" Paga settimana corrente: "+this.paga()+"   "; }
    @Override
    public int compareTo(Dipendente dipendente){
        if(this.paga() < dipendente.paga())
            return -1;
        else if (this.paga() == dipendente.paga())
            return  0;
        else
            return 1;
    }
    public abstract double paga();
}
