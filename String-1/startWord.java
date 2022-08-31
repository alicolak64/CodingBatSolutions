public class startWord {

    public String startWord(String str, String word) {

        int length1 = str.length();
        int length2 = word.length();


        if ( length1 > 0 && length1 >= length2 ){

          if ( length2 == 1 ) 
            return str.substring(0,1);
          else if ( length2 > 1 && str.substring ( 1 , length2 ).equals( word.substring( 1 , length2 )))
            return str.substring( 0 , length2 );

        } else 
            return "";

        }
        

}