public class ArrayMaxMin {
    public static void main(String[] args) {
        int a[]={2,1,5,4,3};
        int min=a[0];
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);
    }
}
