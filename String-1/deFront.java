public class deFront {

    public String deFront(String str) {    

        int length = str.length() ;

        if ( ( str.substring ( 0 , 1 ).equals("a")) && ( str.substring ( 1 , 2 ).equals("b") ) )  
            return str;
        else if ( str.substring ( 0 , 1 ).equals("a")) 
            return str.substring ( 0 , 1 ) + str.substring ( 2 , length );
        else if ( str.substring ( 1 , 2 ).equals("b")) 
            return str.substring ( 1 , length );
        else 
            return str.substring( 2 , length );
            
      }
      

}