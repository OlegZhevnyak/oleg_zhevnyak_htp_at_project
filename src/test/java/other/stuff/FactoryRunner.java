package other.stuff;

public class FactoryRunner {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Oleg")
                .withAge(25)
                .withProfession("Lazy_Ass")
                .withHobby("Do_Nothing")
                .build();
    }
}
