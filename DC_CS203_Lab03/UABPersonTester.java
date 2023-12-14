public class UABPersonTester{
  public static void main(String args[]){
    UABPerson person1 = new UABPerson("John Doe",20,"jd420");
    System.out.println("---------------------------------------------------");
    System.out.println("Person:       "+person1.getName());
    System.out.println(" Age:         "+person1.getAge());
    System.out.println(" BlazerID:    "+person1.getBlazerID());
    System.out.println(" Palindrome?: "+person1.checkPalindrome());
    System.out.println(" Retirment:   "+person1.yearsUntilRetirement());
    System.out.println(" toString:    "+person1.toString());
    System.out.println("           ---FALSE IDENTITY TIME!---              ");
    person1.setName("racecar");
    person1.setAge(35);
    person1.setBlazerID("dalejr3");
    System.out.println("Person:       "+person1.getName());
    System.out.println(" Age:         "+person1.getAge());
    System.out.println(" BlazerID:    "+person1.getBlazerID());
    System.out.println(" Palindrome?: "+person1.checkPalindrome());
    System.out.println(" Retirment:   "+person1.yearsUntilRetirement());
    System.out.println(" toString:    "+person1.toString());
    System.out.println("---------------------------------------------------");
    UABPerson person2 = new UABPerson("TacoCat",49,"TC1337");
    System.out.println("Person:       "+person2.getName());
    System.out.println(" Age:         "+person2.getAge());
    System.out.println(" BlazerID:    "+person2.getBlazerID());
    System.out.println(" Palindrome?: "+person2.checkPalindrome());
    System.out.println(" Retirment:   "+person2.yearsUntilRetirement());
    System.out.println(" toString:    "+person2.toString());
    System.out.println("           ---FALSE IDENTITY TIME!---              ");
    person2.setName("Frank Costanza");
    person2.setAge(48);
    person2.setBlazerID("frankc0608");
    System.out.println("Person:       "+person2.getName());
    System.out.println(" Age:         "+person2.getAge());
    System.out.println(" BlazerID:    "+person2.getBlazerID());
    System.out.println(" Palindrome?: "+person2.checkPalindrome());
    System.out.println(" Retirment:   "+person2.yearsUntilRetirement());
    System.out.println(" toString:    "+person2.toString());
    System.out.println("---------------------------------------------------");
  }
}
