public class front3 {

	public String front3(String str) {

  		if( str.length() < 3 ) 
  			return str + str + str ;

  		String src = str.substring( 0 , 3 );
  		return src + src + src ;
  		
	}

}