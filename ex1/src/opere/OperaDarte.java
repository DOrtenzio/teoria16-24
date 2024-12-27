package opere;

public abstract class OperaDarte {
    private String titolo;
    private String artista;

    //Costruttore
    public OperaDarte(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
    }

    //get e set
    public String getTitolo() { return this.titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }
    public String getArtista() { return this.artista; }
    public void setArtista(String artista) { this.artista = artista; }

    //Metodi
    public abstract double ingombro();
    @Override
    public boolean equals(Object obj){
        if (obj instanceof OperaDarte){
            OperaDarte r=(OperaDarte) obj;
            return this.titolo.equalsIgnoreCase(r.getTitolo()) && this.artista.equalsIgnoreCase(r.getArtista());
        }
        return false;
    }
    @Override
    public String toString(){ return "OPERA D'ARTE: Titolo: "+this.titolo+" Artista: "+this.artista; }
}
