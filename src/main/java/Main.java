public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "1234 № 44444444";
        post.patronumic = "Петрович";
        post.phone = "+7 (800)-555-35-55";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 15;
        post.birthday.month = 5;
        post.birthday.year = 1964;
    }
}