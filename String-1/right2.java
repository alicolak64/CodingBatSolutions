public class right2 {

    public String right2 (String str) {

        int length = str.length();

        if ( length > 2 ) 
            return str.substring ( length - 2 , length ) + str.substring ( 0 , length - 2 );
        else
            return str;

    }
      

}