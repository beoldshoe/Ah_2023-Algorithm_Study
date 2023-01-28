#include <iostream>
#include <vector>
#include <string>

using namespace std;

void recur(vector<vector<char> >&map, int i, int j, int p, int q, string & result) {  //i와 j는 past-to-end position
    
    char temp = map[i][p];
    bool check = true;
    for (int t=i; t<j; t++)
        for (int r=p; r<q; r++)
            if (map[t][r] != temp) {
                check = false;
                break;
            }
    
    if (check) {
        result.push_back(temp);
    }
    else {
        result.push_back('(');
        recur(map, i, (i+j)/2, p, (p+q)/2, result);
        recur(map, i, (i+j)/2, (p+q)/2, q, result);
        recur(map, (i+j)/2, j, p, (p+q)/2, result);
        recur(map, (i+j)/2, j, (p+q)/2, q, result);
        result.push_back(')');
    }
}

int main()
{
    int N;
    cin >> N;
    
    vector<vector<char> > map(N, vector<char>(N, 0));
    
    for (int i=0; i<N; i++)
        for (int j=0; j<N; j++)
            cin >> map[i][j];
    
    string result;
    
    recur(map, 0, N, 0, N, result);
    
    cout << result;
    

    return 0;
}
