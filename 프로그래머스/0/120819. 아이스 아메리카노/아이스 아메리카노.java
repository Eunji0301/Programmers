class Solution {
    public int[] solution(int money) {
        int[] jan_money = new int[2];
        
        jan_money[0] = money / 5500;
        jan_money[1] = money - 5500 * jan_money[0];
        return jan_money;
    }
}