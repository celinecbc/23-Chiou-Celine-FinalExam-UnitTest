public class StringCalculator {
    public static int add(String numbers) {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    int parsedNum = Integer.parseInt(number.trim());  // creating new variable for easier calling
                    if (parsedNum < 0) {  // if statement for when calling with negative number
                        throw new RuntimeException("Negatives not allowed");
                    }
                    if (parsedNum >= 1000) {  // if statement for when the number is 1000+ are ignored
                        parsedNum = 0;
                    }
                    returnValue+= parsedNum;
                }
            }
        }
        return returnValue;

    }
}
