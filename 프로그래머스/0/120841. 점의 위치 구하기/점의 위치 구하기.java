class Solution {
    public int solution(int[] dot) {
        int num = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            num = 1;
        }
        else if (dot[0] < 0 && dot[1] > 0) {
            num = 2;
        }
        else if (dot[0] < 0 && dot[1] < 0) {
            num = 3;
        }
        else if (dot[0] > 0 && dot[1] < 0) {
            num = 4;
        }
        return num;
    }
}