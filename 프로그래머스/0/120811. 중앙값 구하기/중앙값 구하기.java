import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 배열 오름차순 정렬
        
        int length = array.length;
        
        if(length % 2 == 1) { // 배열 길이가 홀수이면
            return array[length / 2]; // 배열 길이를 2로 나눈 몫 = 배열 번째
        } else { // 배열 길이가 짝수이면
            return (array[length / 2] - 1 + array[length / 2]) / 2; // 중간값 2개의 평균
        }
    }
}