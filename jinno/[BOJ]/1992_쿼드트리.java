import java.util.*;

public class Main {
   static String str ="";
    public static void solution(int n, char[][] arr,int row,int col){
        char current = arr[row][col];
        boolean check = true;
        for(int i=row; i<row+n; i++){
            for(int j=col;j<col+n; j++){
                if(arr[i][j] != current){
                    check = false;
                    break;
                }
            }
        }

        if(!check){
            str+="(";
            solution(n/2,arr,row,col);
            solution(n/2,arr,row,col+n/2);
            solution(n/2,arr,row+n/2,col);
            solution(n/2,arr,row+n/2,col+n/2);
            str+=")";
        }
        else{
            str+=(current);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        char[][]arr = new char[n][n];

        for(int i=0; i<n; i++) {
            String tem = in.next();
            for(int j=0; j<n; j++){
                arr[i][j] = tem.charAt(j);
            }
        }
        solution(n,arr,0,0);

        System.out.println(str);

    }
}
