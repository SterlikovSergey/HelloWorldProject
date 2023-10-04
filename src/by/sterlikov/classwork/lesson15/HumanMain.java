package by.sterlikov.classwork.lesson15;

import java.util.Optional;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Man", 10);
        Human father = new Human("Father", 40);
        Human mother = new Human("Mother", 35);
        Human anonymous = new Human(null, 50);
        human.setFather(father);
        human.setMother(mother);
        System.out.println(human);
        System.out.println(anonymous);
        System.out.println(human.getFather().getName());

        if (human.getFather() != null && human.getFather().getFather() != null &&
                human.getFather().getFather().getName() != null) {
            System.out.println(human.getFather().getFather().getName());
        } else {
            System.out.println("unknown name ");
        }

        Optional<Human> fatherOpt = Optional.ofNullable(anonymous.getFather());

        //не рекомендуемо
        fatherOpt.ifPresent(value -> System.out.println(value.getName()));
        fatherOpt.ifPresent(f -> System.out.println(f.getName()));// рекомендую

        /*//Human possibleFather = fatherOpt.orElseThrow();
        //Human possibleFather = fatherOpt.orElseThrow(() -> new RuntimeException("Here"));*/
        fatherOpt.ifPresentOrElse(fOpt -> System.out.println(fOpt.getName()),
                () -> System.out.println("anonymous"));

        Human protector = new Human("Protector", 100);

        Human ourDefense = fatherOpt.orElse(protector);

        Optional.ofNullable(human.getFather())
                .orElse(getDefaultHuman());

        Optional.ofNullable(human.getFather())
                .orElseGet(HumanMain::getDefaultHuman);

        fatherOpt.map(Human::getFather)
                .map(Human::getFather)
                .ifPresent(ded -> System.out.println(ded.getName()));// проверяет и отца и имя отца

        Optional.ofNullable(human).map(Human::getFather)
                .filter(f -> f.getName().startsWith("Ad"))       //вернуть имя с началом Ad
                .ifPresent(System.out::println);

        if (human.getFather() != null && human.getFather().getName() != null &&
                human.getFather().getName().startsWith("Ad")) {            // без option
        }
    }

    private static Human getDefaultHuman() {
        System.out.println("This is default human");
        return new Human("Protector", 100);
    }
}
