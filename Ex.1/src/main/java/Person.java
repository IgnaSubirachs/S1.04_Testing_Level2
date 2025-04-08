public class Person {
    private String name;


    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object person) {
        if (this == person) return true;
        if (!(person instanceof Person)) return false;
        return this.name.equals(((Person) person).name);
    }

}

