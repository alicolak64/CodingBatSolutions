public class extraEnd {

    public String extraEnd(String str) {

        int length = str.length() ;
        String s = str.substring ( length - 2 , length );
        return s+s+s;
        
    }

}