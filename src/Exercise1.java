import java.util.ArrayList;

public class Exercise1 {
    public static void main(String args[]) {

        String word1="Word1", word2="Word2", rcomparison, str = "THIS IS A STRING, GET MY LENGTH";
        int length;
        ArrayList<Integer> arrayofnumbers = new ArrayList<Integer>();
        arrayofnumbers.add(1982);
        arrayofnumbers.add(1928);
        arrayofnumbers.add(2020);
        arrayofnumbers.add(1999);
        ArrayList<String> arrayofstrings = new ArrayList<String>();
        arrayofstrings.add("def");
        arrayofstrings.add("jkl");
        arrayofstrings.add("abc");
        arrayofstrings.add("ghi");

        //Class 1, method 1
        Method1 method1 = new Method1();
        Method2 method2 = new Method2();
        try {
            rcomparison = method1.Comparison2words(word1, word2);
            System.out.println("Comparison of " + word1 + " and " + word2 + " = " + rcomparison + "\n");
        }
        catch(Exception e){
            System.out.println("An error has occurred");
            }
        //Class 1, method 2
        method1.Biggest(arrayofnumbers);
        //Class 1, method 3
        method1.Sortascdesc(arrayofstrings);
        //Class 1, method 4
        length = method1.Strcount(str);
        System.out.println("\nthe string \"" + str + "\" has " + length + " characters");
        //Class 2, method 1
        method2.Smallest(arrayofnumbers);
        //Class 2, method 2
        method2.Hashmap();
    }
}
