public class Legion implements CombatStrategy, CommandPattern {
    private int nb_soldats;
    private String nom;

    public Legion(int nb_soldats, String nom) {
        // initialisation des variables d'instance
        this.nb_soldats = nb_soldats;
        this.nom = nom;
    }

    public String command(int legionnaires) {
        nb_soldats += legionnaires;
        return "nous sommes les legionnaires!!!";
    }

    public void setnombre(int nombre) {
        if (nombre > 0) {
            this.nb_soldats = nombre;
        }
    }

    public String getnom() {
        return nom;
    }

    public int getnombre() {
        return this.nb_soldats;
    }

    public String fight(CombatStrategy other) {
        if (other instanceof Gaulois) {
            Gaulois gaulois = (Gaulois) other;
            if (this.nb_soldats > gaulois.getTaille() / 10) {
                return "gagne";
            }
            return "perdu";
        }
        return "Invalid opponent";
    }
}
