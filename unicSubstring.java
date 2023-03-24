import java.util.HashSet;

public class unicSubstring {
    public static void subSequenceUnic(String str,int idx,String newString,HashSet<String>set){
            if(idx==str.length()){
                if(set.contains(newString)){
                    return;
                }
                else{
                    System.out.println(newString);
                    set.add(newString);
                    return;
                }
            }


        // to be 
        char curr=str.charAt(idx);
        subSequenceUnic(str, idx+1, newString+curr, set);
        // not selcted that charcter
        subSequenceUnic(str, idx+1, newString, set);
    }
    
    public static void main(String[] args) {
        
        String str1="aaa";
        HashSet<String >set=new HashSet<>();
        System.out.println("String is aaa :");
        subSequenceUnic(str1, 0, "", set);
    }
}
