public class Largest_Number_AFTER_K_Swaps {

    static String max ="0";

    public static String swap(String s, int i, int j) {
        char ith = s.charAt(i);
        char jth = s.charAt(j);

        String left = s.substring(0, i);
        String middle = s.substring(i + 1, j);
        String right = s.substring(j + 1);

        return left + jth + middle + ith + right;
    }






    public static void findLargestNumber(String str, int k) {

        if(Integer.parseInt(str)>Integer.parseInt(max)){
            max=str;
        }

        if(k==0)
            return;


        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i)<str.charAt(j)) {
                    str = swap(str,i,j);

                    findLargestNumber(str, k-1);
                    str = swap(str,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {

        String s ="254";
        int k=1;

        findLargestNumber(s, k);

        System.out.println(max);

    }


}
