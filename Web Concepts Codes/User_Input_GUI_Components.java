import javax.swing.JOptionPane;     // To import only 'JOptionPane' class inside 'swing' folder (package)
// import javax.swing.*;            // To import every class inside 'swing' folder (package)

public class User_Input_GUI_Components {
        public static void main(String args[]) {
            String degree, batch, section, id;

            
            // 'JOptionPane' is a class whose functions (showInputDialog(), showMessageDialog()) are static, that's why we get/access them by using class name and do not create an object for them.

            // NOTE:: JOptionPane return a string type value
            degree = JOptionPane.showInputDialog("What's your Degree?");

            batch = JOptionPane.showInputDialog("What's your Batch?");

            section = JOptionPane.showInputDialog("What's your Section?");

            id = JOptionPane.showInputDialog("What's your ID?");

            JOptionPane.showMessageDialog(null, "Your Roll No is :: " + degree + batch + section + id);
        }
}
