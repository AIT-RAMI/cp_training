import java.math.*;
import java.util.*;
import java.io.*;
public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader S = new FastReader();
        int []numbers = new int[4];
        int max = 0;
        for (int i = 0; i < 4; i++){
            numbers[i] = S.nextInt();
            if (numbers[i] > numbers[max]) max = i;
        }
        for (int i = 0; i < 4; i++) {
            if (i != max){
                System.out.print(numbers[max] - numbers[i] + " ");
            }
        }
    }
}
