package DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("codewithashutosh123")
                .setUserName("codewithashutosh")
                .setEmailId("codewithashutosh@gmail.com")
                .build();

        System.out.println(user);

        User user2 = User.UserBuilder.builder()
                .setUserId("ashutosh123")
                .setUserName("ashutosh")
                .setEmailId("ashutosh@gmail.com")
                .build();
        System.out.println(user2);
    }
}
