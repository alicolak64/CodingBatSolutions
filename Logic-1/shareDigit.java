public class shareDigit {

    public boolean shareDigit(int a, int b) {
        
        int i = a / 10;
        int k = a % 10;
        int s = b / 10;
        int m = b % 10;
        
        return i==s || i==m || k==s || k==m ;
    
    }
      

}