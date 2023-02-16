#include <iostream>
#include <cstring>
#include <algorithm>

using namespace std;

bool comp(char a, char b) {
    return a>b;
}

int main()
{
    char inp[100001];
    cin >> inp;
    int inp_len = strlen(inp);
    
    sort(inp, inp+inp_len, comp);
    
    if (inp[inp_len-1] != '0') {
        cout << -1;
        return 0;
    }
    
    int check = 0;
    for (int i=0; i<inp_len-1; i++) {
        check += (inp[i]);
    }
    if ((check % 3) != 0) {
        cout << -1;
        return 0;
    }
    
    cout << inp;
    
    return 0;
}
