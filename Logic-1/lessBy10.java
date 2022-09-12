public class lessBy10 {

    public boolean lessBy10(int a, int b, int c) {

        int i = Math.abs(a-b);
        int k = Math.abs(b-c);
        int s = Math.abs(a-c);
         
        return i >= 10 || k >= 10 || s >= 10 ;
    
    }
    

}