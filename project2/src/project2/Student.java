package project2;
public class Student {
    private String name,id,familyName;
    private double avg;
    public Student(String name, String id, String familyName, double avg) {
        this.name = name;
        this.id = id;
        this.familyName = familyName;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void printData(){
        System.out.println("Name = "+getName()+"\n"+"Id = "+getId()+"\n"+"familyName = "+getFamilyName()+"\n"+"avg = "+getAvg());
        System.out.println("---------------------------------------");
    }

}
