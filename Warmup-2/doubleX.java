public class doubleX {

	boolean doubleX(String str) {

  		int i = str.indexOf("x");

  		if ( i == -1 ) 
  			return false; // no "x" at all
  		else if ( i + 1 >= str.length() ) // Is char at i+1 also an "x"?
  			return false; // check i+1 in bounds?
  		else 
  			return str.substring( i + 1 , i + 2 ).equals("x");
  
  		// Another approach -- .startsWith() simplifies the logic
  		// String x = str.substring(i);
  		// return x.startsWith("xx");
	}

}