import java.util.ArrayList;
import java.util.HashMap;

/*
    给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
    American keyboard

    示例1:

    输入: ["Hello", "Alaska", "Dad", "Peace"]
    输出: ["Alaska", "Dad"]
 */
public class KeyboardRow_500 {
    public String[] findWords(String[] words) {
        String[] Str = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<Str.length; i++) {
            for(char c : Str[i].toCharArray()) {
                map.put(c, i);
            }
        }
        int index = 0;
        ArrayList<String> res = new ArrayList<>();
        for(String word : words) {
            if (word.equals(""))
                continue;
            index = map.get(word.toUpperCase().toCharArray()[0]);
            for(char c : word.toUpperCase().toCharArray()) {
                if(map.get(c) != index) {
                    index = -1;//不用设置flag 直接把index设为-1即可
                    break;
                }
            }
            if(index != -1)
                res.add(word);
        }
        return res.toArray(new String[res.size()]);
    }
}
