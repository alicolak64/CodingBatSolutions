public class middleTwo {

    public String middleTwo (String str) {

        int halfOfLength = ( str.length() / 2 ) - 1 ;
        
        return str.substring ( halfOfLength , str.length() - halfOfLength );
    
    }
      

}