package other.stuff;

public class Person {

    private String name;
    private int age;
    private String profession;
    private String hobby;

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder withProfession(String profession) {
            newPerson.profession = profession;
            return this;
        }

        public Builder withHobby(String hobby) {
            newPerson.hobby = hobby;
            return this;
        }

        public Person build(){
            return newPerson;
        }

    }

}
