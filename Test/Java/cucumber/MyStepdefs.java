package cucumber;


public class MyStepdefs {
    @io.cucumber.java.en.Given("Un Gaulois de taille {int} et une Légion de {int} soldats")
    public void unGauloisDeTailleEtUneLégionDeSoldats(int arg0, int arg1) {
    }

    @io.cucumber.java.en.When("Le Gaulois et la Légion se battent")
    public void leGauloisEtLaLégionSeBattent() {
    }

    @io.cucumber.java.en.Then("Le Gaulois gagne le combat")
    public void leGauloisGagneLeCombat() {
    }

    @io.cucumber.java.en.Given("Une Légion avec {int} soldats")
    public void uneLégionAvecSoldats(int arg0) {
    }

    @io.cucumber.java.en.When("La Légion recrute {int} soldats")
    public void laLégionRecruteSoldats(int arg0) {
    }

    @io.cucumber.java.en.Then("Le nombre de soldats de la Légion augmente de {int} pour atteindre {int}")
    public void leNombreDeSoldatsDeLaLégionAugmenteDePourAtteindre(int arg0, int arg1) {
    }

    @io.cucumber.java.en.Given("Un navire avec un butin de {int} pièces d'or")
    public void unNavireAvecUnButinDePiècesDOr(int arg0) {
    }

    @io.cucumber.java.en.When("Un pirate âgé de {int} ans est ajouté au navire")
    public void unPirateÂgéDeAnsEstAjoutéAuNavire(int arg0) {
    }

    @io.cucumber.java.en.Then("Le nombre de pirates à bord du navire augmente de {int} et le butin du navire diminue de {int} pièces d'or donc le butin est maintenant de {int} pièces d’or")
    public void leNombreDePiratesÀBordDuNavireAugmenteDeEtLeButinDuNavireDiminueDePiècesDOrDoncLeButinEstMaintenantDePiècesDOr(int arg0, int arg1, int arg2) {
    }

    @io.cucumber.java.en.Given("Un navire {int} avec un équipage de {int} pirates et un navire {int} avec un équipage de {int} pirates")
    public void unNavireAvecUnÉquipageDePiratesEtUnNavireAvecUnÉquipageDePirates(int arg0, int arg1, int arg2, int arg3) {
    }

    @io.cucumber.java.en.When("Les deux navires se battent")
    public void lesDeuxNaviresSeBattent() {
    }

    @io.cucumber.java.en.Then("Le navire {int} gagne le combat et remporte le butin du navire {int}")
    public void leNavireGagneLeCombatEtRemporteLeButinDuNavire(int arg0, int arg1) {
    }

    @io.cucumber.java.en.Given("Un Gaulois de taille {int} et un navire avec un équipage de {int} pirates")
    public void unGauloisDeTailleEtUnNavireAvecUnÉquipageDePirates(int arg0, int arg1) {
    }

    @io.cucumber.java.en.When("Le Gaulois et le navire se battent")
    public void leGauloisEtLeNavireSeBattent() {
    }

    @io.cucumber.java.en.Then("Le Gaulois gagne le combat et le capitaine pirate est enlevé du navire")
    public void leGauloisGagneLeCombatEtLeCapitainePirateEstEnlevéDuNavire() {
    }
}
