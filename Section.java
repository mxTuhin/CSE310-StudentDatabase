public class Section {
    public String sectionName;
    public String classTime;
    public Student[] student=new Student[5];
    public int slot=5;
    public int slotCounter=0;

    public Section(String _sectionName, String _classTime){
        sectionName=_sectionName;
        classTime=_classTime;
    }
}
