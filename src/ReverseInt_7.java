public class ReverseInt_7 {

    public int reverse(int x) {
        int a=0;
        while(x!=0)
        {
            if(a< -Math.pow(2,31)/10 ||a >(Math.pow(2,31)-1)/10)
            {
                a= 0;
                break;
            }
            a=a*10+x%10;
            x/=10;

        }
        return a;
    }

}
