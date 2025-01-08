import java.util.*;

public class OfferFristandPollLast {
    public static void main(String[] args) {
        ArrayDeque<String>ad= new  ArrayDeque<>();
        ad.add("red");
        ad.add("vishal");
        ad.add("white");
        ad.offerFirst("hii");
        ad.pollLast();
        System.out.println(ad);
    }
}
