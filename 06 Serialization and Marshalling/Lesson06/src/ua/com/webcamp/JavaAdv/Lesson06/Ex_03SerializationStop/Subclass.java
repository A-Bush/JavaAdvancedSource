package ua.com.webcamp.JavaAdv.Lesson06.Ex_03SerializationStop;

import ua.com.webcamp.JavaAdv.Lesson06.Student;
import ua.com.webcamp.JavaAdv.Lesson06.Sex;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Artem Vereschaka on 8/19/15.
 * artem.andzen@gmail.com
 */

/**
 * Test subclass
 */
public class Subclass extends Student {
    public Subclass(String name, String surname, int age, Sex sex) {
        super(name, surname, age, sex);
    }

    /**
     * Serializes this object to stream
     * @param out stream
     * @throws IOException
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        throw new NotSerializableException("Not today!");
    }

    /**
     * Deserializes object from stream
     * @param in stream
     * @throws IOException
     */
    private void readObject(ObjectInputStream in) throws IOException {
        throw new NotSerializableException("Not today!");
    }
}
