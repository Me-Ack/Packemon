/**
    Choisi entre 3 packemons
*/

import java.util.Scanner;

public class Choice {
    static Scanner sc = new Scanner(System.in);
    public static String choosePackemon() {
        
        System.out.println("Choose a Packemon:");
        System.out.println("1. Saungikar");
        System.out.println("2. Gingras");
        System.out.println("3. Kasha-Blois");
        
        int choice = sc.nextInt();
        String name;
        switch (choice) {
            case 1: name = "Saungikar"; break;
            case 2: name = "Gingras"; break;
            case 3: name = "Kasha-Blois"; break;
            default: System.out.println("Invalid choice"); return null;
        }
        
        return name;
    }

    public static void main(String[] args) {
        String name = choosePackemon();
        if (name == null) return;
        
        Packemon p = Packemon.createPackemon(name);
        System.out.println("Name: " + p.getName());
        System.out.println("HP: " + p.getHp());
        System.out.println("Speed: " + p.getSpeed());
        
        // Start the battle confirmation
        StartBattle.startBattle(p);
    }

}