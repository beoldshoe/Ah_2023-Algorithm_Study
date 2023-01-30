import java.util.*;
import java.lang.*;

public class Main {
    public static void solution(Integer[] arr,int sum){
        Arrays.sort(arr,Comparator.reverseOrder());
        if(arr[arr.length-1] == 0 && sum%3 ==0){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]);
            }
        }
        else{
            System.out.print(-1);
        }
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String N = in.next();
       Integer[] arr = new Integer[N.length()];
       int sum =0;

       for(int i=0; i<N.length(); i++){
           arr[i] = N.charAt(i)-'0';
           sum+= arr[i];
       }
       solution(arr,sum);
    }
}
