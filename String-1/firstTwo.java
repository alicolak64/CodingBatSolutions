public class firstTwo {

    public String firstTwo(String str) {

        int length = str.length();

        if ( length >= 2 ) 
            return str.substring(0,2);
        else 
            return str;
            
    }

}