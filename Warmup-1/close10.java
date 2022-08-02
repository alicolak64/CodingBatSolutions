public class close10 {

	public int close10(int a, int b) {

	  	int x = Math.abs( a - 10 ) ;
	  	int y = Math.abs( b - 10 ) ;

	  	if(x == y) 
	  		return 0;
	  	if( x > y ) 
	  		return b ;

	  	return a ;
	  	
	}

}