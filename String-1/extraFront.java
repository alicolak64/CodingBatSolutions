public class extraFront {

    public String extraFront(String str) {

        int length = str.length();

        if ( length == 1 ) 
            return str + str + str ;
        else if ( length > 1 )  
            return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        else 
            return "";
            

      }

}