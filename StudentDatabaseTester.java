/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Wasif Shafaet Chowdhury
 */
import java.util.Scanner;
public class StudentDatabaseTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Scanner abc = new Scanner(System.in);
     StudentDatabase sd = new StudentDatabase();
     while(true)
     {
      sd.p("Enter 1 to Add a Record");
      sd.p("Enter 2 to Print the Records");
      sd.p("Enter 3 to Delete a Record");
      sd.p("Enter 4 to Edit a Record");
      int choise = abc.nextInt();
      if(choise == 1)
      {
        sd.addRecord();
      }
      else if(choise == 2)
      {
        sd.printRecord();
        sd.print();
      }
      else if(choise==3){
          abc.nextLine();
          sd.p("Type your Student ID");
          String studentID=abc.nextLine();
          sd.deleteRecord(studentID);
      }
      else if(choise==4){
          abc.nextLine();
          sd.p("Type your Student ID");
          String studentID=abc.nextLine();
          sd.editRecord(studentID);
      }
    }
  }
}
