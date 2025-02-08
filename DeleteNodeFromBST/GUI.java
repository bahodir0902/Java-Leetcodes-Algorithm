import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter first number number: ");
        String secondNumber = JOptionPane.showInputDialog("Enter second number number: ");

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        int result = num1 + num2;
        JOptionPane.showMessageDialog(null,"The sum of two numbers " + num1  + " and " + num2 + " is: " + result);;
    }
}
