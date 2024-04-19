public class SumOfDiagonalElements {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {3,2,1},
            {1,2,4}
        };
        int sum=0;
        for(int i=0;i<a.length;i++){
           
                sum=sum+a[i][i];
            
        }
        System.out.println(sum);

    }
}
