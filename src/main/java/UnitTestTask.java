public class UnitTestTask {
    //Returns a char array containing every n-th char
    //when sourceArray's length <n , returns sourceArray

    public char[] everyNthChar(char[] sourceArray,int n){


    }
    char last_removed;
    public String removePairs(String source){

        if (source.length() <2) {
            return source;
        }

        if (source.charAt(0) == source.charAt(1))
        {
            last_removed = source.charAt(0);
            while (source.length() > 1 && source.charAt(0) == source.charAt(1))
                source = source.substring(1, source.length());
            source = source.substring(1, source.length());

            return removePairs(source);
        }


        String rem_str = removeUtil(str.substring(
                1,str.length()), last_removed);


        if (rem_str.length() != 0 &&
                rem_str.charAt(0) == str.charAt(0))
        {
            last_removed = str.charAt(0);


            return rem_str.substring(1,rem_str.length());
        }


        if (rem_str.length() == 0 && last_removed ==
                str.charAt(0))
            return rem_str;
        return (str.charAt(0) + rem_str);
    }

    static String remove(String str)
    {
        char last_removed = '\0';
        return removeUtil(str, last_removed);
    }
}




    public int converter(int a,int b){

        if(b==0){
            throw new ArithmeticException();

        }else {
            return (a/b)+(a*30)-2;
        }
    }
    public String nullIfOddLength(String source){
        if(source.length()%2==0){
            return source;

        }
        return null;
    }

}
