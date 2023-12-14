package dylcal13_Hamidc_HW5;

import java.util.ArrayList;
import java.util.List;

public class Customer_info {
	private List<Book_info> rented; 
	String First_name;
	String Last_name;
	String email;
	String Phone_num;
	
	public Customer_info(String First_name,String Last_name,String email,String Phone_num) {
		rented = new ArrayList<Book_info>();
		this.First_name= First_name;
		this.Last_name = Last_name;
		this.email = email;
		this.Phone_num = Phone_num;

	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//method getFirst_name: 																		    //																													
//@param this.First_name																		    //
//@returns String First_name																		//				
//"George"																							//
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getFirst_Name() {
		return this.First_name;
	
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//method setFirst_name: 																			//																													
//@param String First_name																			//
//@returns this.First_name																		   	//				
//"George"																							//
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void setFirst_Name(String First_name) {
		this.First_name = First_name;
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//method getLast_name: 																		   		//																													
//@param this.Last_name																		  		//
//@returns String Last_name																			//				
//"Costanze"																						//
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getLast_Name() {
		return this.Last_name;
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//method setLast_name: 																				//																													
//@param String Last_name																			//
//@returns this.Last_name																		   	//				
//"Costanze"																						//
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void setLast_Name(String Last_name) {
		this.Last_name = Last_name;
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//method getFullName:                                                                               //
//@param none                                                                                       //
//@returns this.Last_name+","+this.First_name                                                       //      
//"Costanza,Frank"                                                                                  //      
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getFullName() {
		return this.Last_name+","+this.First_name;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//method getEmail: 																		   			//																													
//@param this.email																		  			//
//@returns String email																				//				
//"George.Costanze@outLook.com"																		//
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getEmail() {
		return this.email;
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//method setEmail: 																					//																													
//@param String email																				//
//@returns this.email																		   		//				
//"George.Costanze@outLook.com"																		//
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void setEmail(String email) {
	this.email = email;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//method getPhone_num: 																				//																													
//@param this.Phone_num																				//
//@returns Integer Phone_num																	   	//				
//"925-370-8905'																					//
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getPhone_num() {
		return this.Phone_num;
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//method setPhone_num: 																				//																													
//@param String Phone_num																			//
//@returns this.Phone_num																		   	//				
//"925-370-8905"																					//
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void setPhone_num(String Phone_num) {
		this.Phone_num = Phone_num;
		
	}
	public void add_book(Book_info r1) {
		rented.add(r1);

	}
	public void delete_book(Book_info b5) { // use to rent
		rented.remove(b5);
	}

	public List<Book_info> get_books() {
		return rented;
	}


}