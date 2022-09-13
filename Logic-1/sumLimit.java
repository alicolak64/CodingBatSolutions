public class sumLimit {

    public int sumLimit (int a, int b) 
    {
        int sum = a + b ;
        
        String str1 = String.valueOf(a) ;
        String str2 = String.valueOf(sum) ;
        
        int length1 = str1.length();
        int length2 = str2.length();
        
        if ( length1 == length2 ) 
            return a + b ;
        else 
            return a;
    
    }
      
}