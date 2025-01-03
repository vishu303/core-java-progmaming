import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratorTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(12, "hii");
        tm.put(23, "vishal");
        tm.put(45, "bye");
        tm.put(0, "hello");

        // Get the entry set
        Set<Map.Entry<Integer, String>> set = tm.entrySet();

        // Create an iterator
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        // Iterate and print key-value pairs
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
