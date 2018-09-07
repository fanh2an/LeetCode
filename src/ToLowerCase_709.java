public class ToLowerCase_709 {
    public static String toLowerCase(String str) {
        if(str==null)
            return str;
        char []array = str.toCharArray();
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>='A' && array[i]<='Z') {
                array[i]+=  32;

            }
        }
        String res = String.valueOf(array);
        return res;
    }
}
