public class CountPaths {
    public static int count(int i,int j,int m,int n){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }
        int down=count(i+1, j, m, n);
        int right=count(i, j+1, m, n);
        return down+right;
    }
    public static void main(String[] args) {
        System.out.println(count(0, 0, 3, 3));
    }
}
