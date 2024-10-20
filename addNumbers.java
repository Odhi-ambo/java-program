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
        JTextField text2 = new JTextField();
        text2.setBounds(200, 60, 150, 30);
        frame.add(text2);

        //button
        JButton button = new JButton("Add");
        button.setBounds(150, 100, 100, 30);
        frame.add(button);

        //label
        JLabel label3 = new JLabel();
        label3.setBounds(150, 140, 150, 30);
        frame.add(label3);

        //action listener
        button.addActionListener(e -> {
            int num1 = Integer.parseInt(text1.getText());
            int num2 = Integer.parseInt(text2.getText());
            int sum = num1 + num2;
            label3.setText("Sum is: " + sum);
        });
        //frame visibility
        frame.setVisible(true);


    }
}