import java.util.*;

public class HetergenousWrapper {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<>();
        s.add("vishal");
        s.add(23);
        s.add("h");
        s.add(34f);
        System.out.println(s);
    }
}
