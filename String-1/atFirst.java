public class atFirst {

    public String atFirst(String str) {

        int length = str.length();
        
        if ( length == 0 ) 
            return "@@";
        else if ( length == 1 ) 
            return str+"@";
        else 
            return str.substring ( 0 , 2 );

    }
      

}