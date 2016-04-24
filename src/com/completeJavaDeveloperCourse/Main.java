/*

     Linked List:
    |-------------------------|
    | Index | Address | Value |
    |-------|---------|-------|
    | 0     | 100     | 34    |
    | 1     | 104     | 18    |
    | 2     | 108     | 91    |
    | 3     | 112     | 57    |
    | 4     | 116     | 453   |
    | 5     | 120     | 68    |
    | 6     | 124     | 6     |
    |-------------------------|

 */


package com.completeJavaDeveloperCourse;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Jimmy", 51.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2); // add 2 in index position 1

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
