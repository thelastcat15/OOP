/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Date;

public class Bank {
    static class Account {
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated;

        Account() {
            
        }
        Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        public String getId() {
            return "ID : "+this.id;
        }

        public void setId(int id) {
            this.id = id;
        }
        
        public String getId() {
            return "ID : "+this.id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    
    public static void main(String[] args) {

    }
}
