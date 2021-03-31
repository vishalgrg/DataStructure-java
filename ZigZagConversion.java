
/* The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
 (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
*/
class ZigZagConversion {
    public String convert(String s, int numRows) {
        
        Map<Integer,StringBuilder> map = new HashMap<>();
         int pos = 0;
        boolean inc = true;   
        for(char c : s.toCharArray()){
    
          if(pos == numRows) inc = false;
          if(pos == 1) inc = true;
          if(inc) pos++; else pos--;
            
            if(!map.containsKey(pos))
                map.put(pos,new StringBuilder());
            map.get(pos).append(c);
            
        }
        
        StringBuilder res = new StringBuilder();
        for(int i : map.keySet()){
            res.append(map.get(i));
        }
        
        return res.toString();
            
    }
}
