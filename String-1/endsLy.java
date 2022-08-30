public class endsLy {

    public boolean endsLy(String str) {

        int length = str.length();

        if ( length > 1) 
            return str.substring ( length - 2 , length ) .equals("ly");
        else 
            return false;
    }

}