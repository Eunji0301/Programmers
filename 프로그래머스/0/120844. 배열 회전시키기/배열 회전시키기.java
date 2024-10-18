class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for(int i = 1; i < numbers.length; i++) {
            if(direction.equals("right")) {
                answer[0] = numbers[numbers.length - 1];
                answer[i] = numbers[i - 1];
            } else if(direction.equals("left")) {
                answer[numbers.length - 1] = numbers[0];
                answer[i - 1] = numbers[i];
            }
        }
        return answer;
    }
}