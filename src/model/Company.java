package model;

import java.util.Arrays;

public class Company {

    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }


    public void setGiro(double giro) {
        checkGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {

        try {
            if (developerNames[index] == null) {
                this.developerNames[index] = name;
            } else {
                System.out.println("this index is full.");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("there is no index for this number." + index);
        }

    }


    private void checkGiro(double giro) {
        this.giro = giro < 0 ? 0 : giro;
    }

    @Override
    public String toString() {
        return "company name: " + name + " giro: " + giro + " developers" + Arrays.toString(developerNames);
    }
}
