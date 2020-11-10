package Week5;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    String book1;
    String book2;
    MapTest1(String book1, String book2){
        this.book1 = book1;
        this.book2 = book2;
    }

    public static void main(String[] args) {
        HashMap<String,MapTest1> map = new HashMap<>();

        MapTest1 m1 = new MapTest1("First head java", "Thinking of java");
        MapTest1 m2 = new MapTest1("First head C++", "Thinking of C++");
        MapTest1 m3 = new MapTest1("First head C", "Thinking of C");

        map.put("Kathy serera",m1);
        map.put("Dennis Richy",m2);
        map.put("Balaguru Swami",m3);
        for (Map.Entry m: map.entrySet()){
//            System.out.println(map.entrySet());
//            System.out.println(m.getValue());
            MapTest1 mt = (MapTest1) m.getValue();
            System.out.println("author:"+ m.getKey() + " book1: " + mt.book1 + " book2: "+ mt.book2);
            System.out.println(" ");
        }
    }
}
