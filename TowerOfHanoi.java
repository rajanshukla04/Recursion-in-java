public class TowerOfHanoi{
    public static void ToHanoi(int n,String src,String helper,String des){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+des);
            return;
        }
        ToHanoi(n-1,src,des,helper);
        System.out.println("transfer disk "+n+"from "+src+"to"+des);
        ToHanoi(n-1,helper,src, des);


    }
    public static void main(String[] args) {
        int n=1;
        ToHanoi(n,"S","H","D");
        
    }
}