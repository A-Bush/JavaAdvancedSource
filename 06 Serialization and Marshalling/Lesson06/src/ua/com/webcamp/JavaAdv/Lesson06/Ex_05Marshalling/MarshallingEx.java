package ua.com.webcamp.JavaAdv.Lesson06.Ex_05Marshalling;

import ua.com.webcamp.JavaAdv.Lesson06.Sex;
import ua.com.webcamp.JavaAdv.Lesson06.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by Artem Vereschaka on 8/19/15.
 * artem.andzen@gmail.com
 */
public class MarshallingEx {
    public static void main(String[] args) {
        Student student = new Student("Alex", "Moren", 22, Sex.MALE);

        try
        {
            File file = new File("student.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(student, file);
            jaxbMarshaller.marshal(student, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
