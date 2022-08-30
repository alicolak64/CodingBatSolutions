public class middleThree {

    public String middleThree(String str) {

        
        int length = ( str.length() - 3 ) / 2 ;

        if (str.length()>3) 
            return str.substring( length , length + 3 );
        else    
            return str ;

      }
      

}