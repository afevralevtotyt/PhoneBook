import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void add(Map<String,Integer> map, String key, int value){
        if (!map.containsKey(key)){
            map.put(key, value);
        }else if (map.get(key)==value){
            throw new RuntimeException("Такое значение уже есть в карте");
        }else{
            map.put(key,value);
        }
    }
    public static void main(String[] args) {
        PhoneBook book1  = new PhoneBook();

        book1.add("Петров Иван", "79622228883");
        book1.add("Петров Маша", "79622228283");
        book1.add("Иванова Наташа", "79623228883");
        book1.add("Михайлов Иван", "79622229883");
        book1.add("Петров Александр", "79612228883");
        book1.add("Никитин Алексей", "79622228885");
        book1.add("Федеров Иван", "79622228843");
        book1.add("Петрова Кристина", "79622228833");
        book1.add("Михайлова Анастасия", "79622228823");
        book1.add("Голубев Афанасий", "79622228813");
        book1.add("Голубева Алина", "79622228880");
        book1.add("Свиркина Анастасия", "79622228889");
        book1.add("Синицин Иван", "79622228888");
        book1.add("Калугин Иван", "79622228887");
        book1.add("Воробьев Владимир", "79622228886");
        book1.add("Соловей Антон", "79622228885");
        book1.add("Глушко Роман", "79622228884");
        book1.add("Горбунов Петр", "79622228881");
        book1.add("Татарин Иван", "79622228882");
        book1.add("Галошин Григорий", "79624228883");

        System.out.println(book1.getPhoneBook());



        Map<String, Integer> map= new HashMap<>();

        map.put("str1", 1);
        map.put("str2", 2);
        map.put("str3", 3);
        map.put("str4", 4);
        map.put("str5", 5);

        add(map, "str1", 2);
        add(map, "str6", 6);
        System.out.println(map);






    }
}