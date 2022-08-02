public class everyNth {
  public String everyNth(String str, int n) {

    String returnStr = "";

     for( int i = 0 ; i < str.length() ; i++ ){

       int k = n * i ;

       if( k <= str.length() - 1 )
         returnStr += str.charAt(k) ;
       
     }

     return returnStr ;
     
  }

}