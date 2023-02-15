import java.util.*;

public class Main {
    static int[] dy;
    public static int solution(int[] arr){
        dy = new int[arr.length];
        dy[0] = 1;
        int answer = dy[0];
        for(int i=1; i<arr.length; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[j]>arr[i] && dy[j]>max) max = dy[j];
            }
            dy[i] = max+1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(solution(arr));
        
    }
}
