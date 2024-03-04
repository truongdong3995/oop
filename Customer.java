package Bai1;

public class Customer {
    private static String city = "HANOI";
    private String fullName;
    private int age;
    private String idCardNumber;

    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer(String fullName, int age, String idCardNumber, Room room) {
        this.fullName = fullName;
        this.age = age;
        this.idCardNumber = idCardNumber;
        this.room = room;
    }

    // Getter methods
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }


}
