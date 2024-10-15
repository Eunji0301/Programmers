class Solution {
    public int solution(String[] order) {
        int price = 0;
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("americano") || order[i].equals("anything")) {
                price += 4500;
            } else {
                price += 5000;
            }
        }
        return price;
    }
}