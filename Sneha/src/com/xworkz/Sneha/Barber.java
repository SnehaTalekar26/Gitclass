package com.xworkz.Sneha;

class Barber {
    public void cutHair(Customer customer) {
        System.out.println("Running Barber");
        if (customer != null) {
            customer.getHaircut();
        } else {
            System.out.println("Customer object is null");
        }
    }

}
