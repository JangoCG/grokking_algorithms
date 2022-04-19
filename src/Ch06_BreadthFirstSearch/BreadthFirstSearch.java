package Ch06_BreadthFirstSearch;

import java.util.*;

public class BreadthFirstSearch {

   public static Map<String, List<String>> graph = new HashMap<String, List<String>>();

   public static boolean search(String name) {
       Queue <String> searchQueue = new ArrayDeque<>(graph.get(name));
       List<String> searched = new ArrayList<>();

       while(!searchQueue.isEmpty()) {
           String person = searchQueue.poll();

           if(!searched.contains(person)) {
               if(person_sells_mangos(person)) {
                   System.out.println("We found our target" + person + " sells mangos");
                   return true;
               } else {
                   // add the list of values to the queue? (all his friends)
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
    }
}
