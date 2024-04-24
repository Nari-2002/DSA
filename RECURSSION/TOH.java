
//tower of honoi |||
public class TOH {
    public static void toh(int n ,String s,String h,String d){
        if(n==1){
            System.out.println("transferred from " +s+" to "+d);
            return;
        }
        toh(n-1,s,d,h);
        System.out.println("transferred from " +s+" to "+d);
        toh(n-1,h,s,d);
    }
     public static void main(String[] args) {
        int n=3;
        toh(n, "s", "h", "d");
        
     }
}







