class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2  == 1) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }
        
        int oddNum = Integer.parseInt(odd);
        int evenNum = Integer.parseInt(even);
        
        return oddNum + evenNum;
    }
}