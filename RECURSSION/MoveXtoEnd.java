public class MoveXtoEnd {

    public static void moveToEnd(String s,int idx,String newString,int count){
        if(s.length()-1==idx){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if(s.charAt(idx)=='x'){
            count++;
            moveToEnd(s, idx+1, newString, count);
        }
        else{
            newString+=s.charAt(idx);
            moveToEnd(s, idx+1, newString, count);
        }
    }
    public static void main(String[] args) {
        String s1="abxxcdxf";
        String s=" ";
        moveToEnd(s1, 0, s, 0);
    }
}
