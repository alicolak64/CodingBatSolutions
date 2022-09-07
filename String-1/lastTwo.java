public class lastTwo {

    public String lastTwo(String str) {

        int length = str.length();

        if ( length > 1 ) {
            if ( length > 2 ) 
                return str.substring(0,i-2)+str.substring(i-1,i)+str.substring(i-2,i-1);
            else 
                return str.substring(i-1,i)+str.substring(i-2,i-1);
        } else 
            return str;
            
    }

}