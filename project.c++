#include <iostream> 
#include <string>
using namespace std;
struct per{
string name;
int age;
string job;
};

int main(){
    int x;
   cout <<"how many person?\n";
    cin>>x;
per one[x];
for(int i=0;i<x;i++){
cout <<"please enter data of :"<<i+1 <<" person\n";
cin>>one[i].name>>one[i].age>>one[i].job;
cout<<"the name is :"<<one[i].name<<"\nthe age is :"<<one[i].age<<"\nthe job is :"<<one[i].job<<endl;
}
    return 0;
}