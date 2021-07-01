package Section2;

// Write a class with the name Person. The class needs three fields (instance variables) with the names 
// firstName, lastName of type String and age of type int. 

// Write the following methods (instance methods):

// *Method named getFirstName without any parameters, it needs to return the value of the firstName field.
// *Method named getLastName without any parameters, it needs to return the value of the lastName field.
// *Method named getAge without any parameters, it needs to return the value of the age field.
// *Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
// *Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
// *Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
// *Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
// *Method named getFullName without any parameters, it needs to return the full name of the person.
//     *In case both firstName and lastName fields are empty, Strings return an empty String.
//     *In case lastName is an empty String, return firstName.
//     *In case firstName is an empty String, return lastName.

public class Person {

    private String firstName, lastName;
    private int age;

    // GETTERS and SETTERS
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0 || age > 100) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
        
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }
    
    public boolean isTeen() {
        if(age > 12 && age < 20) {
            return true;
        }
        else {
             return false;
        }
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }

        else if(firstName.isEmpty() && !(lastName.isEmpty())){
            return lastName;
        }

        else if(!(firstName.isEmpty()) && lastName.isEmpty()){
            return firstName;
        }

        else {
            return this.firstName + " " + this.lastName;
        }
    }

    public static void main(String[] args) {
        Person johnny = new Person();

        System.out.println(johnny.getFullName());

        johnny.setFirstName("Johnny");

        System.out.println(johnny.getFullName());
        

        johnny.setFirstName("McGrack");

        System.out.println(johnny.getFullName());

    }
}
