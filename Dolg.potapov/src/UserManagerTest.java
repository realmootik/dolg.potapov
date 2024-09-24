import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserManagerTest {
    private UserManager userManager;

    @BeforeEach
    public void setUp() {
        userManager = new UserManager();
    }

    @Test
    public void testAddUser() {
        User user = new User(1, "Alice");
        userManager.addUser(user);
        assertEquals(1, userManager.getUsers().size());
        assertEquals("Alice", userManager.getUsers().get(0).getName());
    }

    @Test
    public void testRemoveUser() {
        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");
        userManager.addUser(user1);
        userManager.addUser(user2);

        userManager.removeUser(1);

        assertEquals(1, userManager.getUsers().size());
        assertEquals("Bob", userManager.getUsers().get(0).getName());
    }

    @Test
    public void testEditUser() {
        User user = new User(1, "Alice");
        userManager.addUser(user);

        userManager.editUser(1, "Alicia");

        assertEquals("Alicia", userManager.getUsers().get(0).getName());
    }

    @Test
    public void testEditNonExistentUser() {
        User user = new User(1, "Alice");
        userManager.addUser(user);

        userManager.editUser(2, "Bob"); // Не существует

        assertEquals("Alice", userManager.getUsers().get(0).getName());
    }
}