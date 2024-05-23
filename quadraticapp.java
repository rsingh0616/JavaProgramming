import javax.swing.JOptionPane;

public class QuadraticApp {
    public static void main(String[] args) {
        // Declare variables to store user input and calculation results
        String inputA, inputB, inputC, message;
        double a, b, c, discriminant, root1, root2;

        // Prompt the user to enter the coefficient a
        inputA = JOptionPane.showInputDialog("Enter the coefficient a: ");
        a = Double.parseDouble(inputA);

        // Prompt the user to enter the coefficient b
        inputB = JOptionPane.showInputDialog("Enter the coefficient b: ");
        b = Double.parseDouble(inputB);

        // Prompt the user to enter the coefficient c
        inputC = JOptionPane.showInputDialog("Enter the coefficient c: ");
        c = Double.parseDouble(inputC);

        // Calculate the discriminant (b^2 - 4ac)
        discriminant = (b * b) - 4 * a * c;

        // Check if the roots are real or imaginary
        if (discriminant < 0) {
            // Roots are imaginary if the discriminant is less than 0
            message = "The roots are imaginary.";
        } else {
            // Calculate the two real roots using the quadratic formula
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            message = "The roots exist and they are:\nRoot 1: " + root1 + "\nRoot 2: " + root2;
        }

        // Display the result to the user
        JOptionPane.showMessageDialog(null, message, "Quadratic Equation Solver", JOptionPane.INFORMATION_MESSAGE);
    }
}
