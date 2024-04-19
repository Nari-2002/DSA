public class ArrayMerge {
    public static void main(String[] args) {
        int a[]={2,1,5,4,3};
        int b[]={6,7,5,4,3};
        int m[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            m[i]=a[i];
            System.out.print(m[i]+" ");
        }
        for(int j=0;j<b.length;j++){
            m[a.length-1+j]=b[j];
            System.out.print(m[a.length-1+j]+" ");
        }
        
    }
    
}
