/**
    Différentes Packemons
    - Attacks
    - HP
    - Speed
 */

public class Packemon {
    
    // Base Monster class
    static class Monster {

        protected String name;
        protected int hp;
        protected int attack;
        protected int defense;
        protected int speed;
        
        public Monster(String name, int hp, int attack, int speed) {
            this.name = name;
            this.hp = hp;
            this.attack = attack;;
            this.speed = speed;
        }
        
        public void displayStats() {
            System.out.println(name + " Stats:");
            System.out.println("HP: " + hp);
            System.out.println("Attack: " + attack);
            System.out.println("Speed: " + speed);
        }
    }
    
    static class Saungikar extends Monster {
        public Saungikar() {
            super("Saungikar", 45, 49, 45);
        }
    }
    
    static class Gingras extends Monster {
        public Gingras() {
            super("Gingras", 40, 45, 56);
        }
    }
    
    static class KashaBlois extends Monster {
        public KashaBlois() {
            super("Kasha-Blois", 50, 50, 50);
        }
    }
    
    static class Choice {
        public Monster choosePackemon(int choice) {
            switch(choice) {
                case 1:
                    return new Saungikar();
                case 2:
                    return new Gingras();
                case 3:
                    return new KashaBlois();
                default:
                    System.out.println("Invalid choice");
                    return null;
            }
        }

        public Monster choosePackemon(String key) {
            if (key == null) return null;
            key = key.trim();
            if (key.isEmpty()) return null;
            // accept numeric input
            try {
                int idx = Integer.parseInt(key);
                return choosePackemon(idx);
            } catch (NumberFormatException ignored) {}
            String k = key.toLowerCase();
            if (k.equals("saungikar") || k.contains("saung")) return new Saungikar();
            if (k.equals("gingras") || k.contains("gingr")) return new Gingras();
            if (k.equals("kasha-blois") || k.equals("kashablois") || k.contains("kasha") || k.contains("blois")) return new KashaBlois();
            System.out.println("Invalid choice: " + key);
            return null;
        }

        // Updated: interactive chooser using Scanner that checks for available input
        public Monster choosePackemonInteractive() {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            Monster picked = null;
            while (picked == null) {
                System.out.println("Choose your Packemon (1 Saungikar, 2 Gingras, 3 Kasha-Blois) or type a name:");
                if (!scanner.hasNextLine()) {
                    System.out.println("No interactive input available. Run the program in a terminal or pass a choice as an argument.");
                    return null;
                }
                String input = scanner.nextLine();
                if (input == null || input.trim().isEmpty()) {
                    System.out.println("Empty input — please enter 1, 2, 3, or a valid name.");
                    continue;
                }
                picked = choosePackemon(input);
                if (picked == null) {
                    System.out.println("Please enter 1, 2, 3, or a valid name.");
                }
            }
            return picked;
        }
    }
    
    public static void main(String[] args) {
        Choice choice = new Choice();
        Monster chosenPackemon = null;

        if (args.length > 0) {
            chosenPackemon = choice.choosePackemon(args[0]);
        } else {
            // If no interactive console is present, advise the user instead of defaulting silently
            if (System.console() == null && !System.in.equals(System.in)) {
                System.out.println("Interactive input not available. Run in a terminal or pass a choice as an argument (1/2/3 or name).");
                return;
            }
            chosenPackemon = choice.choosePackemonInteractive();
        }

        if (chosenPackemon != null) {
            System.out.println("Le Packemon choisi est : " + chosenPackemon.name);
            chosenPackemon.displayStats();
        }
    }
}