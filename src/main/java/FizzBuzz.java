import java.util.*;


public class FizzBuzz {
    public static String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if ( divisibleBy3 && divisibleBy5 ) {
            return "FizzBuzz";
        }
        else if ( divisibleBy3  ) {
            return "Fizz";
        }
        else if ( divisibleBy5 ) {
            return "Buzz";
        }
        return String.valueOf(number);
    }


    public static String countTo(int number) {
        ArrayList<String> TracyList = new ArrayList<>();
        for(int i = 0; i < number; i++){
            TracyList.add(checkNumber(i + 1));
        }
        System.out.println(String.valueOf(TracyList));
        return String.valueOf(TracyList);
    }

    public static void main(String[] args)
    {
        checkNumber(100);
        countTo(100);
    }

}

