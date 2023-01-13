public class Gaulois implements CombatStrategy, CommandPattern {
    private int taille;
    private String nom;
    public Gaulois(int taille, String nom)
    {
        // initialisation des variables d'instance
        this.taille = taille;
        this.nom = nom;
    }
    public String command(int nourriture)
    {
        taille+=nourriture;
        return "miam miam bien mangé";
    }
    public void setTaille(int taille) {
        if (taille > 0) {
            this.taille = taille;
        }
    }
    public int getTaille(){
        return taille;
    }
    public String getNom(){
        return this.nom;
    }
    public String fight(CombatStrategy other) {
        if (other instanceof Legion) {
            Legion legion = (Legion) other;
            if(this.taille > legion.getnombre()*10) {
                return "gagne";
            }
            return "perdu";
        }
        if (other instanceof Ship) {
            Ship ship = (Ship) other;
            if(this.taille > ship.getCrew().size()*10) {
                ship.removeCaptainPirate();
                return "gagne";
            }
            return "perdu";
        }
        return "Invalid opponent";
    }

}
