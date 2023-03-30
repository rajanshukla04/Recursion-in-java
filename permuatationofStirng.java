package Alogrithm.Recursion;

public class permuatationofStirng {
    public static void printPerm(String str,String permuation){
            if(str.length()==0){
                System.err.println(permuation);
                return;
            }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String NewString=str.substring(0, i)+str.substring(i+1);
            printPerm(NewString, permuation+currChar);
        }

    }
    
    public static void main(String[] args) {
        String st="abc";
        printPerm(st,"");
    }
}
