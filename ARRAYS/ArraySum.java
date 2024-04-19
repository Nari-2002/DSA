public class ArraySum {
    
    public static void main(String[] args) {
        
        int a[]={2,1,5,4,3};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("array sum is : "+sum);
    }
}
