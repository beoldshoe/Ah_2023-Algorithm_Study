//분할 정복(Divide & Conquer)

import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void MakeCP(int size,int x,int y,int[][] arr){
        int tmp = arr[x][y];
        int check = 1;

        for(int i =x;i<x+size;i++){
            for(int k=y;k<y+size;k++){
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
            MakeCP(size/2,x,y,arr);
            MakeCP(size/2,x,y+size/2,arr);
            MakeCP(size/2,x+size/2,y,arr);
            MakeCP(size/2,x+size/2,y+size/2,arr);
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int [][] arr = new int[N][N];

        int count0=0;
        int count1=0;

        for(int i=0;i < N;i++) {
            for (int k = 0; k < N; k++) {
                arr[i][k] = stdIn.nextInt();
            }
        }

        MakeCP(N,0,0,arr);

        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch == '0'){
                count0++;
            }
            else count1++;
        }
        System.out.println(count0);
        System.out.println(count1);
        stdIn.close();
    }
}
