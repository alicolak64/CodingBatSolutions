public class endUp {

	public String endUp ( String str ) {

  		int length = str.length();

  		if ( length < 3 ) 
  			return str.toUpperCase();
  		else
  			return str.substring( 0 , length - 3 ) + str.substring( length - 3 , length ).toUpperCase();
	
	}

}