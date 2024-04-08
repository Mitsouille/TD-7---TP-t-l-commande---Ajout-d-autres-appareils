import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void activerLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe l : this.lampes)
            l.allumer();
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Lampe l : this.lampes) {
            str.append(l.toString());
            str.append("\n");
        }
        return new String(str);
    }
}
