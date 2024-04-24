public class RemoveDups {
    public static boolean map[]=new boolean[26]; 
    public static void removedups(int idx,String s,String newString){
        if(idx==s.length()){
            System.out.println(newString);
            return;
        }
        char c=s.charAt(idx);
        
        if(map[c-'a']==false){
            map[c-'a']=true;
            newString+=c;
            removedups(idx+1, s, newString);
        }
        else{
            removedups(idx+1, s, newString);
        }

    }
    public static void main(String[] args) {
        String s="aabbccd";
        String s1=" ";
        removedups(0, s, s1);
    }
}
