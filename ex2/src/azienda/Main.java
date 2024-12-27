package azienda;

public class Main {
    public static void main(String[] args) {
        LibroPaga libroPaga = new LibroPaga();

        // Creazione di vari dipendenti
        Dipendente dipendente1 = new DipendenteStipendiato("Mario", "Rossi", "RSSMRA80A01H501Z", 500);
        Dipendente dipendente2 = new DipendenteOrario("Luisa", "Bianchi", "BNCLOS75B50H501Y", 15, 45);
        Dipendente dipendente3 = new DipendenteCommissione("Carlo", "Verdi", "VRDCRL60C15H501X", 1000, 0.2);
        Dipendente dipendente4 = new DipendenteCommissionePlusBase("Anna", "Neri", "NRNNNA85D20H501W", 300, 0.1, 1500);

        // Aggiunta dei dipendenti al libro paga
        libroPaga.aggiungiDipendente(dipendente1);
        libroPaga.aggiungiDipendente(dipendente2);
        libroPaga.aggiungiDipendente(dipendente3);
        libroPaga.aggiungiDipendente(dipendente4);

        // Stampa delle informazioni di tutti i dipendenti
        System.out.println("\nInformazioni dei dipendenti:");
        System.out.println(libroPaga.stampaDipendenti());

        // Modifica dello stipendio base dei dipendenti su commissione con stipendio base
        System.out.println("\nModifica dello stipendio base del 10% per i dipendenti su commissione con stipendio base:");
        libroPaga.modificaStipendioBaseCPB();

        // Stampa delle informazioni di tutti i dipendenti dopo la modifica
        System.out.println("\nInformazioni aggiornate dei dipendenti:");
        System.out.println(libroPaga.stampaDipendenti());

        // Stampa delle informazioni dei dipendenti in ordine di stipendio
        System.out.println("\nInformazioni dei dipendenti ordinate per stipendio:");
        System.out.println(libroPaga.stampaInOrdineStipendio());
    }
}