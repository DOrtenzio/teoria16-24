package azienda;

import java.util.ArrayList;
import java.util.Collections;

public class LibroPaga {
    private ArrayList<Dipendente> dipendenti;

    //Costruttore
    public LibroPaga() {
        this.dipendenti = new ArrayList<Dipendente>();
    }

    //get e set
    public ArrayList<Dipendente> getDipendenti() { return dipendenti; }
    public void setDipendenti(ArrayList<Dipendente> dipendenti) { this.dipendenti = dipendenti; }

    //Metodi
    public void aggiungiDipendente(Dipendente dipendente){ dipendenti.add(dipendente); }
    public String stampaDipendenti(){
        String s="DIPENDENTI: \n";
        for (int i=0; i< dipendenti.size();i++){
            s=s+dipendenti.get(i).toString()+"\n";
        }
        return s;
    }
    public String stampaInOrdineStipendio(){
        Collections.sort(dipendenti);
        return stampaDipendenti();
    }
    public void modificaStipendioBaseCPB(){
        for (int i=0; i< dipendenti.size();i++){
            if (dipendenti.get(i) instanceof  DipendenteCommissionePlusBase)
                ((DipendenteCommissionePlusBase) dipendenti.get(i)).setStipendioSettimanale(((DipendenteCommissionePlusBase) dipendenti.get(i)).getStipendioSettimanale()*1.1);
        }
    }
}
