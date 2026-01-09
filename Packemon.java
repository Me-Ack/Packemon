/**
    Différentes Packemons
    - Attacks
    - HP
    - Speed
 */

public class Packemon {
    
    public static void main(String[] args) {
        Choice choice = new Choice();
        String chosenPackemon = choice.choosePackemon();
        System.out.println("Le Packemon choisi est : " + chosenPackemon);
        // Maintenant, tu peux utiliser chosenPackemon dans ton jeu
    }
    
}
