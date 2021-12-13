import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        System.out.println("==================================================");
        System.out.println("Задание 1");
        System.out.println("==================================================");
        System.out.println("Исходный массив");
        List<String> list = Arrays.asList("one", "one", "one", "two", "three", "four", "four", "five", "six", "seven", "eight", "nine", "ten", "ten", "ten", "ten");
        System.out.println(list);
        System.out.println("Массив уникальных значений");
        HashSet<String> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        System.out.println("Подсчет значений");
        System.out.println(map);
    }

    private static void task2() {
        System.out.println("==================================================");
        System.out.println("Задание 2");
        System.out.println("==================================================");
        Phonebook phonebook = new Phonebook();
        phonebook.add("89998887766","Ivanov");
        phonebook.add("89998887761","Petrov");
        phonebook.add("89998887762","Sidorov");
        phonebook.add("89998887763","Fedorov");
        phonebook.add("89998887764","Ivanov");
        phonebook.add("89999999999","Ivanov");
        System.out.println("Телефоны Ivanov");
        System.out.println( phonebook.get("Ivanov") );

    }
}
