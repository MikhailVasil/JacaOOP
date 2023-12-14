package phoneBook;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String secondName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String numberMobile;

    private Gender gender;

    public User(String firstName, String secondName, String lastName, LocalDate dateOfBirth,
                String numberMobile, Gender gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.numberMobile = numberMobile;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public String getNumberMobile() {
        return numberMobile;
    }

    public void setNumberMobile(String numberMobile) {
        this.numberMobile = numberMobile;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", numberMobile='" + numberMobile + '\'' +
                ", gender=" + gender +
                '}';
    }
//    @Override
//    public String toString() {
//        //<Фамилия><Имя><Отчество><дата рождения><номер телефона><пол>
//        return "<" + getFirstName() + "><" + getSecondName() + "><" + getLastName()
//                + "><" + getDateOfBirth() + "><" + getNumberMobile() + "><"
//                + getGender() + ">";
//    }
}