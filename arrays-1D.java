import java.util.*;
public class arrays{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();
        int[] m=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<size;i++){
            m[i]=sc.nextInt();
        }
        System.out.println("enter key value:");
        int key=sc.nextInt();
        for(int i=0;i<m.length;i++){
            if(m[i]==key){
                System.out.println("found at:"+i);
                break;
            }
            
        }
        
    }
}

