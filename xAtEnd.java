public class xAtEnd {
    public static void xAtEndinstr(String str,int index,int count,String newStirng){

        if(index==str.length()){
            for(int i=0;i<count;i++){
                newStirng+='x';
            }
            System.out.println(newStirng);
            return;
        }
        char curr=str.charAt(index);
        if(curr=='x'){
            count++;
             xAtEndinstr(str, index+1, count,newStirng);
        }
        else{
            newStirng+=curr;
            xAtEndinstr(str, index+1, count, newStirng);
        }
    }
    public static void main(String[] args) {
        String str="abxxcdxexfg";
        xAtEndinstr(str, 0, 0, "");
    }
    
}
