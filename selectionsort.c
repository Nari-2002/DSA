// selection sort

#include <stdio.h>
int main(){
  int i,j,n=5;
  int a[]={1,21,4,5,2};
  for(i=0;i<n-1;i++){
    int min=i;
    for(j=i+1;j<n;j++){
      if(a[j]<a[min]){
        min=j;
      }
      
      
    }
    if(min!=i){
        int t=a[i];
        a[i]=a[min];
        a[min]=t;
    }
  }
  for(i=0;i<n;i++){
    printf("%d  ",a[i]);
  }
  return 0;
}
