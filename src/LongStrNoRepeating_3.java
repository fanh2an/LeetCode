/*给定一个字符串，找出不含有重复字符的最长子串的长度。

    示例：

    给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。

    给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。

    给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。

*/
public class LongStrNoRepeating_3 {
    public int lengthOfLongestSubstring(String s) {

        int res = 0;
        if(s.length()<=1)
            return s.length();
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            for(int j=i+1;j<s.length();j++)
            {
                if(sb.toString().contains(String.valueOf(s.charAt(j)))) {
                    res = sb.toString().length() > res ? sb.toString().length() : res;
                    break;
                }
                sb.append(s.charAt(j));
            }
            res = sb.toString().length()>res? sb.toString().length():res;

        }
        return res;

    }
}
