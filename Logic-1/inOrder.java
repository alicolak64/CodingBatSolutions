public class inOrder {

    public boolean inOrder(int a, int b, int c, boolean bOk) {

        if ( bOk && c > b) 
            return true;
        else 
            return ( c > b && b > a );
    
    }
      

}