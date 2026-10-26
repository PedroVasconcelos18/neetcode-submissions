class Solution {
    public boolean isPalindrome(String s) {
        
        char[] parts = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();;
        int y = parts.length - 1;

        for (int i = 0; i < parts.length; i++) {

            if (parts[i] != (parts[y]) && i != y) {
                return false;
            }
            y--;
        }

        return true;

    }
}
