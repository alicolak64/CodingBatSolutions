public class frontTimes {

    public String frontTimes(String str, int n) {

        String word = "";
        
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                word += str;
            }
            return word;
        }

        String threeLetter = str.substring(0, 3);
        
        for (int i = 0; i < n; i++) {
            word += threeLetter;
        }

        return word;

    }

}