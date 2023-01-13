
/**
 * La classe Ship possède un attribut privé name et une liste d'objets Pirate
 * appelée crew. Elle fournit des méthodes pour ajouter des pirates à l'équipage
 * et obtenir le nom du navire et son équipage.
 *
 * @Nicolas
 * @1
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Ship implements CombatStrategy{
    private String name;
    private ArrayList<Pirate> crew;
    private int butin;

    public Ship(String name) {
        this.name = name;
        this.butin = 500;
        this.crew = new ArrayList<Pirate>();
    }

    public String getName() {
        return this.name;
    }

    public void removePirate(Pirate pirate){
        crew.remove(pirate);
    }

    public void addPirate(Pirate pirate) {
        if (!pirate.isDead()){
            if (getButin()>=100){
                if(pirate.getShip()==null){
                    this.crew.add(pirate);
                    setButin(this.getButin()-100);
                    pirate.setShip(this);
                }
                else {
                    pirate.getShip().removePirate(pirate);
                    this.crew.add(pirate);
                    pirate.setShip(this);
                    setButin(this.getButin()-100);
                }
            }
        }
    }

    public ArrayList<Pirate> getCrew() {
        return this.crew;
    }

    public int getButin() {
        return this.butin;
    }

    public void setButin(int butin) {
        this.butin = butin;
    }

    public String fight(CombatStrategy other) {
        if (other instanceof Ship) {
            Ship ship = (Ship) other;
            // Le premier navire gagne la bataille
            if (this.getCrew().size() > ship.getCrew().size()) {
                // Il remporte le butin de l'autre bateau
                this.setButin(this.getButin() + ship.getButin());
                ship.setButin(0);
                // l'age des pirates augmente
                for (Pirate pirate : this.getCrew()) {
                    pirate.setAge(pirate.getAge() + 1);
                }
                for (Pirate pirate : ship.getCrew()) {
                    pirate.setAge(pirate.getAge() + 1);
                }
                ship.removeDeadPirates();
                this.removeDeadPirates();
                return "gagne";
            }
            // Le deuxième navire gagne la bataille
            else if (this.getCrew().size() < ship.getCrew().size()) {
                // il remporte le butin de l'autre bateau
                ship.setButin(ship.getButin() + this.getButin());
                this.setButin(0);
                for (Pirate pirate : this.getCrew()) {
                    pirate.setAge(pirate.getAge() + 1);
                }
                for (Pirate pirate : ship.getCrew()) {
                    pirate.setAge(pirate.getAge() + 1);
                }
                ship.removeDeadPirates();
                this.removeDeadPirates();
                return "perdu";
            }
            else {
                // Les deux navires ont le même nombre de pirates, c'est donc une égalité.
                return "egalité";
            }

        }
        return "Invalid opponent";
    }

    public void removeCaptainPirate(){
        this.crew.remove(0);
    }

    public void removeDeadPirates() {
        Iterator<Pirate> iterator = this.crew.iterator();
        while (iterator.hasNext()) {
            Pirate pirate = iterator.next();
            if (pirate.isDead()) {
                iterator.remove();
            }
        }
    }
}
