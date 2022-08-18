public class stringBits {

    public String stringBits(String str) {

        String word = "";

        for (int i = 0; i < str.length(); i += 2) {
            word += str.charAt(i);
        }

        return word;

    }

}
