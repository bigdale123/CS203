package dylcal13_Lab12;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.lang.Math;

public class guicalc extends JFrame{
	private static double number = 0;
	private static String current_mode = "";
	public static void main(String[] args) {
		// Create Frame
		JFrame frame = new JFrame("GUI Calculator");
		
		// set close operation for exit button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// set the look and feel the same as the system
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		JPanel panel = mainPanel();
		
		// add panel to frame
		frame.add(panel);
		frame.setSize(216,340);
		frame.setVisible(true);
	}
	
	public static JPanel mainPanel(){
		JPanel panel = new JPanel();
		JPanel helper_panel = new JPanel();
		
		//set layout for the panel
		GridBagLayout layout = null;
		panel.setLayout(layout);
		
		//add number display at top (Label)
		JTextField result = new JTextField();
		result.setHorizontalAlignment(JTextField.RIGHT);
		result.setEditable(false);
		result.setBounds(0,0,200,50);
		result.setFont(new Font("Arial",Font.BOLD,15));
		result.setBackground(new Color(255,255,255));
		panel.add(result);
		// Create Keypad
		helper_panel = new JPanel();
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"0");
			}
		});
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"1");
			}
		});
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"2");
			}
		});
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"3");
			}
		});
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"4");
			}
		});
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"5");
			}
		});
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"6");
			}
		});
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"7");
			}
		});
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"8");
			}
		});
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"9");
			}
		});
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO add equal sign function
				if(current_mode.equals("add")) {
					number+=Double.parseDouble(result.getText());
					result.setText(String.valueOf(number));
				}
				else if(current_mode.equals("sub")) {
					number-=Double.parseDouble(result.getText());
					result.setText(String.valueOf(number));
				}
				else if(current_mode.equals("mult")) {
					number*=Double.parseDouble(result.getText());
					result.setText(String.valueOf(number));
				}
				else if(current_mode.equals("div")) {
					number/=Double.parseDouble(result.getText());
					result.setText(String.valueOf(number));
				}
			}
		});
		JButton decimal = new JButton(".");
		decimal.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+".");
			}
		});
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("");
			}
		});
		JButton sqrt = new JButton("\u221A");
		sqrt.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(String.valueOf(Math.pow(Double.parseDouble(result.getText()), 0.5)));
				number=Math.pow(Double.parseDouble(result.getText()), 0.5);
			}
		});
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(result.getText());
				current_mode = "add";
				result.setText("");
			}
		});
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(result.getText());
				current_mode = "sub";
				result.setText("");
			}
		});
		JButton mult = new JButton("X");
		mult.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(result.getText());
				current_mode = "mult";
				result.setText("");
			}
		});
		JButton div = new JButton("\u00F7");
		div.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(result.getText());
				current_mode = "div";
				result.setText("");
			}
		});
		zero.setBounds(50,200,50,50);
		panel.add(zero);
		one.setBounds(0,50,50,50);
		panel.add(one);
		two.setBounds(50,50,50,50);
		panel.add(two);
		three.setBounds(100,50,50,50);
		panel.add(three);
		four.setBounds(0,100,50,50);
		panel.add(four);
		five.setBounds(50,100,50,50);
		panel.add(five);
		six.setBounds(100,100,50,50);
		panel.add(six);
		seven.setBounds(0,150,50,50);
		panel.add(seven);
		eight.setBounds(50,150,50,50);
		panel.add(eight);
		nine.setBounds(100,150,50,50);
		panel.add(nine);
		equals.setBounds(100,200,50,50);
		panel.add(equals);
		decimal.setBounds(0,200,50,50);
		panel.add(decimal);
		clear.setBounds(100,250,100,50);
		panel.add(clear);
		sqrt.setBounds(0,250,100,50);
		panel.add(sqrt);
		add.setBounds(150,50,50,50);
		panel.add(add);
		sub.setBounds(150,100,50,50);
		panel.add(sub);
		mult.setBounds(150,150,50,50);
		panel.add(mult);
		div.setBounds(150,200,50,50);
		panel.add(div);
		//return panel
		return panel;
	}
}