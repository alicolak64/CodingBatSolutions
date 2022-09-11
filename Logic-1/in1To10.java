public class in1To10 {

    public boolean in1To10 (int n, boolean outsideMode) {

        if ( !outsideMode && n <= 10 && n >= 1 ) 
            return true;
        else 
            return outsideMode && ( n <= 1 || n >= 10 ) ;
    
    }
      

}