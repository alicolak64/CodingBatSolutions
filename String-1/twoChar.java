public class twoChar {

    public String twoChar(String str, int index) {

        int length = str.length();

        if ( index >= length - 1  || index < 0 ) 
            return str.substring(0,2);
        else 
            return str.substring ( index , index + 2 );
    
    }
      

}