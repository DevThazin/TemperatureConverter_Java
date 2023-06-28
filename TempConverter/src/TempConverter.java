
import javax.swing.*;
import java.awt.event.*;

public class TempConverter extends JFrame implements ActionListener {

    private JTextField inputField;
    private JTextField resultField;
    JLabel titleLabel, inputLabel, resultLabel;
    JButton celsiusToFahrenheitButton, fahrenheitToCelsiusButton;

    public TempConverter() {
        setTitle("Temperature Converter");

        titleLabel = new JLabel("Temperature Converter");
        titleLabel.setBounds(150, 20, 200, 30);
        add(titleLabel);

        inputLabel = new JLabel("Enter temperature:");
        inputLabel.setBounds(100, 80, 120, 30);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(220, 80, 150, 30);
        add(inputField);

        celsiusToFahrenheitButton = new JButton(" °C --> °F");
        celsiusToFahrenheitButton.setBounds(220, 130, 150, 30);
        add(celsiusToFahrenheitButton);
        celsiusToFahrenheitButton.addActionListener(this);

        fahrenheitToCelsiusButton = new JButton(" °F --> °C");
        fahrenheitToCelsiusButton.setBounds(220, 170, 150, 30);
        add(fahrenheitToCelsiusButton);
        fahrenheitToCelsiusButton.addActionListener(this);


        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(100, 220, 120, 30);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(220, 220, 150, 30);
        resultField.setEditable(false);
        add(resultField);
        
         setSize(500, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

       
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String input=inputField.getText();
        
        if(e.getSource()==celsiusToFahrenheitButton)
        {
            try{
                 double celsius = Double.parseDouble(input);
                 double fahrenheit=(celsius*9/5)+32;
                 resultField.setText(fahrenheit+" °F");
                 
                 
            }catch(Exception ee)
            {
                 resultField.setText("Invalid input");
            }
        }
        
        if(e.getSource()==fahrenheitToCelsiusButton)
        {
            try{
                 double fahrenheit = Double.parseDouble(input);
                 double celsius=(fahrenheit-32)*5/9;
                 resultField.setText(celsius+" °C");
            }catch(Exception ee)
            {
                 resultField.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
       
                new TempConverter();
      
    }
}
