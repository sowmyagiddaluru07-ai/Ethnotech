import java.util.*;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> livingbeing = new HashMap<>();
        livingbeing.put("Tree","NeemTree");
        livingbeing.put("Bird","Parrot");
        livingbeing.put("Animal","Tiger");
        System.out.println(livingbeing);

        System.out.println("displaying using get : "+livingbeing.get("Animal"));
        System.out.println("using remove:"+livingbeing.remove("Tree"));
        System.out.println(livingbeing.containsKey("Bird"));
        System.out.println(livingbeing.containsValue("sparrow"));

    }
    
}