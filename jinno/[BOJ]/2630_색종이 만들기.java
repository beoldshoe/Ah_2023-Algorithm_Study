import java.util.;

public class Main {
    static int white = 0;
    static int blue = 0;
    public static void solution(int n, int[][] arr,int row,int col){
        int color = arr[row][col];
        boolean check = true;
        for(int i=row; irow+n; i++){
            for(int j=col;jcol+n; j++){
                if(arr[i][j] != color){
                    check = false;
                    break;
                }
            }
        }

        if(!check){
            solution(n2,arr,row,col);
            solution(n2,arr,row,col+n2);
            solution(n2,arr,row+n2,col);
            solution(n2,arr,row+n2,col+n2);
        }
        else{
            if(color == 0) white++;
            else blue++;
        }
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int N = in.nextInt();
       int[][]arr = new int[N][N];

       for(int i=0;iN;i++){
           for(int j=0; jN;j++){
               arr[i][j] = in.nextInt();
           }
       }
       solution(N,arr,0,0);
       System.out.println(white);
       System.out.println(blue);

    }
}
