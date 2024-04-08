import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;
    private List<Hifi> chaines;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
        this.chaines = new ArrayList<Hifi>();
    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void ajouterChaine(Hifi h) {
        this.chaines.add(h);
    }

    public void activerLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).allumer();
    }

    public void activerChaine(int indiceChaine) {
        this.chaines.get(indiceChaine).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).eteindre();
    }

    public void desactiverChaine(int indiceChaine) {
        this.chaines.get(indiceChaine).eteindre();
    }

    public void activerTout() {
        for (Lampe l : this.lampes)
            l.allumer();
        for (Hifi h : this.chaines)
            h.allumer();
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Lampes : ");
        for (Lampe l : this.lampes) {
            str.append(l.toString());
            str.append("\n");
        }
        str.append("Hifi : ");
        for (Hifi h : this.chaines) {
            str.append(h.toString());
            str.append("\n");
        }
        return new String(str);
    }
}
