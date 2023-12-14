package dylcal13_Hamidc_HW5;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;


import javax.swing.*;

public class gui extends JFrame{
	public static BookStore store = new BookStore();
	public static List<Customer_info> customers = new ArrayList<Customer_info>();
	public static void main(String[] args) {
		
		try{
		      File f = new File("database.txt");  // Open file containing students
		      Scanner in = new Scanner(f); // start scanner for the input file
		      int line_num = 0;
		      while (in.hasNextLine()){
		        String line = in.nextLine();
		        // System.out.println(line);
		        String[] splitted = line.split(",");
		        //System.out.println(splitted[0]);
		        if (splitted[0].equals("C")){
		        	customers.add(new Customer_info(splitted[1],splitted[2],splitted[3],splitted[4]));
		        }
		        else if(splitted[0].equals("BC")) {
		        	for(Customer_info customer:customers) {
		        		if(splitted[1].equals(customer.getFirst_Name())&&splitted[2].equals(customer.getLast_Name())) {
		        			customer.add_book(new Book_info(splitted[3],splitted[4],Integer.parseInt(splitted[5]),splitted[6],Integer.parseInt(splitted[7])));
		        		}
		        	}
		        }
		        else if(splitted[0].equals("BS")) {
		        	store.addBook(new Book_info(splitted[1],splitted[2],Integer.parseInt(splitted[3]),splitted[4],Integer.parseInt(splitted[5])));
		        }
		        }
		    }
		    catch (FileNotFoundException e){
		      e.printStackTrace(); // called if no file is found.
		    }
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
		
		// Books for testing
//		store.addBook(new Book_info("Farenheit 451","Ray Bradbury",158,"Simon & Schuster Paperbacks",1));
//		store.addBook(new Book_info("The Memoirs of Sherlock Holmes","Sir Arthur Conan Doyle",256,"Reader's Digest",1));
//		store.addBook(new Book_info("The Return of Sherlock Holmes","Sir Arthur Conan Doyle",256,"Reader's Digest",1));
//		customers.add(new Customer_info("John","Doe","jdoe@gmail.com","12055551234"));
//		customers.get(0).add_book(store.getBooks().get(0));
//		store.deleteBook(store.getBooks().get(0));
		// add panel to frame
		frame.add(panel);
		frame.setSize(1000,540);
		frame.setVisible(true);
	}
	
	public static JPanel mainPanel(){
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JTextArea result = new JTextArea();
		result.setEditable(false);
		result.setBounds(0,0,400,500);
		result.setFont(new Font("Arial",0,12));
		result.setBackground(new Color(255,255,255));
		panel.add(result);
		
		JLabel l = new JLabel("Bookstore Manager");
		l.setBounds(405,0,600,40);
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setFont(new Font("Arial",Font.BOLD,14));
		panel.add(l);
		
		JButton booksinstore = new JButton("List Books in store");
		booksinstore.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(null);
				List<Book_info> books;
				books = store.getBooks();
				for(Book_info book : books) {
					result.append("Book: "+book.getName()+"\n");
					result.append(" - Author: "+book.getAuthor()+"\n");
					result.append(" - # of Pages: "+book.getPageNumber()+"\n");
					result.append(" - Publisher: "+book.getPub()+"\n");
					result.append(" - Copies in Stock: "+book.getStock()+"\n");	
					
				}
			}
		});
		booksinstore.setBounds(405,55,150,25);
		panel.add(booksinstore);
		
		JButton customersinstore = new JButton("List Customers");
		customersinstore.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(null);
				for(Customer_info customer : customers) {
					result.append("Customer: "+customer.getFirst_Name()+" "+customer.getLast_Name()+"\n");
					result.append(" - Email: "+customer.getEmail()+"\n");
					result.append(" - Phone #: "+customer.getPhone_num()+"\n");
					result.append(" - Books Rented: \n");
					List<Book_info> rented_books = customer.get_books();
					for(Book_info book:rented_books) {
						result.append("\t"+book.getName()+" By "+book.getAuthor()+"\n");
					}
					result.append("\n");
					
				}
			}
		});
		customersinstore.setBounds(405,90,150,25);
		panel.add(customersinstore);
		
		JTextField search = new JTextField(16);
		search.setBounds(590,55,150,25);
		panel.add(search);
		
		
		JButton searchbytitle = new JButton("Search books by title");
		searchbytitle.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean found = false;
				result.setText(null);
				List<Book_info> books;
				books = store.getBooks();
				for(Book_info book : books) {
					if(book.getName().toLowerCase().contains(search.getText().toLowerCase())){ //.contains instead of .equals, to pull up anythign similar to the search.
						result.append("Book: "+book.getName()+"\n");
						result.append(" - Author: "+book.getAuthor()+"\n");
						result.append(" - # of Pages: "+book.getPageNumber()+"\n");
						result.append(" - Publisher: "+book.getPub()+"\n");
						result.append(" - Copies in Stock: "+book.getStock()+"\n");
						result.append("\n");
						found = true;
					}
					
				}
				if(found == false) {
					result.append("Couldn't find any books matching that title. \n");
				}
			}
		});
		searchbytitle.setBounds(745,55,175,25);
		panel.add(searchbytitle);
		
		JTextField customersearch = new JTextField(16);
		customersearch.setBounds(590,90,150,25);
		panel.add(customersearch);
		
		JButton customerinfo = new JButton("Search for Customer");
		customerinfo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean found = false;
				result.setText(null);
				for(Customer_info customer: customers) {
					if(customer.getFullName().toLowerCase().contains(customersearch.getText().toLowerCase())||(customer.getFirst_Name()+" "+customer.getLast_Name()).contains(customersearch.getText())){ //.contains instead of .equals, to pull up anythign similar to the search.
						result.append("Customer: "+customer.getFirst_Name()+" "+customer.getLast_Name()+"\n");
						result.append(" - Email: "+customer.getEmail()+"\n");
						result.append(" - Phone #: "+customer.getPhone_num()+"\n");
						result.append(" - Books Rented: \n");
						List<Book_info> rented_books = customer.get_books();
						for(Book_info book:rented_books) {
							result.append("\t"+book.getName()+" By "+book.getAuthor()+"\n");
						}
						result.append("\n");
						found = true;
					}
					
				}
				if(found == false) {
					result.append("Couldn't find any books matching that title. \n");
				}
			}
		});
		customerinfo.setBounds(745,90,175,25);
		panel.add(customerinfo);
		
		JLabel customerlabel = new JLabel("Customer Functions");
		customerlabel.setBounds(400,120,600,40);
		customerlabel.setHorizontalAlignment(JLabel.CENTER);
		customerlabel.setFont(new Font("Arial",Font.BOLD,14));
		panel.add(customerlabel);
		
		JTextField customerFirstname = new JTextField(16);
		customerFirstname.setBounds(515,160,150,25);
		panel.add(customerFirstname);
		
		JLabel customerfnLabel = new JLabel("First Name");
		customerfnLabel.setBounds(405,150,150,40);
		customerfnLabel.setHorizontalAlignment(JLabel.LEFT);
		customerfnLabel.setVerticalAlignment(JLabel.CENTER);
		customerfnLabel.setFont(new Font("Arial",0,14));
		panel.add(customerfnLabel);
		
		JTextField customerLastname = new JTextField(16);
		customerLastname.setBounds(515,190,150,25);
		panel.add(customerLastname);
		
		JLabel customerlnLabel = new JLabel("Last Name");
		customerlnLabel.setBounds(405,180,150,40);
		customerlnLabel.setHorizontalAlignment(JLabel.LEFT);
		customerlnLabel.setVerticalAlignment(JLabel.CENTER);
		customerlnLabel.setFont(new Font("Arial",0,14));
		panel.add(customerlnLabel);
		
		JTextField customeremail = new JTextField(16);
		customeremail.setBounds(515,220,150,25);
		panel.add(customeremail);
		
		JLabel customeremailLabel = new JLabel("Email Address");
		customeremailLabel.setBounds(405,210,150,40);
		customeremailLabel.setHorizontalAlignment(JLabel.LEFT);
		customeremailLabel.setVerticalAlignment(JLabel.CENTER);
		customeremailLabel.setFont(new Font("Arial",0,14));
		panel.add(customeremailLabel);
		
		JTextField customerphone = new JTextField(16);
		customerphone.setBounds(515,250,150,25);
		panel.add(customerphone);
		
		JLabel customerphoneLabel = new JLabel("Phone Number");
		customerphoneLabel.setBounds(405,240,150,40);
		customerphoneLabel.setHorizontalAlignment(JLabel.LEFT);
		customerphoneLabel.setVerticalAlignment(JLabel.CENTER);
		customerphoneLabel.setFont(new Font("Arial",0,14));
		panel.add(customerphoneLabel);
		
		JButton addcustomer = new JButton("Add Customer");
		addcustomer.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean match = false;
				result.setText(null);
				for(Customer_info customer:customers) {
					if(customerfnLabel.getText().toLowerCase().equals(customer.getFirst_Name().toLowerCase())||customerlnLabel.getText().toLowerCase().equals(customer.getLast_Name().toLowerCase())||customeremailLabel.getText().toLowerCase().equals(customer.getEmail().toLowerCase())||customerphoneLabel.getText().toLowerCase().equals(customer.getPhone_num().toLowerCase())) { // Really, Really big if statement to make sure the customer being adde is not already in the store database
						match=true;
					}
				}
				if(match==false) {
					customers.add(new Customer_info(customerFirstname.getText(),customerLastname.getText(),customeremail.getText(),customerphone.getText()));
				}
				
			}
		});
		addcustomer.setBounds(670,160,125,115);
		panel.add(addcustomer);
		
		JLabel rentinglabel = new JLabel("Renting Functions");
		rentinglabel.setBounds(400,280,600,40);
		rentinglabel.setHorizontalAlignment(JLabel.CENTER);
		rentinglabel.setFont(new Font("Arial",Font.BOLD,14));
		panel.add(rentinglabel);
		
		JTextField bookName = new JTextField(16);
		bookName.setBounds(525,320,150,25);
		panel.add(bookName);
		
		JLabel bookNameLabel = new JLabel("Book Name");
		bookNameLabel.setBounds(405,310,150,40);
		bookNameLabel.setHorizontalAlignment(JLabel.LEFT);
		bookNameLabel.setVerticalAlignment(JLabel.CENTER);
		bookNameLabel.setFont(new Font("Arial",0,14));
		panel.add(bookNameLabel);
		
		JTextField customerName = new JTextField(16);
		customerName.setBounds(525,350,150,25);
		panel.add(customerName);
		
		JLabel customerNameLabel = new JLabel("Customer Name");
		customerNameLabel.setBounds(405,340,150,40);
		customerNameLabel.setHorizontalAlignment(JLabel.LEFT);
		customerNameLabel.setVerticalAlignment(JLabel.CENTER);
		customerNameLabel.setFont(new Font("Arial",0,14));
		panel.add(customerNameLabel);
		
		JButton rentbook = new JButton("Rent Book");
		rentbook.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Customer_info rent_customer = null;
				Book_info rent_book = null;
				result.setText(null);
				for(Customer_info customer:customers) {
					if(customer.getFullName().contains(customerName.getText())||(customer.getFirst_Name()+" "+customer.getLast_Name()).contains(customerName.getText())) {
						rent_customer=customer;
						break;
					}
				}
				for(Book_info book:store.getBooks()) {
					if(book.getName().contains(bookName.getText())) {
						rent_book=book;
						break;
					}
				}
				rent_customer.add_book(rent_book);
				store.deleteBook(rent_book);
				result.append("Rented "+rent_book.getName()+" To \n");
				result.append("  "+rent_customer.getFirst_Name()+" "+rent_customer.getLast_Name()+"\n");
				
			}
		});		rentbook.setBounds(680,320,125,55);
		panel.add(rentbook);
		
		JButton saveChanges = new JButton("Save Changes");
		saveChanges.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				File file = new File("database.txt");
			    file.delete();
				try {
					PrintWriter out = new PrintWriter("database.txt");
					for(Customer_info customer:customers) {
						out.println("C,"+customer.getFirst_Name()+","+customer.getLast_Name()+","+customer.getEmail()+","+customer.getPhone_num());
					}
					for(Customer_info customer:customers) {
						for(Book_info book:customer.get_books()) {
							out.println("BC,"+customer.getFirst_Name()+","+customer.getLast_Name()+","+book.getName()+","+book.getAuthor()+","+book.getPageNumber()+","+book.getPub()+",1");
						}
						
					}
					for(Book_info book:store.getBooks()) {
						out.println("BS,"+book.getName()+","+book.getAuthor()+","+book.getPageNumber()+","+book.getPub()+","+book.getStock());
					}
					out.close();
				}
				catch(FileNotFoundException j) {
					j.printStackTrace();
				}
			}
		});
		saveChanges.setBounds(405,460,590,40);
		panel.add(saveChanges);
		
		// return panel
		return panel;
	}

}