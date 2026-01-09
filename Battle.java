/**
    Gère les batailles entre deux Packemons
    - Opponents Ai
*/

import java.util.Scanner;

public class Battle {
 Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // L'utilisateur choisit son Packemon
        Choice choice = new Choice();
        String userPackemon = choice.choosePackemon();

        System.out.println("Bienvenue dans la bataille contre Zimon !");

        // Zimon invoque Bebs
        String opponentPackemon = "Bebs";
        System.out.println("Zimon invoque " + opponentPackemon + " !");
        System.out.println("Tu invoques " + userPackemon + " !");

        // La bataille commence (logique à ajouter plus tard)
        System.out.println("La bataille commence ! Prépare-toi...");
    }
}
