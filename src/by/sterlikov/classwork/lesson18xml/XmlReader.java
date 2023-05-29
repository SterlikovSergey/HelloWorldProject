package by.sterlikov.classwork.lesson18xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlReader {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Student myStudent = (Student)unmarshaller.unmarshal(new File("student.xml"));
        System.out.println(myStudent);
    }
}
