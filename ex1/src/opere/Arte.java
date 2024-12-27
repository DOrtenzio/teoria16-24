package opere;

public class Arte{
    public static void main (String args []) {
        //collezione
        Collezione c=new Collezione("Rockfeller","Los Angeles");
        //opere
        Quadro q1=new Quadro("natura morta","picasso",200,100);
        Quadro q2=new Quadro("paesaggio","mantegna",150,100);
        Scultura s1=new Scultura("david","donatello",150,100,200);
        c.inserisci(q1);//inserimento
        c.inserisci(q2);
        c.inserisci(s1);
        c.stampaOpere( );//stampa opere
        System.out.println(c.getOpera(0).ingombro());//ingombro di q1
        System.out.println(c.getOpera(2).ingombro());///ingombro di s1
        System.out.println(c.getOpera(0).equals(c.getOpera(1)));//comparazione

    }
}