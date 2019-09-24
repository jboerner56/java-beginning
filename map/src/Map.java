import java.util.HashMap;
public class Map {
    public static void main(String[] args) {
        HashMap map = new HashMap();
//        allows values to be stored with a key
//        arrays and lists allow to b stored with an index value
        map.put("US", "DC");
        map.put("UK", "London");
        System.out.println(map.get("UK"));
    }
}
