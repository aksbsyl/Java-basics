package Week5;
import java.util.*;

public class MapTest {
        public static void main(String args[]){
            Map<Integer,String> map=new HashMap<Integer,String>();  //Map<Keys, Values>
            map.put(100,"Amit");
            map.put(101,"Vijay");
            map.put(102,"Rahul");
            //Elements can traverse in any order
            for(Map.Entry m:map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
            //see MapTestOld to understand
        }
}
