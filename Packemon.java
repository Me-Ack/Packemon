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
    
    public static void main(String[] args) {
        Monster choice1 = new Saungikar();
        Monster choice2 = new Gingras();
        Monster choice3 = new KashaBlois();
    }
}