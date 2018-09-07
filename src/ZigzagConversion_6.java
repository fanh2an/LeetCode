/*
    将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：

    P   A   H   N
    A P L S I I G
    Y   I   R
    之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"

    实现一个将字符串进行指定行数变换的函数:

    输入: s = "PAYPALISHIRING", numRows = 4
    输出: "PINALSIGYAHRPI"
    解释:

    P     I    N
    A   L S  I G
    Y A   H R
    P     I

    第0行，相邻数组下标 间隔 2*numRows-2 = 2 *（numRows-i-1)
    第1行，相邻数组下标 间隔 2*numRows-4 = 2 *（numRows-i-1)
 */
public class ZigzagConversion_6 {
    public String convert(String s, int numRows) {
        StringBuilder res = new StringBuilder();
        if(numRows<=1)
            return s;
        int size = 2*numRows-2;         //字符串分组大小
        for(int i=0;i<numRows;i++)      //逐行打印
        {
            for(int j=i;j<s.length();j+=size) {
                res.append(s.charAt(j));
                int temp = j + 2*(numRows-i-1);
                if (i != 0 && i != numRows - 1 && temp < s.length())
                    res.append(s.charAt(temp));
            }
        }


        return res.toString();
    }
}
