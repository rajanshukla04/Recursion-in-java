public class Guest {

    //function count the number of ways to inviate gest two option that 
    // gest come as single or as pair only
    public static int CallGuest(int n){
        if(n<=1){
            return 1;
        }
        
        //single gest 
        int ways1=CallGuest(n-1);
        // pair ges
        int ways2=(n-1)*CallGuest(n-2);
        return ways1+ways2;
        
    }
    public static void main(String[] args) {
         int n=4;
         System.out.println(CallGuest(n));
    }
    
}
