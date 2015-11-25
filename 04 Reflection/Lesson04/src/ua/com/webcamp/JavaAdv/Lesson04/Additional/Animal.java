package ua.com.webcamp.JavaAdv.Lesson04.Additional;

/**
 * Created by Artem Vereschaka on 8/11/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents an animal with different properties
 */
public abstract class Animal implements Soundable{
    /**
     * Name of animal
     */
    public String name;
    /**
     * Weight of animal
     */
    private int weight;
    /**
     * Color of animal
     */
    protected Color color;

    public Animal(String name, int weight, Color color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    /**
     * Gets a name of animal
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets a weight of animal
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Gets a color of animal
     * @return color
     */
    public Color getColor() {
        return color;
    }
}
