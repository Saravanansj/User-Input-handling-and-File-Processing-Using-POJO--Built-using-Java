package org.saro;

public class Teacher {

    private int id;
    private String name;
    private String position;
    private long phone;

    // Getter & Setter for id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter & Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter for position
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter & Setter for phone
    public long getPhone() {
        return phone;
    }
    public void setPh(long phone) {
        this.phone = phone;
    }

    // Optional: toString for easy display
    @Override
    public String toString() {
        return "Teacher [ID=" + id + ", Name=" + name + ", Position=" + position + ", Phone=" + phone + "]";
    }
}
