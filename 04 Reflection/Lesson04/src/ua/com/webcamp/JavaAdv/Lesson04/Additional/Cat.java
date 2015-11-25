package ua.com.webcamp.JavaAdv.Lesson04.Additional;

/**
 * Created by Artem Vereschaka on 8/11/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents concrete animal -  Cat
 */
public class Cat extends Animal {

    private int weight;

    public Cat(String name, int weight, Color color) {
        super(name, weight, color);
        this.weight = weight;
    }

    @Override
    public String sound() {
        return "Meow";
    }

    /**
     * Cat will walk ( or not )
     * @return string - result of action
     */
    public String walk()
    {
        return "I am too lazy for that.";
    }

    /**
     * Main method for all cats over the world
     * @return lazy
     */
    private String lazy()
    {
        return "I want to sleep all the time...";
    }

}
