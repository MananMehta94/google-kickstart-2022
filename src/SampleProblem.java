import java.io.*;

public class SampleProblem {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        int[] solution = new int[testCases];
        while(testCases!=0) {
            String[] line2 = br.readLine().split(" ");
            int bags = Integer.parseInt(line2[0]);
            int children = Integer.parseInt(line2[1]);
            String[] line3 = br.readLine().split(" ");
            int totalCandies = 0;
            for (String s : line3) {
                totalCandies += Integer.parseInt(s);
            }
            int remaining = totalCandies % children;
            solution[solution.length-testCases] = remaining;
            testCases--;
        }
        for(int i=0; i<solution.length; i++){
            System.out.println("Case #" + (i+1) + ": " + solution[i]);
        }
    }
}
