package Arrays;
public class palindrome {
    public static void main(String[] args) {
        String str = "abcdeddsszxdcba";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {
        if (str==null||str.length()==0 ){
            return true;
        }
        str = str.toLowerCase();
//        int i = 0;
//        char start = str.charAt(i);
//        char end = str.charAt(str.length() - 1 - i);
//        while (start <= end) {
//            if (start == end){
//                start++;
//                end--;
//                  return true;}
//            else
//                return false;
//        }
//        return false;
//    }
//}
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end)
                return false;
        }
        return true;
    }
}
