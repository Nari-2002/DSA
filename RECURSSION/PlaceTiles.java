public class PlaceTiles {
    public static int placeTile(int n,int m){
        if(n==m){
            return n;
        }
        if(n<m){
            return 1;
        }

        int v=placeTile(n-m,m);
        int h=placeTile(n-1, m);
        return h+v;
    }
    public static void main(String[] args) {
        System.out.println(placeTile(4, 3));
    }
}
