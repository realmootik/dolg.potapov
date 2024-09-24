import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();


    public void addUser(User user) {
        users.add(user);
    }


    public void removeUser(int userId) {
        users.removeIf(user -> user.getId() == userId);
    }


    public void editUser(int userId, String newName) {
        for (User user : users) {
            if (user.getId() == userId) {
                user.setName(newName);
                break;
            }
        }
    }

    public List<User> getUsers() {
        return users;
    }
}