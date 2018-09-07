public class PalindromeNum_9 {

    public boolean isPalindrome(int x) {

        if(x<0)
            return false;
        int y = 0;
        while(x!=0)
        {
            y=y*10+x%10;
        }
        if(x==y)
            return true;
        else
            return false;
    }
}
