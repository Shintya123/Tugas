public class Main {
    public static void main(String[] args) {
        Goblin goblin = new Goblin("Goblin Kecil", 50);
        Dragon dragon = new Dragon("Naga Api", 200, 75);
        goblin.monsterSound();
        dragon.monsterSound();
    }
}
