import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btndel;
	private JButton btnclear;
	private JButton btnadd;
	private JButton btn7; 
	private JButton btn8;
	private JButton btn9;
	private JButton btnmin;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnmul;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btndiv;
	private JButton btn0;
	private JButton btndec;
	private JButton btnequal;
	private JLabel lblNewLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	double num, ans;
	int calculation;
	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}
	
	public void arithmetic_operation() {
		switch(calculation) {
		
		case 1:
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			 
		case 2:
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			 
		case 3:
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			 
		case 4:
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			 
		
		}
	}
	
	public void enable() {
		textField.setEnabled(true);
		btndel.setEnabled(true);
		btnclear.setEnabled(true);
		btnadd.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btnmin.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btnmul.setEnabled(true);
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btndiv.setEnabled(true);
		btn0.setEnabled(true);
		btndec.setEnabled(true);
		btnequal.setEnabled(true);
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton_1.setEnabled(true);
	}
	
	public void disable()
	{
		textField.setEnabled(false);
		btndel.setEnabled(false);
		btnclear.setEnabled(false);
		btnadd.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btnmin.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btnmul.setEnabled(false);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btndiv.setEnabled(false);
		btn0.setEnabled(false);
		btndec.setEnabled(false);
		btnequal.setEnabled(false);
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton.setEnabled(true);
		textField.setText("");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setType(Type.UTILITY);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 290, 363);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 23));
		textField.setBounds(10, 11, 254, 38);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		
		rdbtnNewRadioButton = new JRadioButton("ON", true);
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				{
					rdbtnNewRadioButton_1.setSelected(false);
				}
				enable();
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(10, 56, 49, 23);
		frmCalculator.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected())
				{
					rdbtnNewRadioButton.setSelected(false);
				}
				disable();
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBounds(10, 82, 49, 23);
		frmCalculator.getContentPane().add(rdbtnNewRadioButton_1);
		
		btndel = new JButton("<--");
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String store;
				if(length > 0) {
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textField.setText(store);
				}
			}
		});
		btndel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btndel.setBounds(76, 60, 56, 38);
		frmCalculator.getContentPane().add(btndel);
		
		btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclear.setBounds(142, 60, 56, 38);
		frmCalculator.getContentPane().add(btnclear);
		
		btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText(textField.getText() + "+");
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText("");
				lblNewLabel.setText(num + "+");
				
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnadd.setBounds(208, 60, 56, 38);
		frmCalculator.getContentPane().add(btnadd);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 112, 56, 38);
		frmCalculator.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(76, 112, 56, 38);
		frmCalculator.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(142, 112, 56, 38);
		frmCalculator.getContentPane().add(btn9);
		
		btnmin = new JButton("-");
		btnmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText(textField.getText() + "-");
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText("");
				lblNewLabel.setText(num + "-");
			}
		});
		btnmin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmin.setBounds(208, 112, 56, 38);
		frmCalculator.getContentPane().add(btnmin);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 166, 56, 38);
		frmCalculator.getContentPane().add(btn4);
		
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(76, 166, 56, 38);
		frmCalculator.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(142, 166, 56, 38);
		frmCalculator.getContentPane().add(btn6);
		
		btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText(textField.getText() + "*");
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText("");
				lblNewLabel.setText(num + "*");
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul.setBounds(208, 166, 56, 38);
		frmCalculator.getContentPane().add(btnmul);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 220, 56, 38);
		frmCalculator.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(76, 220, 56, 38);
		frmCalculator.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(142, 220, 56, 38);
		frmCalculator.getContentPane().add(btn3);
		
		btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText(textField.getText() + "/");
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText("");
				lblNewLabel.setText(num + "/");
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBounds(208, 220, 56, 38);
		frmCalculator.getContentPane().add(btndiv);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 276, 56, 38);
		frmCalculator.getContentPane().add(btn0);
		
		btndec = new JButton(".");
		btndec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btndec.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndec.setBounds(76, 276, 56, 38);
		frmCalculator.getContentPane().add(btndec);
		
		btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
				lblNewLabel.setText("");
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(142, 276, 122, 38);
		frmCalculator.getContentPane().add(btnequal);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(218, 0, 46, 14);
		frmCalculator.getContentPane().add(lblNewLabel);
	}
}
