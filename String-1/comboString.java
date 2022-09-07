public class comboString {

    public String comboString(String a, String b) {

        int length1 = a.length();
        int length2 = b.length();
        
        if ( length1 < length2 ) 
            return a + b + a ;
        else 
            return b + a + b ;

    }
      

}