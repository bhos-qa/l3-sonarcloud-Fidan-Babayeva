package org.example;

import org.example.PermissionLevel;
import org.example.PermissionManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermissionManagerTest {

    @Test
    public void testGetRoleName() {
        // Arrange: Create a org.example.PermissionManager instance with a specific org.example.PermissionLevel
        PermissionManager manager = new PermissionManager();
        manager.setPermissionLevel(PermissionLevel.ADMIN);

        // Act: Call the method you want to test
        String roleName = manager.getRoleName();

        // Assert: Verify the expected result
        assertEquals("Admin", roleName);
    }

    @Test
    public void testSetPermissionLevel() {
        // Arrange: Create a org.example.PermissionManager instance
        PermissionManager manager = new PermissionManager();

        // Act: Call the method to set the org.example.PermissionLevel
        manager.setPermissionLevel(PermissionLevel.DEVELOPER);

        // Assert: Verify that the org.example.PermissionLevel is set correctly
        assertEquals(PermissionLevel.DEVELOPER, manager.getCurrentLevel());
    }

}
