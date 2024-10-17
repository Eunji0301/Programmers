import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
//         String[] str = null;
        
//         for (int i = numbers.length - 1; i >= 0; i--) { // 문자열 내림차순 정렬
//             str = numbers[i] + " ";
//         
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}