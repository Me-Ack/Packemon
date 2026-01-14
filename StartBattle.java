import java.util.Scanner;

/**
 * Classe pour démarrer la bataille après confirmation
 */
public class StartBattle {

    public static void startBattle(Packemon userPackemon) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Es-tu prêt à commencer la bataille ? (oui/non)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("oui")) {
            Packemon opponent = Packemon.createPackemon("bebs");
            System.out.println("Bienvenue dans la bataille contre Zimon !");
            System.out.println("Zimon invoque " + opponent.getName() + " !");
            System.out.println("Tu invoques " + userPackemon.getName() + " !");
            System.out.println("La bataille commence ! Prépare-toi...");

            boolean userTurn = userPackemon.getSpeed() >= opponent.getSpeed();
            while (userPackemon.getHp() > 0 && opponent.getHp() > 0) {
                if (userTurn) {
                    // Ton tour
                    System.out.println("Ton tour ! Choisis un mouvement:");
                    String move1, move2;
                    if (userPackemon.getName().equals("Saungikar")) {
                        move1 = "1. Regen (+30 HP)";
                        move2 = "2. Attack (30 damage)";
                    } else if (userPackemon.getName().equals("Gingras")) {
                        move1 = "1. Attack (40 damage)";
                        move2 = "2. Lower opponent speed (-10)";
                    } else { // Kasha-Blois
                        move1 = "1. Attack (35 damage)";
                        move2 = "2. Boost speed (+10)";
                    }
                    System.out.println(move1);
                    System.out.println(move2);
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        if (userPackemon.getName().equals("Saungikar")) {
                            userPackemon.setHp(userPackemon.getHp() + 30);
                            System.out.println(userPackemon.getName() + " se regenere ! HP: " + userPackemon.getHp());
                        } else if (userPackemon.getName().equals("Gingras")) {
                            opponent.setHp(opponent.getHp() - 40);
                            if (opponent.getHp() < 0) opponent.setHp(0);
                            System.out.println(userPackemon.getName() + " attaque ! " + opponent.getName() + " HP: " + opponent.getHp());
                        } else {
                            opponent.setHp(opponent.getHp() - 35);
                            if (opponent.getHp() < 0) opponent.setHp(0);
                            System.out.println(userPackemon.getName() + " attaque ! " + opponent.getName() + " HP: " + opponent.getHp());
                        }
                    } else if (choice == 2) {
                        if (userPackemon.getName().equals("Saungikar")) {
                            opponent.setHp(opponent.getHp() - 30);
                            if (opponent.getHp() < 0) opponent.setHp(0);
                            System.out.println(userPackemon.getName() + " attaque ! " + opponent.getName() + " HP: " + opponent.getHp());
                        } else if (userPackemon.getName().equals("Gingras")) {
                            opponent.setSpeed(opponent.getSpeed() - 10);
                            System.out.println(userPackemon.getName() + " baisse la vitesse de " + opponent.getName() + " ! Speed: " + opponent.getSpeed());
                        } else {
                            userPackemon.setSpeed(userPackemon.getSpeed() + 10);
                            System.out.println(userPackemon.getName() + " boost sa vitesse ! Speed: " + userPackemon.getSpeed());
                        }
                    }
                } else {
                    // Opponent turn
                    System.out.println("Tour de " + opponent.getName() + " !");
                    userPackemon.setHp(userPackemon.getHp() - 25);
                    if (userPackemon.getHp() < 0) userPackemon.setHp(0);
                    System.out.println(opponent.getName() + " attaque ! Ton HP: " + userPackemon.getHp());
                }
                userTurn = !userTurn;
            }
            if (userPackemon.getHp() > 0) {
                System.out.println("Tu as gagné !");
            } else {
                System.out.println("Tu as perdu !");
            }
        } else {
            System.out.println("Bataille annulée. À bientôt !");
        }

        scanner.close();
    }
}