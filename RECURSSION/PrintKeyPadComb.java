public class PrintKeyPadComb {
    public static String keys[]={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printcomb(String str,int idx,String combination){
        if(str.length()==idx){
            System.out.println(combination);
            return;
        }
        char c=str.charAt(idx);
        String mapping=keys[c-'0'];
        for(int i=0;i<mapping.length();i++){
            
            printcomb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printcomb("23", 0, "");
    }
}
