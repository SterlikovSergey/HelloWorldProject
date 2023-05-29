package by.sterlikov.classwork.lesson18xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileOutputStream;

public class XmlWriter {
    public static void main(String[] args) throws JAXBException {
        Student student = new Student(1,"Pavel","male",new Course("first"));
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();             //чтобы записать
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);// для  читабельности  в xml файле
        marshaller.marshal(student,new File("student.xml"));
    }
}
