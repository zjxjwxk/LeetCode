class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || x % 10 == 0 && x != 0){
            return false;
        }
        int revertedNumber = 0;
        while(revertedNumber < x){
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return revertedNumber == x || revertedNumber / 10 == x;
    }

    public static void main(String[] args) {
        int num = 12321;
        Solution solution = new Solution();
        System.out.println("Is " + num + " a palindrome?");
        System.out.println(solution.isPalindrome(num));
    }
}