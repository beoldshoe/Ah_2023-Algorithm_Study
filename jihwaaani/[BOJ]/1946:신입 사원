#include <iostream>
#include <vector>
#include <algorithm>
#include <utility>

using namespace std;

bool comp(pair<int,int> &a, pair<int,int> &b) { //sort with ".first"
    return ((a.first)<(b.first));
}

int main()
{
    int T;
    cin >> T;
    
    for (int test_case = 0; test_case<T; test_case++) {
        int N;
        cin >> N;
        vector<pair<int, int>> list(N);
        
        for (int i=0; i<N; i++)
            cin >> list[i].first >> list[i].second;
        sort(list.begin(), list.end(), comp);
        
        int count = 1;
        int record = list[0].second;
        for (int i=1; i<N; i++) {
            if (list[i].second < record) {
                count++;
                record = list[i].second;
            }
        }
        cout << count << '\n';
    }
    return 0;
}
