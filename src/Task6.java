public class Task6 {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setFirstName("Bob");
        user1.setLastName("Marley");
        user1.setAge(25);
        user1.setEmail("bobmarley@gmail.com");


        System.out.println("FirstName and lastName: " + user1.getFirstName() + " " + user1.getLastName());
        System.out.println("Age: " + user1.getAge());
        System.out.println("Email: " + user1.getEmail());
    }
}