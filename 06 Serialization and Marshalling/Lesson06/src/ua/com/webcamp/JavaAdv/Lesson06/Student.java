package ua.com.webcamp.JavaAdv.Lesson06;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Artem Vereschaka on 8/19/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents student
 */
@XmlRootElement(name = "Student") // for marshalling
public class Student implements Serializable {

    /**
     * Name of student
     */
    @XmlElement
    private String name;

    /**
     * Surname of student
     */
    @XmlElement
    private String surname;

    /**
     * Age of student
     */
    @XmlAttribute
    private int age;

    /**
     * Student's sex
     */
    private Sex sex;

    public Student(String name, String surname, int age, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
    }

    /**
     * Gets all information about this student as formatted string
     * @return information
     */
    public String getInfo() {
        return String.format("Name: %-10s\n" +
                        "Surname: %-15s\n" +
                        "Age: %-3d\n" +
                        "Sex: %s\n",
                name, surname, age, sex);
    }
}
