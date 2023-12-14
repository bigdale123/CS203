package dylcal13_HW4;

import java.util.*;
import java.lang.Math;

public class runme{

  // main(String[] args): This is just the main method that runs the menu
  // no inputs
  // no outputs
  public static void main(String[] args){
	  Box box1 = new Box();
	  Box box2 = new Box();
	  Box box3 = new Box();
	  Box box4 = new Box();
	  Box box5 = new Box();
    
    System.out.println("----------------------------------");
    System.out.println("      Flashcard Application");
    System.out.println("----------------------------------");
    System.out.println();
    Scanner myObj = new Scanner(System.in);
    while(true){
      System.out.println();
      System.out.println("----- Options -----");
      System.out.println(" 1. List FlashCards");
      System.out.println(" 2. Add FlashCard");
      System.out.println(" 3. Delete FlashCard");
      System.out.println(" 4. Modify FlashCard");
      System.out.println(" 5. Start Study Session");
      System.out.println(" 6. Exit program");
      System.out.println("-------------------");
      System.out.println();
      System.out.print(" Enter choice: ");
      String choice = myObj.nextLine();
      System.out.println();
      if (choice.equals("1")){
        System.out.println("Which box would you like to see cards in?");
        System.out.println("------------");
        System.out.println("  1. Box 1");
        System.out.println("  2. Box 2");
        System.out.println("  3. Box 3");
        System.out.println("  4. Box 4");
        System.out.println("  5. Box 5");
        System.out.println("------------");
        System.out.println();
        System.out.print(" Enter choice: ");
        String choice1 = myObj.nextLine();
        System.out.println();
        FlashCard[] cards = new FlashCard[1];
        switch (choice1) {
	        case "1":
	        	System.out.println("--- Cards for Box 1 ---");
	        	cards = box1.getCards();
	        	break;
	        case "2":
	        	System.out.println("--- Cards for Box 2 ---");
	        	cards = box2.getCards();
	        	break;
	        case "3":
	        	System.out.println("--- Cards for Box 3 ---");
	        	cards = box3.getCards();
	        	break;
	        case "4":
	        	System.out.println("--- Cards for Box 4 ---");
	        	cards = box4.getCards();
	        	break;
	        case "5":
	        	System.out.println("--- Cards for Box 5 ---");
	        	 cards = box5.getCards();
	        	break;
        }
        System.out.println(cards);
        if (cards != null) {
	    	for(int i = 0; i < cards.length;i++) {
	    		System.out.println("Card "+(i+1)+":");
	    		System.out.println("  Question = "+cards[i].getQuestion());
	    		System.out.println("  Answer = "+cards[i].getAnswer());
	    	}
        }
        
      }
      else if(choice.equals("2")){
        System.out.print("What is the new cards question?: ");
        String question = myObj.nextLine();
        System.out.print("What is the new cards answer?: ");
        String answer = myObj.nextLine();
        FlashCard temp = new FlashCard(question,answer);
        box1.addCard(temp);
      }
      else if(choice.equals("3")){
		System.out.print("What is the cards question?: ");
	    String question = myObj.nextLine();
	    System.out.print("What is the cards answer?: ");
	    String answer = myObj.nextLine();
	    FlashCard temp = new FlashCard(question,answer);
	    box1.removeCard(temp);
	    box2.removeCard(temp);
	    box3.removeCard(temp);
	    box4.removeCard(temp);
	    box5.removeCard(temp);
      }
      else if(choice.equals("4")){
    	System.out.print("What is the old cards question?: ");
  	    String oldquestion = myObj.nextLine();
  	    System.out.print("What is the old cards answer?: ");
  	    String oldanswer = myObj.nextLine();
  	    FlashCard oldtemp = new FlashCard(oldquestion,oldanswer);
	  	System.out.print("What is the new cards question?: ");
	    String question = myObj.nextLine();
	    System.out.print("What is the new cards answer?: ");
	    String answer = myObj.nextLine();
	    FlashCard temp = new FlashCard(question,answer);
	    box1.removeCard(oldtemp);
	    box2.removeCard(oldtemp);
	    box3.removeCard(oldtemp);
	    box4.removeCard(oldtemp);
	    box5.removeCard(oldtemp);
	    box1.addCard(temp);
  	    
      }
      else if(choice.equals("5")){
    	  int amountRight = 0;
    	  int amountWrong = 0;
    	  boolean exit = false;
    	  while(exit != true) {
    		 boolean nocards = false;
    		 String box = null;
    		 double randomnumber = Math.random();
    		 FlashCard card = null;
    		 if(randomnumber <= .5 && randomnumber >=0) {
    			 card = box1.getRandomCard();
    			 if(card == null) {
    				 nocards = true;
    			 }
    			 else {
    			 card = box1.getRandomCard();
    			 box = "box1";
    			 }
    		 }
    		 else if(randomnumber <=.75 && randomnumber >.5) {
    			 card = box2.getRandomCard();
    			 if(card == null) {
    				 nocards = true;
    			 }
    			 else {
    			 card = box2.getRandomCard();
    			 box = "box2";
    			 }
    		 }
    		 else if(randomnumber <=.875 && randomnumber >.75) {
    			 card = box3.getRandomCard();
    			 if(card == null) {
    				 nocards = true;
    			 }
    			 else {
    			 card = box3.getRandomCard();
    			 box = "box3";
    			 }
    		 }
    		 else if(randomnumber <=.96 && randomnumber >.875) {
    			 card = box4.getRandomCard();
    			 if(card == null) {
    				 nocards = true;
    			 }
    			 else {
    			 card = box4.getRandomCard();
    			 box = "box4";
    			 }
    		 }
    		 else if(randomnumber <= 1 && randomnumber > .96) {
    			 card = box5.getRandomCard();
    			 if(card == null) {
    				 nocards = true;
    			 }
    			 else {
    			 card = box5.getRandomCard();
    			 box = "box5";
    			 }
    		 }
    		 if(card != null && nocards == false) {
    			 String qora = "question";
				 boolean exit2 = false;
    			 while (exit2 != true) {
    				 if (qora == "question") {
    					 card.printQuestion();
    				 }
    				 else if(qora == "answer") {
    					 card.printAnswer();
    				 }
    				 System.out.println();
    				 System.out.println("What would you like to do?");
    				 System.out.println("  1. Flip the card over");
    				 System.out.println("  2. You know the answer to this card");
    				 System.out.println("  3. You don't know the answer to this card");
    				 System.out.println("  4. End the study session");
    				 choice = myObj.nextLine();
    				 switch (choice) {
    				 	case "1":
    				 		qora = "answer";
    				 		break;
    				 	case "2":
    				 		switch (box) {
    				 			case "box1":
    				 				box2.addCard(card);
    	    				 		box1.removeCard(card);
    				 				break;
    				 			case "box2":
    				 				box3.addCard(card);
    	    				 		box2.removeCard(card);
    				 				break;
    				 			case "box3":
    				 				box4.addCard(card);
    	    				 		box3.removeCard(card);
    				 				break;
    				 			case "box4":
    				 				box5.addCard(card);
    	    				 		box4.removeCard(card);
    				 				break;
    				 		}
    				 		amountRight++;
    				 		
    				 		exit2 = true;
    				 		break;
    				 	case "3":
    				 		switch (box) {
				 			case "box2":
				 				box1.addCard(card);
	    				 		box2.removeCard(card);
				 				break;
				 			case "box3":
				 				box1.addCard(card);
	    				 		box3.removeCard(card);
				 				break;
				 			case "box4":
				 				box1.addCard(card);
	    				 		box4.removeCard(card);
				 				break;
				 			case "box5":
				 				box1.addCard(card);
	    				 		box5.removeCard(card);
				 				break;
    				 		}
    				 		amountWrong++;
    				 		exit2 = true;
    				 		break;
    				 	case "4":
    				 		exit = true;
    				 		exit2 = true;
    				 		break;
    				 }
    			 }
				 
			 }
    	  }
    	  System.out.println("You knew the answer to "+amountRight+" Flashcards!");
    	  System.out.println(" But you didn't know the answer to "+amountWrong+" Flashcards...");
      }
      else if(choice.equals("6")){
        System.out.print("The program will exit. Do you want to continue? (Y/N) ");
        choice = myObj.nextLine();
        if(choice.toLowerCase().equals("y")){
          break;
        }

      }

    }



  }
}
