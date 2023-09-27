package org.example;

import org.example.PermissionLevel;
import org.example.PermissionManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermissionManagerTest {

    @Test
    public void testGetRoleName() {
        // Arrange: Create a org.example.PermissionManager instance with a specific org.example.PermissionLevel
        PermissionManager manager_admin = new PermissionManager();
        manager_admin.setPermissionLevel(PermissionLevel.ADMIN);

        PermissionManager manager_user = new PermissionManager();
        manager_user.setPermissionLevel(PermissionLevel.USER);

        PermissionManager manager_developer = new PermissionManager();
        manager_developer.setPermissionLevel(PermissionLevel.DEVELOPER);

        // Act: Call the method you want to test
        String roleName_admin = manager_admin.getRoleName();
        String roleName_user = manager_user.getRoleName();
        String roleName_developer = manager_developer.getRoleName();

        // Assert: Verify the expected result
        assertEquals("Admin", roleName_admin);
        assertEquals("User", roleName_user);
        assertEquals("Developer", roleName_developer);
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
