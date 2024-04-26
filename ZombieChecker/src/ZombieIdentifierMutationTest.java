import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;

public class ZombieIdentifierMutationTest {
    private ZombieAPI zombieAPI;
    private ZombieIdentifier zombieIdentifier;

    @Before
    public void setUp() {
        // Create an instance of MockZombieAPI before each test
        zombieAPI = new MockZombieAPI();
        zombieIdentifier = new ZombieIdentifier(zombieAPI);
    }

    @Test
    public void testMutationWeaknessNotFound() {
        // Create a mutated version of ZombieAPI
        ZombieAPI mutatedAPI = new ZombieAPI() {
            @Override
            public String getZombieWeakness(String zombieType) {
                return "Weakness found"; // Intentionally return a different value
            }
        };

        // Use mutatedAPI for ZombieIdentifier
        zombieIdentifier = new ZombieIdentifier(mutatedAPI);

        // Test for a known zombie type
        assertNotEquals("Fire", zombieIdentifier.findZombieWeakness("walker"));
    }

}

