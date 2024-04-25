public class PrintPermutation{
    public static void printPer(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            System.out.println(str.substring(0, i));
            System.out.println(str.substring(i+1));
            String newStr=str.substring(0, i)+str.substring(i+1);
            System.out.println(newStr);
            printPer(newStr, permutation+c);
        }
    
    }
    public static void main(String[] args) {
        printPer("abc", "");
    }
}