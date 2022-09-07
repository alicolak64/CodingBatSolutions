public class minCat {

    public String minCat ( String a, String b ) {

        int length1 = a.length();
        int length2 = b.length();

        if ( length1 > length2 ) 
           return a.substring ( length1 - length2 , length1 ) + b ;
        else if ( length1 < length2 )
           return a + b.substring ( length2 - length1 , length2 );
        else 
            return "";
            
      }
      

}