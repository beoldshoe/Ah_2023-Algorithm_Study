import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[50001];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=N;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=Math.sqrt(i); j++){
                int temp = i-j*j;
                min = Math.min(min,arr[temp]);
            }
            arr[i] = min+1;
        }
        System.out.println(arr[N]);
    }
}
