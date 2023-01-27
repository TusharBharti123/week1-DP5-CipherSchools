public class Print_Decoding {
    public static void printAllDecodings(String number,String output) {

        if(number.length() == 0) {
            System.out.println(output);
            return;
        }


        String firstCharacter = number.substring(0,1);

        int firstDigit = Integer.parseInt(firstCharacter);
        if(firstDigit != 0) {

        char character = (char) ('a' + firstDigit -1);

        printAllDecodings(number.substring(1),output + character);
        }

        if(number.length()<=1){
            return;
        }


        int firstTwoDigits = Integer.parseInt(number.substring(0, 2));


        if(firstTwoDigits <=26){
            if(firstTwoDigits<=0){
            printAllDecodings(number.substring(2),output + "");
            return;
        }
        char character = (char) ('a' + firstTwoDigits -1);
        printAllDecodings(number.substring(2), output + character);



    }
}

public static void main(String[] args) {
    printAllDecodings("12371", "");
}
}
