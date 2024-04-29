package edu.cqie.singleton;

public class Client {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        Customer c4 = new Customer();
        Customer c5 = new Customer();

        Staff s1 = new Staff(2);
        Staff s2 = new Staff(3);
        Staff s3 = new Staff(4);
        Staff s4 = new Staff(5);


        c1.getNumber();
        c3.getNumber();
        c2.getNumber();
        s1.callNumber();
        s2.callNumber();
        s4.callNumber();
        s3.callNumber();
    }
}
