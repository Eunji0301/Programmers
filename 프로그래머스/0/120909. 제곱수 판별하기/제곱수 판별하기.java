class Solution {
    public int solution(int n) {
        int result = 0;
        
        result = (int) Math.sqrt(n);
        int number = result * result;
        
        if (number == n) {
            return 1;
        }
        else {
            return 2;
        }
    }
}