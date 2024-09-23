import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int lastElement = num_list[num_list.length - 1];
        int secondElement = num_list[num_list.length - 2];
        int newElement = 0;
        
        if(lastElement > secondElement) {
            newElement = lastElement - secondElement;
        } else {
            newElement = lastElement * 2;
        }
        
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        
        answer[answer.length - 1] = newElement;
        
        return answer;
    }
}