
import java.util.*;
import java.util.Collections;

public class Main {
    public static void Cal30(int cnt,int[] digit){
        //모든 자리 다 더해서 3 나눴을 때 0, 원래 수 10으로 나눴을 때 0을 만족하면 30의 배수
        int cal3 = 0;
        Integer[] result = Arrays.stream(digit).boxed().toArray(Integer[]::new);
        for(int i=0;i<cnt;i++){
            cal3 += digit[i];
        }

        // 3의 배수인 지 확인
        if(cal3 % 3 == 0){
            Arrays.sort(result,Collections.reverseOrder());
            for(int i=0;i<cnt;i++){
                System.out.print(result[i]);
            }
        }
        else
            System.out.print(-1);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String N = stdIn.nextLine();
        int cnt = N.length();
        int [] digit = new int[cnt];
        int cnt0 = 0; //0이 있는 지 확인하기 위한 counter

        for(int i=0;i < cnt;i++) {
            digit[i] = N.charAt(i) - '0';
        }

        for(int i=0;i < cnt;i++) {
            if(digit[i] == 0){
                cnt0++;
            }
            else {
                continue;
            }
        }

        if(cnt0 == 0) // 입력 받은 숫자에 0이 없으면 30의 배수가 될 수 없음
            System.out.print(-1);
        else
            Cal30(cnt,digit);

        stdIn.close();
    }
}
