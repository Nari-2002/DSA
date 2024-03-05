public class array {
    public static void search_array(int a[],int key)
        {
            for(int i=0;i<a.length;i++){
                if(a[i]==key){
                    System.out.println("found at:"+i);
                    break;
                }
            }
        }
        public static void min_element(int a[]){
            int min=a[0];
            for(int i=0;i<a.length;i++){
                if(a[i]<min){
                    min=a[i];
                }
            }
            System.out.println("min is:"+min);

        }
        public static void max_element(int a[]){
            int max=a[0];
            for(int i=0;i<a.length;i++){
                if(a[i]>max){
                    max=a[i];
                }
            }
            System.out.println("max is:"+max);

        }
    public static void main(String[] args) {
        
        int[] b={1,2,3,4,5};
        search_array(b,2);
        min_element(b);
        max_element(b);
    }
    
}

