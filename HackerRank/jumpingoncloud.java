
public class jumpingoncloud {
    import java.io.*;
    import java.math.*;
    import java.security.*;
    import java.text.*;
    import java.util.*;
    import java.util.concurrent.*;
    import java.util.regex.*;
    
    public class Solution {
    
        // Complete the jumpingOnClouds function below.
        static int jumpingOnClouds(int[] c) {
                int answer=0;
                int length=c.length;
    
                for(int i=0;i<(length-2);i++){
                   // System.out.println(i+" "+ answer);
                   
                       // System.out.println(i+" "+c[i+2]);
                        if(c[i+2]==0) i++;
                        answer++;
                    
                     
                }
    
            
        
                //System.out.println(c[i]);
                if(length<90){
                 if(c[length-2]==0)answer++;
                }
    
                return answer;
    
        }
    
        private static final Scanner scanner = new Scanner(System.in);
    
        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
            int[] c = new int[n];
    
            String[] cItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
            for (int i = 0; i < n; i++) {
                int cItem = Integer.parseInt(cItems[i]);
                c[i] = cItem;
            }
    
            int result = jumpingOnClouds(c);
    
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
    
            bufferedWriter.close();
    
            scanner.close();
        }
    }
}