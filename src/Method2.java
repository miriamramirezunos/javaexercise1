import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Method2 {
    HashMap<String , Integer> hashm = new HashMap<String, Integer>();

    public void Smallest (List<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
        Iterator<Integer> iter = numbers.iterator();
        int current = 0;
        // Iterate elements
        System.out.println("\nnumbers on Array of integers:");
        while (iter.hasNext()){
            current = iter.next();
            System.out.print(" " + current);
        }
        System.out.println("\nthe smallest number is: " + current + "\n");
    }

    public void Hashmap (){
        hashm.put("abc" , 1928);
        hashm.put("def" , 1982);
        hashm.put("ghi" , 1999);
        hashm.put("jkl" , 2020);
        System.out.println("\nValues on HashMap: " + hashm);
        for(Map.Entry<String, Integer> entry : hashm.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("\nKey: " + key + " - Value: " + value);
        }
    }


}
