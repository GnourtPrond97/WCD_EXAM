package entity;

import hannotation.Column;
import hannotation.Entity;
import hannotation.Id;

import java.util.Date;
@Entity(tableName = "Employee")
public class Employee {
    @Id(autoIncrement = true)
    @Column(columnName = "Id" , columnType = "int")
    private  int id;
    @Column(columnName = "fullName", columnType = "varchar(200)")
    private String fullName;
    @Column(columnName = "birthDay", columnType = "varchar(200)")

    private String birthDay;
    @Column(columnName = "address", columnType = "varchar(200)")

    private String address;
    @Column(columnName = "position", columnType = "varchar(200)")

    private String position;
    @Column(columnName = "department", columnType = "varchar(200)")

    private String department;

    public Employee() {
    }

    public Employee(String fullName, String birthDay, String address, String position, String department) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
        this.position = position;
        this.department = department;
    }

    public Employee(int id, String fullName, String birthDay, String address, String position, String department) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
        this.position = position;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
