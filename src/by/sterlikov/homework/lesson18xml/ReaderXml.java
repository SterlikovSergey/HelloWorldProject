package by.sterlikov.homework.lesson18xml;

import by.sterlikov.classwork.lesson15.StreamMain;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.stream.Stream;

public class ReaderXml {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Sonnet.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Sonnet mySonnet = (Sonnet)unmarshaller.unmarshal(new File("/Users/sergeysterlikov/Documents/Обучение <TeachMeSkills\\>/Home works/data.xml"));
        System.out.println(mySonnet);

    }
}
