import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> reverseString = new Stack<>();
        String inputString = "able was I ere I saw elba";
        String resultExpected = "";
        String[] arrayString = inputString.split("");

        for (int i = arrayString.length - 1; i >= 0; i--) {
            reverseString.push(arrayString[i]);
        }

        for (int i = 0; i < reverseString.size(); i++) {
            resultExpected += reverseString.get(i);
        }

        if (resultExpected.equals(inputString)) {
            System.out.println("This is fukin Palindrome!!");
        } else {
            System.out.println("This is not Palindrome!");
        }

    }
}
