import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ZombieIdentifierTest {

    private ZombieAPI zombieAPI;
    private ZombieIdentifier zombieIdentifier;

    @Before
    public void setUp() {
        // Create an instance of MockZombieAPI before each test
        zombieAPI = new MockZombieAPI();
        zombieIdentifier = new ZombieIdentifier(zombieAPI);
    }

    @Test
    public void testWalkerZombieType() {
        assertEquals("Destroy the brain", zombieIdentifier.findZombieWeakness("walker"));
    }

    @Test
    public void testRunnerZombieType() {
        assertEquals("Severing the spinal cord", zombieIdentifier.findZombieWeakness("runner"));
    }

    @Test
    public void testCrawlerZombieType() {
        assertEquals("Crush the head", zombieIdentifier.findZombieWeakness("crawler"));
    }

    @Test
    public void testTankZombieType() {
        assertEquals("Explosive force to the head", zombieIdentifier.findZombieWeakness("tank"));
    }

    @Test
    public void testSpitterZombieType() {
        assertEquals("Blunt force trauma to the head", zombieIdentifier.findZombieWeakness("spitter"));
    }

    @Test
    public void testNonExistingZombieType() {
        assertEquals("Weakness not found", zombieIdentifier.findZombieWeakness("unknown"));
    }

    @Test
    public void testNullInput() {
        assertEquals("Weakness not found", zombieIdentifier.findZombieWeakness(null));
    }

    @Test
    public void testCaseSensitivity() {
        assertEquals("Explosive force to the head", zombieIdentifier.findZombieWeakness("TANK"));
    }
}
