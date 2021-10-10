/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spdvi;
import java.time.LocalDate;
/**
 *
 * @author angel
 */
public class User {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    
    public User(int id, String firstName, String lastName, LocalDate birthDate, String gender, boolean isAlive) throws ArgumentNullException {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        if (gender == null || gender.isBlank() || gender.isEmpty()){
            throw new ArgumentNullException("No null");
        }
        this.isAlive = isAlive;
    }
    
    
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private boolean isAlive;

    private int Edad(){
        int edad;
        edad = LocalDate.now().getYear() - birthDate.getYear();
        return edad;
    }
    
    private String Alive(){
        if (isAlive)
            return "Alive";
        return "Dead";
    }
    

    public String toString2() {
        return id + "," + firstName + "," + lastName + "," + birthDate + "," + gender + "," + Alive() + "\n";
    }
    
    @Override
    public String toString() {
        return id + ": " + firstName + ", " + lastName + " - " + Edad() + " years old - " + gender + " - " + Alive() + "\n";
    }
    
}
