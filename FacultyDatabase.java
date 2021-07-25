import java.util.Scanner;
public class FacultyDatabase {
    Scanner abc = new Scanner(System.in);
    Faculty [] array = new Faculty[15];
    int fillUp = 0;
    int[] seats = {5, 5, 5};
    public void p(String s)
    {
        System.out.println(s);
    }
    void print()
    {
        int x = 0;
        while(x < fillUp)
        {
            System.out.println(x + "\n" +array[x].toString());
            x++;
        }
    }

    public void addRecord()
    {
        if (fillUp < array.length)
        {
            array[fillUp] = new Faculty();
            p("Please Type Your Name");
            array[fillUp].name = abc.nextLine();
            p("Please Type Your ID");
            array[fillUp].sid = abc.nextLine();
            p("Please Type Your Email Address");
            array[fillUp].email = abc.nextLine();
            p("Please Type Your Password");
            array[fillUp].password = abc.nextLine();
        }
        fillUp++;
    }
    public String loginFaculty(String _email, String _pass)
    {
        String status="NotAssociated";
        for(int i=0; i<fillUp; ++i){
            if(_email.equals(array[i].email)){
                if (_pass.equals(array[i].password)){
                    status=array[i].sid;
                    return status;
                }
            }
        }
        return status;
    }
}
