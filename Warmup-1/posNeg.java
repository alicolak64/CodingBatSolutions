public class posNeg {

	public boolean posNeg (int a, int b, boolean negative) {

  		if ( ( ( a < 0 && b >= 0 ) || ( a >= 0 && b < 0 ) )  && !negative ) 
    		return true ;
  		else 
  			return ( negative && ( a < 0 && b < 0 ) );

	}

}