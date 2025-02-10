package combiner;

public class Combiner {
    public String combine(String input1, String input2) {
        try {
            
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            return String.valueOf(num1 + num2); // Return the sum as a string
        } catch (NumberFormatException e) {
         
            return input1 + input2;
        }
    }
}
