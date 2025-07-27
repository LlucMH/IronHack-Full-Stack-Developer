public class Person {
    private int id;
    private String name; 
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) {
        this.id = id;
        this.name = name;
        setAge(age); 
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be 0 or greater");
        }
        this.age = age;
    }

    public boolean equals(Person other) {
        return this.name.equals(other.name) &&
               this.age == other.age &&
               this.occupation.equals(other.occupation);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Occupation: " + occupation;
    }
}