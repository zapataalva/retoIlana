package models;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String DateBirth;

    public Student(String firstName, String lastName, String email, String gender, String mobile, String dateBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.mobile = mobile;
        DateBirth = dateBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDateBirth() {
        return DateBirth;
    }

    public void setDateBirth(String dateBirth) {
        DateBirth = dateBirth;
    }
}
