import java.util.Scanner;

/**
 * Classe pour démarrer la bataille après confirmation
 */
public class StartBattle {

    public static void startBattle(Packemon userPackemon) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Es-tu prêt à commencer la bataille ? (oui/non)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("oui") || response.equals("yes")) {
            System.out.println("Bienvenue dans la bataille contre Zimon !");
            String opponentPackemon = "Bebs";
            System.out.println("Zimon invoque " + opponentPackemon + " !");
            System.out.println("Tu invoques " + userPackemon.getName() + " !");
            System.out.println("La bataille commence ! Prépare-toi...");
            // Ici, vous pouvez ajouter la logique de bataille plus tard
        } else {
            System.out.println("Bataille annulée. À bientôt !");
        }

        scanner.close();
    }
}