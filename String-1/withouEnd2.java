public class withouEnd2 {
    
    public String withouEnd2(String str) {

        int length = str.length();

        if ( length > 2 ) 
            return str.substring ( 1 , length - 1 );
        else 
            return "";
            
     }

}