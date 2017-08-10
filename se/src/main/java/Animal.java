/**
 * Created by lywar on 09.08.2017.
 */
public class Animal implements Pet {


    private String name;
    public Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void makeSound(String voice) {
        System.out.println(this.name + " says: " + voice);
    }

    public void makeSound() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
