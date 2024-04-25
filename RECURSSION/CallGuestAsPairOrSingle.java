public class CallGuestAsPairOrSingle {
    public static int call(int n){

        if(n<=1){
            return 1;
        }
        int single=call(n-1);
        int jodi=(n-1)*call(n-2);
        return single+jodi;
    }
    public static void main(String[] args) {
        System.out.println(call(4));
    }
}
