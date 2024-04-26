public class Main {
    public static void main(String[] args) {
        // Create a mock ZombieAPI instance
        ZombieAPI zombieAPI = new MockZombieAPI();

        // Create an instance of ZombieIdentifier with the mock API
        ZombieIdentifier zombieIdentifier = new ZombieIdentifier(zombieAPI);

        // Demonstrate the functionality of the ZombieIdentifier
        demonstrateZombieIdentifier(zombieIdentifier);
    }

    private static void demonstrateZombieIdentifier(ZombieIdentifier zombieIdentifier) {
        // search queries
        String weaknessType2 = zombieIdentifier.findZombieWeakness("walker");
        String weaknessType5 = zombieIdentifier.findZombieWeakness("unknown");

        // Display results
        System.out.println("Zombie Type: walker | Weakness: " + weaknessType2);
        System.out.println("Zombie Type: unknown | Weakness: " + weaknessType5);
    }
}
