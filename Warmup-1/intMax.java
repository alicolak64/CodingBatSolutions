public class intMax {

	public int intMax(int a, int b, int c) {

    	int max = 0 ;
    	
  		if ( a >= b && a >= c )  
  			max = a ;
  		if ( b >= a && b >= c )  
  			max = b;
  		if( c >= a && c >= b )  
  			max = c;
  		
  		return max;

	}

}