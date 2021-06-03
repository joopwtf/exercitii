package com.company;

public class VipCustomers {
    private String name;
    private double creditLimit;
    private String customerEmailAddress;

    public VipCustomers(){
        this("Default name", 50.000, "default@asss.com");
    }

    public VipCustomers(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomers(String name, double creditLimit, String customerEmailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
}
