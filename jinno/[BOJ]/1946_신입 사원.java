import java.util.*;

class person implements Comparable<person>{
    public int doc;
    public int itv;
    public person(int doc, int itv){
        this.doc = doc;
        this.itv = itv;
    }

    @Override
    public int compareTo(person p){
        if(this.doc < p.doc)
            return -1;
        else
            return 1;
    }
}

public class Main {
    public static int solution(ArrayList<person> arr ){
        int N=arr.size();
        int cnt =0, tmp =N+1;
        Collections.sort(arr);
        for(int i=0; i<N; i++){
            if(arr.get(i).itv < tmp){
                cnt++;
                tmp = arr.get(i).itv;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int T = in.nextInt();
       int[] cnt = new int[T];

       for(int i=0; i<T; i++){
           int N=in.nextInt();
           ArrayList<person> arr = new ArrayList<>();
           for(int j=0; j<N; j++){
               int doc = in.nextInt();
               int itv = in.nextInt();
               arr.add(new person(doc,itv));
           }
           cnt[i] = solution(arr);
       }
       for(int i=0; i<T; i++){
           System.out.println(cnt[i]);
       }
    }
}
