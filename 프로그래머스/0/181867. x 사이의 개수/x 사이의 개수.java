import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] parts = myString.split("x",-1);
        for(String part : parts) {
            answer.add(part.length());
        }
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}