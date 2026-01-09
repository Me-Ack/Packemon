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
    }
    
    public static void main(String[] args) {
        Choice choice = new Choice();
        Monster chosenPackemon = choice.choosePackemon(1); // Pass choice number here
        
        if (chosenPackemon != null) {
            System.out.println("Le Packemon choisi est : " + chosenPackemon.name);
            chosenPackemon.displayStats();
        }
    }
}