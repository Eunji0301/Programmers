class Solution {
    public int solution(String my_string) {
        int sum = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]","");
        String[] str = my_string.split("");
        
        for(String i : str) {
            sum += Integer.parseInt(i);
        }
        return sum;
    }
}