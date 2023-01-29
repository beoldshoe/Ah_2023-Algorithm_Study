//분할 & 정복(Divide & Conquer)

import java.util.*;

public class Main {
    public static int [][] arr = new int[64][64];
    public static StringBuilder sb = new StringBuilder();
    public static void QuadTree(int x1,int x2, int y1,int y2){
        int tmp = arr[x1][y1];
        int check = 1;

        for(int i =x1;i<=x2;i++){
            for(int k=y1;k<=y2;k++){
                if(tmp != arr[i][k]){
                    check = 0;
                    break;
                }
            }
        }

        if(check == 1){
            sb.append(tmp);
        }
        else{
            sb.append('(');
            QuadTree(x1,(x1+x2)/2,y1,(y1+y2)/2);
            QuadTree(x1,(x1+x2)/2,(y1+y2)/2+1,y2);
            QuadTree((x1+x2)/2+1,x2,y1,(y1+y2)/2);
            QuadTree((x1+x2)/2+1,x2,(y1+y2)/2+1,y2);
            sb.append(')');
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        for(int i=0;i<N;i++) {
            String tmp = stdIn.next();
            for (int k = 0; k < N; k++) {
                arr[i][k] = tmp.charAt(k)-'0';
            }
        }
        
        QuadTree(0,N-1,0,N-1);
        System.out.println(sb);
        stdIn.close();
    }
}
