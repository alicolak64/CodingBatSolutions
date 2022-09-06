public class frontAgain {

    public boolean frontAgain(String str) {

        int length = str.length();

        if ( length > 1 && str.substring ( 0 , 2 ).equals ( str.substring( length - 2 , length ) ) ) 
            return true;
        else
            return false;
            
    }
       

}