public class stringMatch {

    public int stringMatch(String a, String b) {

        int length = Math.min(a.length(), b.length());
        int count = 0;

        // Look at both substrings starting at i
        for (int i = 0; i < length - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) { // Use .equals() with strings
                count++;
            }
        }

        return count;
    }
}