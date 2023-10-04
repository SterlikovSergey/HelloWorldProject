package by.sterlikov.homework.newPackage.learn;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Learn {
    public static void main(String[] args) throws IOException {
        String text = "Всеми любимые стихи классиков были написаны давно, но все равно не" +
                " теряют своей актуальности и важности в нашей жизни. С помощью поэзии Вы " +
                "сможете не только найти ответы на вопросы, которые так сильно Вас тревожат, но " +
                "также и замечательно провести время, понять себя, а также окружающих и дорогих Вам людей";

        List<String> splitText = new ArrayList<>(List.of(text.split(" ")));
/*        int result = (int) splitText.stream()
                .filter(sp-> sp.length()>2)
                .count();
        System.out.println(result);*/
/*        byte[] readText = Files.readAllBytes(Paths.get("text.txt"));
        String contents = new String(readText, StandardCharsets.UTF_8);*/
        List<String> texts = Arrays.asList(text.split(" "));
        List<String> resultList = texts
                .stream()
                .filter(t->t.length()>3 & t.length()<=5)
                .distinct()
                .sorted()
                .toList();
        System.out.println(resultList);


        final Optional<String> optionalResult = splitText
                .stream()
                        .max(String::compareToIgnoreCase);
        System.out.println("largest: " + optionalResult.orElse("no largest"));
        Files.write(Path.of("text.txt"),resultList);
        byte[] readText1 = Files.readAllBytes(Paths.get("text.txt"));
        String contents1 = new String(readText1, StandardCharsets.UTF_8);
        System.out.println(contents1);


        List<String> resulArray = ( splitText.stream()
                .filter(r->r.startsWith("в"))
                .distinct()
                .sorted()
                .toList());

        System.out.println(resulArray);
        }
    }

