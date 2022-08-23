public class stringX {

    public String stringX(String str) {

        String word = "";
        int length = str.length();

        if (length > 0) {

            if (str.charAt(0) == 'x')
                word += "x";

            for (int i = 0; i < length; i++)
                if (!(str.substring(i, i + 1).equals("x")))
                    word += str.substring(i, i + 1);

            if ( ( str.charAt(length - 1) == 'x' ) && ( length > 1 ) )
                word += "x";

        }

        return word;

    }

}