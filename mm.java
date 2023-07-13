class Main{
    public static void main(String[] args) {
        Student TW = new Student(6, TW, 65, 2.89);
        TW.ShowDetails();
        TW.Setting(8, TW, 65, 4.00);
        TW.ShowDetails();
    }
}

class Student{

    public int ID;
    public String Name;
    public int AddmissionYear;
    public double GPA;

    Student(int ID , String Name , int AddmissionYear , double GPA){
        this.ID = ID;
        this.Name = Name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA;
    }

    public void ShowDetails(){
        System.out.println("ID : " + this.ID);
        System.out.println("Name : " + this.Name);
        System.out.println("Addmission Year : " + this.AddmissionYear);
        System.out.println("GPA : " + this.GPA);
    }

    public void Setting(int ID , String Name , int AddmissionYear , double GPA){
        this.ID = ID;
        this.Name = Name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA; 
    }
}
