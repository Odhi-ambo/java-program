import javax.swing.*;



public class addNumbers {
    public static void main(String[] args) {
        //jframe
        JFrame frame = new JFrame("Add Two Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);


        //label
        JLabel label1 = new JLabel("Enter first number: ");
        label1.setBounds(50, 20, 150, 30);
        frame.add(label1);

        //textfield
        JTextField text1 = new JTextField();
        text1.setBounds(200, 20, 150, 30);
        frame.add(text1);


        //label

        JLabel label2 = new JLabel("Enter second number: ");
        label2.setBounds(50, 60, 150, 30);
        frame.add(label2);

        //textfield

    }
}