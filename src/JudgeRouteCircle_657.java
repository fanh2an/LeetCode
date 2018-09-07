/*
    初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，判断它是否会移回到原来的位置。
    移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。
    机器人有效的动作有 R（右），L（左），U（上）和 D（下）。
    输出应为 true 或 false，表示机器人移动路线是否成圈。
 */
public class JudgeRouteCircle_657 {
    public boolean judgeCircle(String moves) {
        int LR = 0;
        int UD = 0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L')
                LR++;
            if(moves.charAt(i)=='R')
                LR--;
            if(moves.charAt(i)=='U')
                UD++;
            if(moves.charAt(i)=='D')
                UD--;
        }
        if(LR==0 && UD==0)
            return true;
        else
            return false;
    }
}
