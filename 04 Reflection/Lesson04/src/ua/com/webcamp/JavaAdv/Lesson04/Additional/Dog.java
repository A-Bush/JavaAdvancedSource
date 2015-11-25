package ua.com.webcamp.JavaAdv.Lesson04.Additional;

/**
 * Created by Artem Vereschaka on 8/11/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents concrete animal - Dog.
 */
public class Dog extends Animal {
    public Dog(String name, int weight, Color color) {
        super(name, weight, color);
    }

    @Override
    public String sound() {
        return "Woof!";
    }

    /**
     * Dog will walk ( or not )
     * @return string - result of action
     */
    public String walk()
    {
        return "Walking like a mad dog!!";
    }
}
