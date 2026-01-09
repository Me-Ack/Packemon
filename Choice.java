/**
    Choisi entre 3 packemons
*/
import java.util.Scanner;

public class Choice {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Choice choice = new Choice();
        System.out.println("Bonjour, bienvenue sur Packemon !");
        choice.choosePackemon();
    }

    public String choosePackemon() {
        System.out.println("Choisis ton Packemon :");
        System.out.println("1. Saungikar");
        System.out.println("2. Kasha-Blois");
        System.out.println("3. Gingras");

        int choice = -1;
        while (true) {
            System.out.print("Entrez le numéro (1-3) : ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Choix invalide, veuillez entrer 1, 2 ou 3.");
                }
            } else {
                String bad = scanner.next();
                System.out.println("Entrée invalide : '" + bad + "'. Réessaie.");
            }
        }
        
        String name;
        if (choice == 1) {
            name = "Saungikar";
        } else if (choice == 2) {
            name = "Kasha-Blois";
        } else {
            name = "Gingras";
        }
        System.out.println("Tu as choisi : " + name + " Packemon !");
        return name;
    }
}