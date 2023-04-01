public class Tiles {

    // function to tiles 
    // sizes of tiles 1*m 
    // size of matrix is NxM

    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticalplacemnt=placeTiles(n-m, m);
        int hPlacement=placeTiles(n-1, m);

        return verticalplacemnt+hPlacement;
    }
    
    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(placeTiles(n, m));
    }
}
