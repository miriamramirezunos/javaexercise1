import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Method1 {

    public String Comparison2words (String word1, String word2) {
        if(word1==null|word2==null) {
            return "Null is not allowed in word comparision";
        }
        else {
            if (word1==word2)
                return "words are equal";
            else
                return "words are not equal";
        }
    }

    public void Biggest (List<Integer> numbers) {
        Collections.sort(numbers);
        Iterator<Integer> iter = numbers.iterator();
        int biggest=0;
        int current;
        // Iterate elements
        System.out.println("numbers on Array of integers:");
        while (iter.hasNext()){
            current = iter.next();
            System.out.print(" " + current);
            if (current > biggest){
                biggest = current;
            }
        }
        System.out.println("\nthe biggest number is: " + biggest + "\n");
    }

    public void Sortascdesc (List<String> strs){

        Collections.sort(strs);
        Iterator<String> iter = strs.iterator();
        System.out.println("Ascending order of Array of Strings:");
        while (iter.hasNext()) {
            System.out.println("" + iter.next());
        }
        Collections.sort(strs, Collections.reverseOrder());
        Iterator<String> iter2 = strs.iterator();
        System.out.println("Descending order of Array of Strings:");
        while (iter2.hasNext()) {
            System.out.println("" + iter2.next());
        }
    }

    public int Strcount (String str){
        int length = 0;
        length = str.length();
        return length;
    }
}
