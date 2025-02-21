class Solution {
    public boolean isValid(String s) {
        char[] pArray = s.toCharArray();

        Map<Character,Character> opposite = new HashMap<>();
        opposite.put(')','(');
        opposite.put('}','{');
        opposite.put(']','[');

        Stack<Character> pStack =new Stack<>();

        for(char c: pArray)
        {
            if( (c == '(') ||  (c == '{') ||  (c == '[') )
            {
                pStack.push(c);
            }
            else
            {
                if(!pStack.isEmpty())
                {
                    char tempChar= pStack.pop();

                    if( !(tempChar == opposite.get(c)) )
                    {
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }


        return pStack.isEmpty();
    }
}