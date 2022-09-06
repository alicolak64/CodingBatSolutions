public class withoutX {

    public String withoutX(String str) {

    int length = str.length();

    if ( length == 1 && str.charAt(0) == 'x' ) 
        return "";
    else if ( i > 1 ){

        if ( str.charAt(0) == 'x' && str.charAt ( length - 1 ) == 'x' ) 
            return str.substring ( 1 , length - 1 );
        else if ( str . charAt(0) == 'x' ){
            if ( length == 0 ) 
                return "";
            else 
                return str.substring ( 1 , length );
        } 
        else if ( str.charAt ( length - 1 ) == 'x' ) {
            if ( length == 0 ) 
                return "";
            else 
                return str.substring ( 0 , length - 1 );
        }
    } 
    else
        return str;

    }
    
}