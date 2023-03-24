public class fAndLoccurence {
    public static  int frist=-1;
    public static int last=-1;
    public static void findOccurance(String st,int index,char element){
        if(st.length()==index){
            System.out.println("frist "+frist);
            System.out.println("last occurance "+last);
            return;
        }
        
        if(st.charAt(index)==element){
            if(frist==-1){
                frist=index;
            }
            else{
                last=index;
            }
        }
        findOccurance(st, index+1, element);
    }
    public static void main(String[] args) {
        String st="abcdaadega";
        findOccurance(st,0,'a');
        
    }    
    
}
