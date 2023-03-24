public class ReverseStr {
    
    public static void RevString(String str,int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        RevString(str, index-1);
    }
    public static void main(String[] args) {
        String st="ABDT";
        RevString(st, st.length()-1);
    }
}
