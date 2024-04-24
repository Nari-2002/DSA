public class Subseq {
    public static void subseq(String str,int idx,String neString){
        if(idx==str.length()){
            System.out.println(neString);
            return;
        }

        char c=str.charAt(idx);
        subseq(str, idx+1, neString+c);
        subseq(str, idx+1, neString);
    }
    public static void main(String[] args) {
        subseq("abcd", 0, "");
    }
}
