package testUnitaire;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test TestOnepiece.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class TestOnePiece
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    protected double fValeur1;
    protected double fValeur2;

    /**
     * Constructeur de la classe-test TestOnepiece
     */
    public TestOnePiece()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        fValeur1= 2.0;
        fValeur2= 3.0;
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void AddPirateTest()
    {
        Pirate pirate1 = new Pirate("luffy", 15);
        Ship ship1 = new Ship("merry");
        int butin = ship1.getButin();
        ship1.addPirate(pirate1);
        assertEquals(100, butin - ship1.getButin());
    }

    @Test
    public void AddPirateFromAnotherCrewTest()
    {
        Pirate pirate1 = new Pirate("luffy", 15);
        Ship ship1 = new Ship("merry");
        Ship ship2 = new Ship("merry");
        int butin = ship2.getButin();
        ship1.addPirate(pirate1);
        ship2.addPirate(pirate1);
        assertEquals(100, butin - ship2.getButin());
        assertEquals(ship2.getCrew().contains(pirate1), true);
        assertEquals(ship1.getCrew().contains(pirate1), false);
    }

    @Test
    public void BattleTest()
    {
        Pirate pirate1 = new Pirate("luffy", 15);
        Pirate pirate2 = new Pirate("luffy", 15);
        Pirate pirate3 = new Pirate("luffy", 99);
        Pirate pirate4 = new Pirate("mama", 15);
        Pirate pirate5 = new Pirate("luffy", 99);
        Ship ship1 = new Ship("merry");
        Ship ship2 = new Ship("merry");
        ship1.addPirate(pirate1);
        ship1.addPirate(pirate2);
        ship1.addPirate(pirate3);
        ship2.addPirate(pirate4);
        ship2.addPirate(pirate5);
        ship1.setButin(100);
        ship2.setButin(150);
        ship1.fight(ship2);
        assertEquals(250, ship1.getButin());
        assertEquals(0, ship2.getButin());
        assertEquals(pirate1.getAge(), 16);
        assertEquals(pirate2.getAge(), 16);
        assertEquals(pirate3.isDead(), true);
        assertEquals(pirate4.getAge(), 16);
        assertEquals(pirate5.isDead(), true);
        assertEquals(ship1.getCrew().contains(pirate3), false);
        assertEquals(ship1.getCrew().size()==2, true);
        assertEquals(ship2.getCrew().contains(pirate5), false);
        assertEquals(ship2.getCrew().size()==1, true);

    }
}
