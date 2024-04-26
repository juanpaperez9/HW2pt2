interface ZombieAPI {
    String getZombieWeakness(String zombieType);
}

// MockZombieAPI class implementing the ZombieAPI interface
class MockZombieAPI implements ZombieAPI {

    @Override
    public String getZombieWeakness(String zombieType) {
        if (zombieType == null) {
            return "Weakness not found";
        }

        // Switch to handle different zombie types and weaknesses
        switch (zombieType.toLowerCase()) {
            case "walker":
                return "Destroy the brain";
            case "runner":
                return "Severing the spinal cord";
            case "crawler":
                return "Crush the head";
            case "tank":
                return "Explosive force to the head";
            case "spitter":
                return "Blunt force trauma to the head";
            default:
                return "Weakness not found";
        }
    }
}
