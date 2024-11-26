package ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    static public void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        
        al.add("Balaji");
        al.add("Pavan");
        al.add("Ajith");
        al.add("Balu");

        
        List<String> streamResult = (List<String>)al.stream()
                .filter(i -> i.startsWith("B")) 
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(streamResult);
    }
}
