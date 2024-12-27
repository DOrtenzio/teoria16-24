package opere;

import java.util.ArrayList;

public class Collezione {
    private String nome;
    private String luogo;
    private ArrayList <OperaDarte> collezione;

    //Costruttore
    public Collezione(String nome, String luogo) {
        this.nome = nome;
        this.luogo = luogo;
        this.collezione=new ArrayList<OperaDarte>();
    }

    //Get e set
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLuogo() { return luogo; }
    public void setLuogo(String luogo) { this.luogo = luogo; }
    public ArrayList<OperaDarte> getCollezione() { return collezione; }
    public void setCollezione(ArrayList<OperaDarte> collezione) { this.collezione = collezione; }

    //Metodi
    public void inserisci(OperaDarte operaDarte){ this.collezione.add(operaDarte); }
    public OperaDarte getOpera(int index){ return this.collezione.get(index); }
    public void stampaOpere(){
        System.out.println("OPERE DELLA COLLEZIONE: ");
        for (int i=0; i<this.collezione.size();i++) {
            System.out.println(this.collezione.get(i).toString());
        }
    }
}
