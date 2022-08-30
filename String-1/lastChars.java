public class lastChars {

    public String lastChars(String a, String b) {

        int length1 = a.length();
        int length2 = b.length();

        if ( length1 == 0 && length2 == 0 ) 
            return "@@";
        else if ( length1 == 0 ) 
            return "@" + b.substring ( length2 - 1 , length2 ) ;
        else if ( length2 == 0) 
            return a.substring ( 0 , 1 ) + "@" ;
        else 
            return a.substring( 0 , 1 ) + b.substring ( length2 - 1 , length2 );
            

     }
     

}