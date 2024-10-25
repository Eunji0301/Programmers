import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();
        
        // String[] answer = new String[names.length() % 5];
        for(int i = 0; i < names.length; i++) {
           if(i % 5 == 0) {
               answer.add(names[i]);
           }
        }
        return answer.toArray(new String[answer.size()]);
    }
}