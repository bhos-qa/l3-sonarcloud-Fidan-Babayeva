import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermissionManagerTest {

    @Test
    public void testGetRoleName() {
        // Arrange: Create a PermissionManager instance with a specific PermissionLevel
        PermissionManager manager = new PermissionManager();
        manager.setPermissionLevel(PermissionLevel.ADMIN);

        // Act: Call the method you want to test
        String roleName = manager.getRoleName();

        // Assert: Verify the expected result
        assertEquals("Admin", roleName);
    }

    @Test
    public void testSetPermissionLevel() {
        // Arrange: Create a PermissionManager instance
        PermissionManager manager = new PermissionManager();

        // Act: Call the method to set the PermissionLevel
        manager.setPermissionLevel(PermissionLevel.DEVELOPER);

        // Assert: Verify that the PermissionLevel is set correctly
        assertEquals(PermissionLevel.DEVELOPER, manager.getCurrentLevel());
    }

}
