public class without2 {

    public String without2(String str) {

        int length = str.length();
        
        if ( length > 1 && str.substring ( 0 , 2 ).equals ( str.substring ( length - 2 , length ) ) )  
            return str.substring(2);
        else 
            return str;

    }
      

}