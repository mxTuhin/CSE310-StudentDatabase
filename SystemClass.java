import java.util.Scanner;

public class SystemClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentDatabase sd = new StudentDatabase();
        FacultyDatabase fd = new FacultyDatabase();
        SectionDatabase scd= new SectionDatabase();


        while (true){
            p("Press \n1: Interact as a Student\n2: Interact as  Faculty");
            int choice=sc.nextInt();
            if(choice==1){
                p("Enter 1 to Register Yourself");
                p("Enter 2 to Login as Student");

                int choise = sc.nextInt();
                if(choise == 1)
                {
                    sd.addRecord();
                }
                else if(choise == 2)
                {
                    sc.nextLine();
                    p("Enter your Email:");
                    String email = sc.nextLine();
                    p("Enter Your Password");
                    String password = sc.nextLine();
                    String status=sd.login(email, password);
                    if(status.equalsIgnoreCase("NotAssociated")){
                        p("The Student Does Not Exists");
                    }
                    else{
                        p("Enter 1 to Register for a section");
                        p("Enter 2 to Edit a Record");
                        p("Enter 3 to Delete Your Account ");
                        int locChoice=sc.nextInt();
                        if(locChoice==1){
                            scd.printSections();
                            p("Type The Section Number: ");
                            int secChoice=sc.nextInt();
                            scd.bookSection(secChoice-1, sd.instance);


                        }
                        else if(locChoice==2){
                            sd.editRecord(status);
                        }
                        else if (locChoice==3){
                            sd.deleteRecord(status);
                        }
                        else{
                            p("Wrong Input");
                        }
                    }
                }
            }
            else if(choice==2){
                p("Please type 1 to Register");
                p("Please type 2 to login as a faculty");

                int choise = sc.nextInt();
                if(choise == 1)
                {
                    fd.addRecord();
                }
                else if(choise == 2)
                {
                    sc.nextLine();
                    fd.p("Please Type your email: ");
                    String email = sc.nextLine();
                    fd.p("Please Type your password: ");
                    String password=sc.nextLine();
                    String status=fd.loginFaculty(email, password);
                    if(status.equalsIgnoreCase("NotAssociated")){
                        p("The Faculty Does Not Exists");
                    }
                    else{
                        scd.printSections();
                        p("Type Section Number to see Section Info");
                        int locChoice=sc.nextInt();
                        scd.getSectionStudent(locChoice-1);


                    }
                }
            }
        }
    }

    public static void p(String s){
        System.out.println(s);
    }
}

