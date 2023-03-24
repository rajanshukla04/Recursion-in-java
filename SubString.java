public class SubString {
    public static void subSequence(String str,int idx,String newString){

        if(idx==str.length()){
            System.err.println(newString);
            return;
        }
        // to be in stre
        char curr=str.charAt(idx);
        subSequence(str, idx+1, newString+curr);
        // to not be select 
        subSequence(str, idx+1, newString);
    }
 public static void main(String[] args) {
    String str="abc";
    subSequence(str, 0,"");
 }   
}
