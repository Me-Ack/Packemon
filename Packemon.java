/**
    Différentes Packemons
    - HP
    - Speed
 */

public class Packemon {
    private String name;
    private int hp;
    private int speed;

    // Constructor to set stats for a Packemon
    public Packemon(String name, int hp, int speed) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    // Setters (optional, if you want to modify stats later)
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Optional: toString method for easy printing
    @Override
    public String toString() {
        return "Packemon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", speed=" + speed +
                '}';
    }

    // Static method to create Packemons by name with predefined stats
    public static Packemon createPackemon(String name) {
        switch (name.toLowerCase()) {
            case "saungikar":
                return new Packemon("Saungikar", 80, 150);
            case "gingras":
                return new Packemon("Gingras", 200, 60);
            case "kasha-blois":
                return new Packemon("Kasha-Blois", 140, 70);
            default:
                throw new IllegalArgumentException("Unknown Packemon name: " + name);
        }
    }
}
