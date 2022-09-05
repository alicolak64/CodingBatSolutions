public class nTwice {

    public String nTwice ( String str , int n ) {

        int length = str.length();

        return str.substring ( 0 , length ) + str.substring ( length - n , length );
    
    }

}