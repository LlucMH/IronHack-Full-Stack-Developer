import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersonsList {
    private ArrayList<Person> persons;

    public PersonsList() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person p) {
        persons.add(p);
    }

    public Person findByName(String name) {
        if (!name.matches("\\w+ \\w+")) {
            throw new IllegalArgumentException("Name must be in 'firstName lastName' format");
        }
        for (Person p : persons) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public Person clone(Person original, int newId) {
        return new Person(newId, original.getName(), original.getAge(), original.getOccupation());
    }

    public void writePersonToFile(Person p, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(p.toString());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
