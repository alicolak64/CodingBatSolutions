public class fizzString {

    public String fizzString(String str) {

        int length = str.length() ;

        if ( str.substring ( 0 , 1 ).equals ( "f" ) && str.substring ( length - 1 ).equals ( "b" ) ) 
            return "FizzBuzz";
        else if ( str.substring ( 0 , 1 ).equals ( "f" ) ) 
            return "Fizz";
        else if ( str.substring ( length - 1 ).equals( "b" ) ) 
            return "Buzz";
        else 
            return str;
    
    }

}