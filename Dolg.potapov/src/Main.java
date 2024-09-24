public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.addUser(new User(1, "Антон"));
        userManager.addUser(new User(2, "Владислав"));

        System.out.println("Список пользователей:");
        for (User user : userManager.getUsers()) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }
        
        userManager.editUser(1, "Матвей");
        System.out.println("\nПосле редактирования:");
        for (User user : userManager.getUsers()) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }

        userManager.removeUser(2);
        System.out.println("\nПосле удаления:");
        for (User user : userManager.getUsers()) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }
    }
}