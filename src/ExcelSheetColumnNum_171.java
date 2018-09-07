/*
    给定一个Excel表格中的列名称，返回其相应的列序号。

    例如，

        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28
        ...
 */
public class ExcelSheetColumnNum_171 {
    public int titleToNumber(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++)
            res = res *26 +(s.charAt(i)-'A'+1);

        return res;

    }
}
