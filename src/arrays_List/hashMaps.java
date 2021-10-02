package arrays_List;

import java.util.*;

public class hashMaps {
    public static HashMap<String, Integer> map = new HashMap<String, Integer>();
    public static ArrayList<String> name = new ArrayList<>();
    public static ArrayList<Integer> age = new ArrayList<>();

    public static HashMap<String, Integer> maps = new HashMap<String, Integer>();


    public static void main(String[] args) {
        /*nameIn(name);
        ageIn(age, name);
        add(map, name, age);*/
        adds(maps);
        enteryFirstType(maps);
        enterySecondSimpleType(maps);
    }

    public static HashMap<String, Integer> add(HashMap<String, Integer> map, ArrayList<String> name, ArrayList<Integer> age){
        for(int i = 0;i < name.size();i++){
            map.put(name.get(i), age.get(i));
        }
        for (String key: map.keySet())//что бы вывести ключ-значение нужно создать цикл for each.
        {
            Integer value = map.get(key);//в переменную передаем значение через метод - имяКоллекции.get(имя переменной из условия for)
            System.out.println(key + " --> " + value);//key - имя ключа. value - имя значения.
        }
        return map;
    }
    public static ArrayList<String> nameIn(ArrayList<String> name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имена ваших работников, далее для окончания ввода введите stop.");
        for(int i = 0;i <=10;i++){
            String names = sc.nextLine();
            if(names.equals("stop")){
                break;
            }
            name.add(names);
        }
        return name;
    }
    public static ArrayList<Integer> ageIn(ArrayList<Integer> age, ArrayList<String> name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст ваших работников.");
        for(int i = 0;i < name.size();i++){
            System.out.println("Введите возраст " + name.get(i) + ".");
            int ages = sc.nextInt();
            age.add(ages);
        }
        return age;
    }

    public static HashMap<String, Integer> adds(HashMap<String, Integer> maps){
        maps.put("Серега", 21);
        maps.put("Николай", 22);
        maps.put("Иван Петрович", 48);
        maps.put("Анюта", null);
        return maps;
    }
    public static void enteryFirstType(HashMap<String, Integer> maps){
        for(Map.Entry<String, Integer> pair: maps.entrySet()){//стандартный вариант вывода
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " --> " + value);
        }
    }
    public static void enterySecondSimpleType(HashMap<String, Integer> maps){//упрощенный вариант
        for(var pair: maps.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " --> " + value);
        }
    }
}
