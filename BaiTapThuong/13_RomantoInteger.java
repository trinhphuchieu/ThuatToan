class Solution {
    
    // way 1
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        for(int i = 1 ; i < s.length() ; i++)
        {
            if(map.get(s.charAt(i-1)) < map.get(s.charAt(i)))
            {
                sum = sum + map.get(s.charAt(i)) -  map.get(s.charAt(i-1))*2;
            }else
            {
                sum += map.get(s.charAt(i));
            }
        }
        return sum + map.get(s.charAt(0));
    }
    
    //fast way 2 == way1
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        s = s.replace("IV", "IIII").replace("IX", "VIIII");
        s = s.replace("XL", "XXXX").replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC");
        for(int i = 0 ; i < s.length() ; i++)
        {
            sum += map.get(s.charAt(i));
        }
        return sum;
    }
    
    // way 3 fast
    public int romanToInt(String s) {
        
        int sum = 0 , prevNum = 0 , num = 0;
        for(int i = 0 ; i < s.length(); i++)
        {
            switch(s.charAt(i))
            {
                case 'I': 
                    num = 1;
                    break;
                case 'V': 
                    num = 5;
                    break;
                case 'X': 
                    num = 10;
                    break;
                case 'L': 
                    num = 50;
                    break;
                case 'C': 
                    num = 100;
                    break;
                case 'D': 
                    num = 500;
                    break;
                case 'M': 
                    num = 1000;
                    break;
            }
            if(num > prevNum)
            {
                sum += num - prevNum *2;
            }else
            {
                sum += num;
            }
            prevNum = num;
        }
        return sum;
    }
    
}
