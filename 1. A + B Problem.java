public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b 
     */
    int s = 0;
    int c = 0;
    public int aplusb(int a, int b) {
        // write your code here
        // 注意规律即可
        s = a ^ b;
        c = (a & b) << 1;
        if(c == 0){
            return s;
        }
        return aplusb(s,c);
      
    }
}