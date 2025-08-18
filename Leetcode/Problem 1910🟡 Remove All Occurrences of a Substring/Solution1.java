class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int m=part.length();

        // Will iterate over the string s and keep on adding it in the string builder
        for(int i=0; i<n; i++)
        {
            sb.append(s.charAt(i));
            // Start Comparision when sb has enough elements
            if(sb.length()>=part.length())
            {
                boolean flag = true;
                
                // Checking if the occurrence is present or not
                for(int j=0; j<m; j++)
                {
                    if(sb.charAt(sb.length()-1-j)!=part.charAt(m-1-j))
                    {
                        flag = false;
                        break;
                    }
                }
                // If we find the occurence then we will delete it
                if(flag==true)
                {
                    for(int j=0; j<m; j++)
                    {
                        sb.deleteCharAt(sb.length()-1);
                    }
                }
            }
        }

        return sb.toString();
    }
}

//Time Complexity:- O(N*M)
//Space Complexity:- O(N)