public class Transpose2DArray {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {3,2,1},
            {1,2,4}
        };
        int transpose[][]=new int[a[0].length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                transpose[j][i]=a[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
