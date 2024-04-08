public class Lampe {

    private String nom;
    private boolean allume;

    public Lampe(String nom) {
        if (nom == null)
            nom = "Inconnu";
        this.nom = nom;
        this.allume = false;
    }

    public void allumer() {
        this.allume = true;
    }

    public void eteindre() {
        this.allume = false;
    }

    public String toString() {
        return "Nom : " + this.nom + " etat : " + this.allume;
    }

}
