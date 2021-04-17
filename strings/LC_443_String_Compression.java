class Solution {
    public int compress(char[] chars) {
        int rI = 0;
        int s = 0;
        int count = 0;
        int e = 0;
        
        while(e != chars.length){
            if(chars[s] == chars[e]){
                e++;
                count++;
            }else{
                if(count == 1){
                    chars[rI] = chars[s];
                    rI += 1;
                    s = e;
                    count = 0;
                }else{
                    chars[rI] = chars[s];
                    rI++;
                    int temp = 0;
                    if(count > 9){
                        temp = count/10;
                        chars[rI++] = Character.forDigit(temp,10);
                    }
                    temp = count%10;
                    chars[rI++] =  Character.forDigit(temp,10);
                    count = 0;
                    s = e;
                }
            } 
        }
        if(count == 1){
            chars[rI] = chars[s];
        }else{
            chars[rI++] = chars[s];
            int temp = 0;
            if(count > 9){
                temp = count/10;
                chars[rI++]= Character.forDigit(temp,10);
            }
            temp = count%10;
            chars[rI]=  Character.forDigit(temp,10);
        }
            
        return rI + 1;
    }
}