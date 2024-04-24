public class FirstAndLastOccurance {
    //first and last occurance of a  charecter in a string

    public static int f = -1;
    public static int l = -1;
    public static void findoccurance(String s,int i,char element){
        if(i==s.length())
        {
            System.out.println(f);
            System.out.println(l);
            return;
        }
        char c=s.charAt(i);
        if(c==element){
            if(f==-1){
                f=i;
            }
            else{
                l=i;
            }
        }
        findoccurance(s, i+1, element);
    }


    public static void main(String[] args) {
        findoccurance("narendra", 0, 'a');
        
    }
}


