import java.util.Scanner;

public class FacultyTester {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner abc = new Scanner(System.in);
        FacultyDatabase fd = new FacultyDatabase();
        while(true)
        {
            fd.p("Please type 1 to Register");
            fd.p("Please type 2 login as a faculty");
            fd.p("Please Type 3 to select section");
            int choise = abc.nextInt();
            if(choise == 1)
            {
                fd.addRecord();
            }
            else if(choise == 2)
            {
                abc.nextLine();
                fd.p("Please Type your email: ");
                String email = abc.nextLine();
                fd.p("Please Type your password: ");
                String password=abc.nextLine();
                fd.loginFaculty(email, password);
            }
        }
    }
}
