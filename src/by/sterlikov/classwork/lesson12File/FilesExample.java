package by.sterlikov.classwork.lesson12File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesExample {
    public static void main(String[] args) {
        File file = new File("/Users/sergeysterlikov/Developer/IdeaProjects/HelloWorldProject/abc2.doc");
        File file12 = new File("out2");
        System.out.println(file.exists()); // существует ли ?
        System.out.println(file.isFile());//  файл ли ?
        System.out.println(file12.isDirectory()); // существует ли папка out, нужен обьект с  явным именем
        file12.mkdir();// создать папку out2
        System.out.println(file.getParent()); // покажет родительский класс

        System.out.println(file.getAbsolutePath()); // вувести обсалютный путь к файлу

        File file1 = new File("/Users/sergeysterlikov/Developer/IdeaProjects/HelloWorldProject");

        System.out.println(Arrays.toString(file1.listFiles(new DocFilter())));  // вывести в масиве все файлу в указанном адресе и проверить по фильтру на .doc


        System.out.println(file.canRead());// могу прочитать ?
        System.out.println(file.canExecute());// могу ли запустить ?

        System.out.println(file.getTotalSpace()); //сколько места  на  диске
        System.out.println(file.renameTo(new File("abc4.doc")));// переименовать

        System.out.println(file.setReadOnly());
        System.out.println(file.setReadable(true)); //ограничение на чтение
        System.out.println(file.setWritable(false));// ограничение на запись 




        try{
            System.out.println(file.createNewFile()); // создаём файл по указанному пути обьявленному при созданиии обьекта
        }catch (IOException e){
            System.out.println("File is not create");
        }

    }
}
