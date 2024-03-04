package Bai1;

import java.util.ArrayList;

public class ManagerHotel {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Room> rooms;

    public ManagerHotel() {
        //Khởi tạo list danh sách chứa các customer
        customers = new ArrayList<>();
    }

    // Phương thức thêm mới khách hàng
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Phương thức xoá khách hàng theo số chứng minh nhân dân
    public void removeCustomer(String idCardNumber) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdCardNumber().equals(idCardNumber)) {
                // Phương thức remove của arraylist để xóa 1 phần tử khỏi list
                customers.remove(i);
                System.out.println("Removed customer with ID card number: " + idCardNumber);
                return;
            }
        }
        System.out.println("Customer with ID card number " + idCardNumber + " not found.");
    }

    // Phương thức tính tiền thuê phòng cho khách hàng
    public double calculateBill(String idCardNumber, int numOfDays) {
        double totalBill = 0;
        for (Customer customer : customers) {
            // Tìm customer có idCardNumber = idCardNumber
            if (customer.getIdCardNumber().equals(idCardNumber)) {
                totalBill += customer.getRoom().getPrice() * numOfDays;
                return totalBill;
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy khách hàng
    }

    // Phương thức hiển thị thông tin của một khách hàng theo số chứng minh nhân dân
    public void showCustomerInfo(String idCardNumber) {
        for (Customer customer : customers) {
            if (customer.getIdCardNumber().equals(idCardNumber)) {
                System.out.println("Full name: " + customer.getFullName());
                System.out.println("Age: " + customer.getAge());
                System.out.println("ID card number: " + customer.getIdCardNumber());
                return;
            }
        }
        System.out.println("Customer with ID card number " + idCardNumber + " not found.");
    }

    // Phương thức hiển thị tất cả thông tin của khách hàng và các phòng thuê
    public void showAllInfo() {
        System.out.println("Customers:");
        for (Customer customer : customers) {
            System.out.println("Full name: " + customer.getFullName() + ", Age: " + customer.getAge() + ", ID card number: " + customer.getIdCardNumber() + "Room:" + customer.getRoom());
        }
    }
}
