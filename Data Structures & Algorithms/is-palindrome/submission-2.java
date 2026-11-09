class Solution {
    public boolean isPalindrome(String s) {

        char[] words = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase().toCharArray();
        int left = 0;
        int right = words.length - 1;

        while (left < right) {

            if (words[left] != words[right]) {
                return false;
            }

            right--;
            left++;
        }

        return true;
        

    }
}
