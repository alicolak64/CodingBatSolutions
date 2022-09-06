public class conCat {

    public String conCat(String a, String b) {

        int length1 = a.length();
        int length2 = b.length();

        if ( length1 > 0 && length2 > 0 ){

          if ( a.substring ( length1 - 1 , length1 ).equals ( ( b.substring ( 0 , 1 ) ) ) )
            return a.substring(0,i-1)+b;
          else 
            return a+b;

        } else 
            return a+b;

      }
      

}