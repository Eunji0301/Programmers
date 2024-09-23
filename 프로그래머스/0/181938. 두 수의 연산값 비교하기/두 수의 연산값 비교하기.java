class Solution {
    public int solution(int a, int b) {
        int answer1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int answer2 = 2 * a * b;
        
        if (answer1 >= answer2) {
            return answer1;
        }
        return answer2;
    }
}