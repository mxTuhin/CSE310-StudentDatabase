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
import java.util.Arrays;
public class StudentDatabase 
{
  Scanner abc = new Scanner(System.in);
  Student [] array = new Student[15];
  public Student instance;
  int fillUp = 0;
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
      array[fillUp] = new Student();
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
  public void deleteRecord(String _id){
    int index=0;
    for(int i=0; i<fillUp; ++i){

      if(_id.equals(array[i].sid)){
        p("Into: "+array[i].sid);
        if(i+1<fillUp){
          array[i].name=array[i+1].name;
          array[i].sid=array[i+1].sid;
          array[i].email=array[i+1].email;
          array[i].password=array[i+1].password;
        }
        else{
          array[i].name="";
          array[i].sid="";
          array[i].email="";
          array[i].password="";
        }
        fillUp--;
        break;
      }
    }
    System.out.println("The record has been deleted");
  }
  public String login(String email, String password){
    String status="NotAssociated";
    for(int i=0; i<fillUp; ++i){
      if(email.equals(array[i].email) && password.equals(array[i].password)){
        instance=array[i];
        return array[i].sid;
      }
    }

    return status;

  }

  public void editRecord(String _id){
    for(int i=0; i<array.length; ++i){
      if(_id.equals(array[i].sid)){
        p("Please Type Your Name");
        array[i].name = abc.nextLine();
        p("Please Type Your ID");
        array[i].sid = abc.nextLine();
        p("Please Type Your Email Address");
        array[i].email = abc.nextLine();
        p("Please Type Your Password");
        array[i].password = abc.nextLine();
        break;
      }
    }
  }
  void printRecord()
  {
    int i,j;
    Student tmp;
    i = 0;
    while(i < fillUp)
    {      
      j = 1;
      while(j < fillUp)
      {
        if(array[j-1].sid.compareTo(array[j].sid) > 0)
        {
          tmp = array[j - 1];
          array[j - 1]= array[j];
          array[j]=tmp;
        }        
        if(array[j-1].sid.compareTo(array[j].sid) == array[j-1].sid.compareTo(array[j].sid))
        {
          int k,l;
          Student temp;
          k = 0;
          while(k < fillUp)
          {
            l = 1;
            while(l < fillUp)
            {
              if(array[l-1].name.compareTo(array[l].name) > 0)
              {
                temp = array[l - 1];
                array[l - 1] = array[l];
                array[l] = temp;
              }
              l++;
            }
            k++;
          }
        }
        j++;
      }
      i++;
    }
  }
}
