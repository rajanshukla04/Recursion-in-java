import java.util.EnumSet;

public class XpowN {
    public static int calPower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x*calPower(x, n-1);
    }

    // time compution-logn
    // xpowern is can used to  n/2 for two time 3
    // xpower of x is odd then x*n/2 two time with the x 
public static int calpowerLog(int x,int n){
    if(x==0){
        return 0;
    }
    if(n==0){
        return 1;
    }
    if(n%2==0){
        return calPower(x, n/2)*calPower(x, n/2);
    }
    else{
        return x*calPower(x, n/2)*calPower(x, n/2);
    }
   
}



    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(calPower(x, n));
        System.out.println(calpowerLog(x, n));
       
    }
}
