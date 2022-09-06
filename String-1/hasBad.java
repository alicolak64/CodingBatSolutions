public class hasBad {

    public boolean hasBad(String str) {

        int length = str.length();
        
        if ( length == 3 && ! ( str.substring ( 0 , 3 ).equals ("bad") ) ) 
            return false;
        else if (length>=3) 
            return str.substring ( 0 , 3 ).equals("bad") || str.substring ( 1 , 4 ).equals("bad") ;
        else 
            return false;

    }

}