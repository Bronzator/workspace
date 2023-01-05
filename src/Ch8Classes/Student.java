package Ch8Classes;

public class Student {
    //fields
    private String studentFirstName,studentLastName,studentMiddleName,guardianFirstName,guardianLastName,guardianEmail,guardianPhoneNumber,studentNickName;
    private double gpa;

    //constructors
    public Student(String studentFirstName,String studentMiddleName,String studentLastName,String guardianFirstName,String guardianLastName,String guardianEmail,String guardianPhoneNumber,String studentNickName,double gpa){
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.guardianFirstName = guardianFirstName;
        this.guardianLastName = guardianLastName;
        this.guardianEmail = guardianEmail;
        this.guardianPhoneNumber = guardianPhoneNumber;
        this.gpa = gpa;
        this.studentNickName = studentNickName;
    }
    public Student(String studentFirstName,String studentMiddleName,String studentLastName,String guardianFirstName,String guardianLastName,String guardianEmail,String guardianPhoneNumber,String studentNickName){
        this(studentFirstName,studentMiddleName,studentLastName,guardianFirstName,guardianLastName,guardianEmail,guardianPhoneNumber,studentNickName,3.0);
    }

    //getters
    public String getStudentFirstName(){
        return studentFirstName;
    }
    public String getStudentMiddleName(){
        return studentMiddleName;
    }
    public String getStudentLastName(){
        return studentLastName;
    }
    public String getGuardianFirstNameFirstName(){
        return studentFirstName;
    }
    public String getGuardianLastNameLastName(){
        return studentLastName;
    }
    public double gpa(){
        return gpa;
    }

    //setters
    public void setGuardianEmail(){
        this.guardianEmail = guardianEmail;
    }
    public void setGuardianPhoneNumber(){
        this.guardianPhoneNumber = guardianPhoneNumber;
    }
    public void setStudentNickName(){
        this.studentNickName = studentNickName;
    }

    //toString
    public String toString() {
        return "Student First Name: " + studentFirstName + "\n" +
                "Student First Name: " + studentMiddleName + "\n" +
                "Student First Name: " + studentLastName + "\n" +
                "Student Nickname: " + studentNickName + "\n" +
                "Guardian First Name: " + guardianFirstName + "\n" +
                "Guardian Last Name: " + guardianLastName + "\n" +
                "Guardian Email: " + guardianEmail + "\n" +
                "Guardian Phone Number: " + guardianPhoneNumber + "\n" +
                "GPA: " + gpa + "\n";
    }
}
