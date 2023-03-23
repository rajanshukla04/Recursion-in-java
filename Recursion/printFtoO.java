public class printFtoO{


    public static void PrintNum(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        PrintNum(n-1);
        //this is work on stack when we going to push in stack then print all statemnt 
        // after that we call the funtion to return the every time when pop happen in memoery
        // for every recursion the variable is created 
        // in iteration there is only one variable but not same in recursion
        //if we does not give the base case the stack overflow condition happen 
        // when recursion functon return it check there is any code less or any work whihc i have to deo after that 
        // stack return from the  top of element in stack 


        System.out.println("done i am "+n);
    
    }
    public static void print(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args) {
    int n=5;
    //PrintNum(n);
    print(1);
    }
}