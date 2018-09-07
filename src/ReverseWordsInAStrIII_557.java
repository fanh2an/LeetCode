/*
    给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

    示例 1:

    输入: "Let's take LeetCode contest"
    输出: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordsInAStrIII_557 {
    public String reverseWords(String s) {
        String []strarray = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<strarray.length;i++)
        {
            for(int j=strarray[i].length()-1;j>=0;j--)
            {
                sb.append(strarray[i].charAt(j));
            }
            if(i<strarray.length-1)
                sb.append(" ");
        }
        return sb.toString();

    }
}
