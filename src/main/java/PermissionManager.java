public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    // Constructor
    public PermissionManager() {
        // Set the initial value to USER
        mCurrentLevel = PermissionLevel.USER;
    }
    // Method to get the name of the role based on the current PermissionLevel
    public String getRoleName() {
        switch (mCurrentLevel) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                return "Unknown"; // Handle unexpected cases
        }
    }

    // Method to set the PermissionLevel to mCurrentLevel
    public void setPermissionLevel(PermissionLevel newLevel) {
        mCurrentLevel = newLevel;
    }

    // Getter for mCurrentLevel
    public PermissionLevel getCurrentLevel() {
        return mCurrentLevel;
    }
}
