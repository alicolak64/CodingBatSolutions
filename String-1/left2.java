public class left2 {
    
    public String left2(String str) {

        int length = str.length();

        if ( length > 2 ) 
            return str.substring ( 2 , length ) + str.substring ( 0 , 2 ) ;
        else 
            return str;
            
    }
      

}