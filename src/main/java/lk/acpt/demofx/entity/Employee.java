package lk.acpt.demofx.entity;

public class Employee {
    private int idNo;
    private String name;
    private String address;
    private String position;

    public Employee(int idNo, String name, String address, String position) {
        this.idNo = idNo;
        this.name = name;
        this.address = address;
        this.position = position;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
