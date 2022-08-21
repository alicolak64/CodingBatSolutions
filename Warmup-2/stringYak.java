public class stringYak {

    public String stringYak (String str) {

        String word = "";
        int length = str.length();

        for (int i = 0; i < length; i++) {

            if (i + 2 < m && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') 
                i = i + 2;
            else 
                word += str.charAt(i);

        }

        return word;
    }

}