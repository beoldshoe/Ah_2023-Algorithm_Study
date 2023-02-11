#include <iostream>
#include <vector>

using namespace std;

int blue = 0;
int white = 0;

void recur(vector<vector<int>> & map, int a, int b, int c, int d) {
    int for_check = map[a][c];
    int ck = 1;
    for (int i=a; i<b; i++)
        for (int j=c; j<d; j++)
            if (for_check != map[i][j]) {
                ck = 0;
            }
    
    if (!ck) {
        recur(map, a, (a+b)/2, c, (c+d)/2);
        recur(map, a, (a+b)/2, (c+d)/2, d);
        recur(map, (a+b)/2, b, c, (c+d)/2);
        recur(map, (a+b)/2, b, (c+d)/2, d);
    }
    else {
        if (map[a][c]==1)
            blue++;
        else
            white++;
    }
}

int main()
{
    int N;
    cin >> N;
    
    vector<vector<int>> map(N, vector<int>(N));
    
    for (int i=0; i<N; i++)
        for (int j=0; j<N; j++)
            cin >> map[i][j];
    
    recur(map, 0, N, 0, N);
    
    cout << white << '\n';
    cout << blue;

    return 0;
}
