public class ExamResults {

   public static void main(String[] args){

      int choice;
     
      do {

        System.out.println("Menu:");
        System.out.println("1. View JAVA results");
        System.out.println("2. View API results");
        System.out.println("3. View Network Design results");
        System.out.println("4. View HCI results");
        System.out.println("5. View Structured cabling results");
        System.out.println("6. Exit the program");
        System.out.println("Choose an option: ");

        choice = 1;

        switch (choice) {
          case 1:
           viewResults("JAVA", 5,4,8,13,13,30);
            break;
          case 2:
            viewResults("API", 5,4,8,13,11,34);
            break;
          case 3:
             viewResults("Network Design results",3,4,10,12,11,29);
            break;
          case 4:
              viewResults("HCI", 5,4,7,12,11,34);
          case 5:
               viewResults("Structured Cabling", 5,5,8,11,11,34);
          case 6:
               System.out.println("Exiting the program");
         default:
             System.out.println("Invalid choice. Please try again.");

    }
  } while (choice != 6);
}

  public static void viewResults(String unit, int ass1, int ass2, int ass3, int CAT1, int CAT2, double examScore) {
     int totalcoursework = ass1 + ass2 + ass3 + CAT1 + CAT2;
     double courseworkScore = (totalcoursework / 250.0) * 50;

     double totalScore = courseworkScore + examScore;

        System.out.println("Unit:" +unit);
        System.out.println("coursework score: " + courseworkScore + "/50");
        System.out.println("Final Exam score: " + examScore +"/50");
        System.out.println("Total score: " +totalScore + "/100");
        
    if(totalcoursework >= 2 * 250 /3) {
        System.out.println("Student has done 2/3 of the Coursework. ");
     } else {
        System.out.println("Student has not done 2/3 of the Coursework. Repeat required.");

  }
}
}
       

   