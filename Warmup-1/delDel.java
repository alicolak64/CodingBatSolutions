public class delDel {

	public String delDel ( String str ) {

    	if ( str.length() <= 3 ) 
    		return str ;
        else if ( str.substring( 1 , 4 ).equals("del")) 
        	return str.substring( 0 , 1 ) + str.substring( 4 , str.length() );
  		else 
  			return str ;

    }

}