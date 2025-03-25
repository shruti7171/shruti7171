
1. Address Class (Address.java)

public class Address {
    private String building;
    private String street;
    private String city;
    private String district;
    private String state;
    private String pin;

    // Setters
    public void setBuilding(String building) {
        this.building = building;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    // Getters
    public String getBuilding() {
        return building;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

    public String getPin() {
        return pin;
    }
}



2. User Class (User.java)

import java.time.LocalDate;

public class User {
    private String fName;
    private String lName;
    private String mName;
    private Address permanentAddress;
    private String email;
    private String mobile;
    private LocalDate birthdate;

    // Constructor
    public User() {
        this.permanentAddress = new Address();
    }

    // Setters
    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public void setMiddleName(String mName) {
        this.mName = mName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setBirthDate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    // Getters
    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public String getMiddleName() {
        return mName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public LocalDate getBirthDate() {
        return birthdate;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }
}


3. Application Class (Application.java)

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        // Input for User details
        System.out.print("Enter First Name: ");
        user.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        user.setLastName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        user.setMiddleName(scanner.nextLine());

        System.out.print("Enter Email: ");
        user.setEmail(scanner.nextLine());

        System.out.print("Enter Mobile Number: ");
        user.setMobile(scanner.nextLine());

        System.out.print("Enter Birthdate (YYYY-MM-DD): ");
        user.setBirthDate(LocalDate.parse(scanner.nextLine()));

        // Input for Address details
        Address address = user.getPermanentAddress();
        System.out.print("Enter Building Name: ");
        address.setBuilding(scanner.nextLine());

        System.out.print("Enter Street: ");
        address.setStreet(scanner.nextLine());

        System.out.print("Enter City: ");
        address.setCity(scanner.nextLine());

        System.out.print("Enter District: ");
        address.setDistrict(scanner.nextLine());

        System.out.print("Enter State: ");
        address.setState(scanner.nextLine());

        System.out.print("Enter PIN Code: ");
        address.setPin(scanner.nextLine());

        // Displaying User Details
        System.out.println("\nUser Details:");
        System.out.println("Name: " + user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Mobile: " + user.getMobile());
        System.out.println("Birthdate: " + user.getBirthDate());
        
        // Displaying Address Details
        System.out.println("\nAddress Details:");
        System.out.println("Building: " + address.getBuilding());
        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
        System.out.println("District: " + address.getDistrict());
        System.out.println("State: " + address.getState());
        System.out.println("PIN Code: " + address.getPin());

        scanner.close();
    }
}

