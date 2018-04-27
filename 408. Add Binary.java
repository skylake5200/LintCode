public class Solution {
    /**
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    public String addBinary(String a, String b) {
        // write your code here
        
        String result = "";
        if(a.length() < b.length()){ //总是在a中保存最长的序列
            
            String temp = a;
            a = b;
            b = temp;
            
        }
        int a_len = a.length() - 1;
        int b_len = b.length() - 1;
        
        int m = 0;
        int n = 0;
        int sum = 0;
        int c = 0;
        for(int i = a_len; i >= 0; i--){
            
            if(b_len >= 0){

                m = Integer.parseInt(b.substring(b_len, b_len + 1)); //提取字符并转化为数字
                n = Integer.parseInt(a.substring(a_len, a_len + 1));
                b_len--;
                a_len--;
                sum = m + n + c;
                
                if(sum == 0 || sum == 1){
                    
                    result = sum + result;
                    c = 0;
                    
                }else if(sum == 2){
                    
                    result = 0 + result;
                    if(i == 0){
                    
                        result = 1 + result;
                        return result;
                    }
                    c = 1;
                    
                }else{ //sum == 3
                    
                    result = 1 + result;
                    if(i == 0){
                    
                        result = 1 + result;
                        return result;
                    }
                    c = 1;
                    
                }  
            }else{ //如果短序列已经加完了
                
                if(c == 0){
                    
                    result = a.substring(i,i+1) + result;
                }else{
                    
                    sum = c + Integer.parseInt(a.substring(i,i+1));
                    if(sum == 1){
                        
                        result = 1 + result;
                        c = 0;
                    }else{
                        
                        c = 1;
                        result = 0 + result;
                        if(i == 0 && c == 1){ //没有下次循环了
                            
                            result = 1 + result;
                        }
                    }
                }
            }   
        }
        return result;
    }
}