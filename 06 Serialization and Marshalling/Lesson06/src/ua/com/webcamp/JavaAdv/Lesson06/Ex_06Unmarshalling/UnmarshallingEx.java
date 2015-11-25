package ua.com.webcamp.JavaAdv.Lesson06.Ex_06Unmarshalling;

import ua.com.webcamp.JavaAdv.Lesson06.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Artem Vereschaka on 8/19/15.
 * artem.andzen@gmail.com
 */
public class UnmarshallingEx {
    public static void main(String[] args) {
        try {
            File file = new File("student.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Student student = (Student) unmarshaller.unmarshal(file);

            System.out.println(student.getInfo());
            // see sex field
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
