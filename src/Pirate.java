/**
 * La classe Pirate possède deux attributs privés : name et age.
 * Elle fournit des méthodes d'accès en lecture pour ces attributs.
 *
 * @Nicolas
 * @1
 */
public class Pirate implements CombatStrategy {
    private String name;
    private int age;
    private Ship ship;

    public Pirate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public boolean isDead() {
        return this.age >= 100;
    }

    public String fight(CombatStrategy other) {
        return "Les pirates ne peuvent pas se battre";
    }


}
