public class Main {
    public static void main(String[] args) {
        PersonsList list = new PersonsList();

        Person p1 = new Person(1, "John Smith", 30, "Engineer");
        Person p2 = new Person(2, "Jane Doe", 25, "Designer");
        list.addPerson(p1);
        list.addPerson(p2);

        try {
            p1.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        try {
            Person found = list.findByName("Jane Doe");
            System.out.println("Found: " + found);
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        try {
            list.findByName("JaneDoe");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected format error: " + e.getMessage());
        }

        Person clone = list.clone(p2, 3);
        System.out.println("Original: " + p2);
        System.out.println("Clone:    " + clone);

        list.writePersonToFile(p1, "person_output.txt");
    }
}
