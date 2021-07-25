import java.util.Scanner;
import java.util.Arrays;
public class SectionDatabase {
    Section[] section=new Section[3];


    public SectionDatabase(){
        section[0]=new Section("Section-01", "Sunday: 12:30 pm 1:00 pm");
        section[1]=new Section("Section-02", "Sunday: 02:30 pm 4:00 pm");
        section[2]=new Section("Section-03", "Sunday: 05:30 pm 7:00 pm");
    }
    public void bookSection(int sec, Student student){
        if(section[sec].slot<=0){
            p("No Registration is possible");
        }
        else{
            section[sec].slot--;
            section[sec].student[section[sec].slotCounter]=student;
            section[sec].slotCounter++;
            p("The Reigstered Student is: ");
            p(student.toString());
        }

    }

    public void printSections(){
        p("Choose Any Section From Below");
        for(int i=0; i<section.length; ++i){
            p(i+1+"\t"+section[i].sectionName+"\t"+section[i].classTime+"\t"+section[i].slot+" Slot Remaining");
        }
    }
    public void getSectionStudent(int sec){
        p("Name\tSID");
        for(int i=0; i<section[sec].slotCounter; ++i){
            p(section[sec].student[i].toString());
        }

    }
    public void p(String  s){
        System.out.println(s);
    }
}
