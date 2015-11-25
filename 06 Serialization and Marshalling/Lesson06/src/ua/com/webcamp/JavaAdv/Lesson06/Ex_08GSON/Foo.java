package ua.com.webcamp.JavaAdv.Lesson06.Ex_08GSON;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Artem Vereschaka on 8/20/15.
 * artem.andzen@gmail.com
 */
public class Foo {

    @SerializedName("NUMBER_NAME")
    private int number;
    private String name;
    private transient String transientField;

    public Foo(int number, String name, String transientField) {
        this.number = number;
        this.name = name;
        this.transientField = transientField;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", transientField='" + transientField + '\'' +
                '}';
    }
}
