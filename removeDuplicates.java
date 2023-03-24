public class removeDuplicates {
    public static boolean[] map=new boolean[26];
    public static void Rdublicate(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char curr=str.charAt(index);
        if(map[curr-'a']){
            Rdublicate(str, index+1, newString);
        }
        else{
            newString+=curr;
            map[curr-'a']=true;
            Rdublicate(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="abaacdce";
        Rdublicate(str, 0," ");
    }
    
}
