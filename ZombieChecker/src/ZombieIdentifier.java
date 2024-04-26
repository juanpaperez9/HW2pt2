import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ZombieIdentifier {
    private ZombieAPI zombieAPI;
    private Map<String, String> cache;

    public ZombieIdentifier(ZombieAPI zombieAPI) {
        this.zombieAPI = zombieAPI;
        this.cache = new ConcurrentHashMap<>(); // ConcurrentHashMap for thread safety
    }

    public String findZombieWeakness(String zombieType) {
        if (zombieType == null) {
            return "Weakness not found";
        }
    
        // Check if the zombie type is already cached
        if (cache.containsKey(zombieType)) {
            return cache.get(zombieType); // Return cached weakness
        }
    
        // If not cached, retrieve from API and cache the result
        String weakness = this.zombieAPI.getZombieWeakness(zombieType);
        cache.put(zombieType, weakness);
    
        return weakness;
    }
    

    // Method to clear the cache if needed
    public void clearCache() {
        cache.clear();
    }
}
