#include<iostream>
using namespace std;
int count = 0;
/*void PrintArr(int arr[], int n){
    for (int i = 0; i <n; i++)
    {
       
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    
};
void Printstrings(int arr[], int n){
   for (int i = 0; i <n; i++)
    {
        
        for (int j = 0; j <n; j++)
    {
       
        if(j==arr[i]){
            cout<<"Q";
        }
        else{
            cout<<".";
        }
    }
    cout<<" ";
    }
    cout<<endl;
    
}*/
void PrintBoard(int arr[], int n){
    cout<<"--------CHESS BOARD--------"<<endl;
    for (int i = 0; i <n; i++)
{
        /* code */
        for (int j = 0; j < n; j++)
        {
            if(j==arr[i]){
                cout<<"Q";}
            else{
                cout<<"X";
            }    
 
            }
            cout<<endl;
        }
        
    }
    

void NQueens(int n, int a, int js[]){
    if(a==n){
     count++;   
     PrintBoard(js, n);
     return;
    }
   //int is[n];
 
   for(int j=0; j<n; j++){
    js[a]=j;
    bool flag = false;
    for(int i=0;i<a;i++){
        if(j==js[i]){
          flag = true;
        break;} 
        if(j==js[i]+a-i){
flag = true;
        break;
        }
        if(j==(js[i]-(a-i))){
flag = true;
        break;
        }
    }
    if(flag==true){
        continue;
    }
    else{
        NQueens(n, a+1, js);
    }
   }
return;

}
int main(){
    int n;
    cin>>n;
    int js[n];
    NQueens(n, 0, js);
    cout<<"Number of possible positions"<<count;
    return 0;
}