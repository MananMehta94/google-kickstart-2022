import java.io.*;
import java.util.*;

public class CentauriPrime {
    public static void main(String[] args)throws IOException {
        Set<Character> vowels= new HashSet<>(5);
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        ArrayList<String> output = new ArrayList<>(testCases);

        while(testCases--!=0){
            String kingdom = br.readLine();
            char lastCharacter = kingdom.charAt(kingdom.length()-1);
            if (lastCharacter=='y' || lastCharacter=='Y')
                output.add("Case #" + (output.size()+1) + ": " + kingdom + " is ruled by nobody.");
            else if(vowels.contains(lastCharacter))
                output.add("Case #" + (output.size()+1) + ": " + kingdom + " is ruled by Alice.");
            else
                output.add("Case #" + (output.size()+1) + ": " + kingdom + " is ruled by Bob.");
        }
        output.forEach(System.out::println);
    }
}
