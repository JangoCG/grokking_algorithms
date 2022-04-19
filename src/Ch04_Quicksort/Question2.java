package Ch04_Quicksort;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

    public static int listCount(List<Integer> input) {
        List res = new ArrayList<Integer>();
        if(input.size() == 0) {
            // fertig
            return res.size();
        } else {
            input.remove(0);
            return 1+ listCount(input);
        }

    }

    public static void main (String args[]) {
        List listA = new ArrayList();
        listA.add(1);
        listA.add(2);
        listA.add(3);

        System.out.println(listCount(listA));


    }
}
