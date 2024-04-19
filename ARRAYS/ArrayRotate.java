public class ArrayRotate {
    public static void main(String[] args) {
        int a[]={2,1,5,4,3};
        int n=3;
        for(int i=0;i<n;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
