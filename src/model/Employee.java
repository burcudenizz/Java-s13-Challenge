package model;

import java.util.Arrays;

public class Employee {

    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;


    public Employee(long id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }


    public void addHealthplan(int index, String name) {

        try {
            boolean isExist = false;
            for (String healthplan : healthplans) {
                if (healthplan.equals(name)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                if (healthplans[index] == null) {
                    healthplans[index] = name;
                } else {
                    System.out.println("this index is full.");
                }
            } else {
                System.out.println(name + "this name is already used.");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("there is no index for this number." + index);
        }


    }

    @Override
    public String toString() {
        return "Fullname:" + fullName + " Healthplans:" + Arrays.toString(healthplans);
    }
}
