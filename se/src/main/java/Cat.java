/**
 * Created by lywar on 09.08.2017.
 */
public class Cat extends Animal {

    public Cat(final String name){
        super(name);
    }


    public void makeSound() {
        super.makeSound("meow");
    }
}
