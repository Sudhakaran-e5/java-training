import java.io.FileOutputStream;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileWriter {
  public static void main(String args[]) {
    
    ArrayList<String> list= new ArrayList<>();
    list.add("summa");
    Map<String, String> map = new HashMap<>();
        for (String fruit : list) {
            map.put(fruit.toUpperCase(), fruit);
        }
                System.out.println(map.toString());
                System.out.println(list.toString());
      }
}