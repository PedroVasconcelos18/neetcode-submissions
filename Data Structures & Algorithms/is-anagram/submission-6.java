class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        boolean anagram = false;

        if (charsS.length != charsT.length) {
            return false;
        }

        Arrays.sort(charsS);
        Arrays.sort(charsT);

        // x     x     d
        // c     x     b

        // SORT

        // d     x     x
        // b     c     x
        // false true false

        for (int i = 0; i < charsS.length; i++) {

            if (charsS[i] != charsT[i]) {
                return false;
            }

            anagram = true;
        }

        return anagram;
    }
}
