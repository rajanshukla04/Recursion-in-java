

public class sumOfN{

    public static int sumOfNnumber(int n){

        if(n==0){
            return 0;
        }
        else{
        int sum=n;
        return sum+sumOfNnumber(n-1);}
    }

    // print the sum  inside the funciton 
    
    public static void printSum(int i,int n,int sum){
        
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        int n=100;
       int sum= sumOfNnumber(n);
       System.out.println(sum);
       printSum(1, 100,0);

    }

}