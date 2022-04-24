package Ch06_BreadthFirstSearch;

import java.util.*;

public class BreadthFirstSearch {

   public static Map<String, List<String>> graph = new HashMap<String, List<String>>();

   public static boolean search(String name) {
       Queue <String> searchQueue = new ArrayDeque<>(graph.get(name));
       List<String> searched = new ArrayList<>();

       while(!searchQueue.isEmpty()) {
           String person = searchQueue.poll(); // this is like popleft in python

           if(!searched.contains(person)) {
               if(person_sells_mangos(person)) {
                   System.out.println("We found our target" + person + " sells mangos");
                   return true;
               } else {
                   // add the friends of the persons we just checked (his network) to the search list.
                   // we will then check if his friends are mango sellers.
                   searchQueue.addAll(graph.get(person));
               }
           }
       }
       return true;
   }

   public static boolean person_sells_mangos(String name) {
       // just a mock method to determine if someone sells mangos.
       return name.endsWith("m");
   }


    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        System.out.println("you");

    }
}
