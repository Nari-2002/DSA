public class CharsInStr {
    public static void reverse(String s,int ind){
        if(ind==0){
            System.out.print(s.charAt(ind));
            return;
        }
       System.out.print(s.charAt(ind));
       reverse(s,ind-1);

    }
    public static void main(String[] args) {
        String s="nari";
        int i=s.length()-1;
        reverse(s,i);
    }
}