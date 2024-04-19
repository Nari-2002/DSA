public class Search2D {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int k=9,col=0,row=0;
        boolean found=false;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==k){
                    found=true;
                    col=j;row=i;
                    break;
                }
            }
        }
        if(found){
            System.out.println("found at row "+row+" col "+col);
        }
        else{
            System.out.println("not found");
        }
    }
}
