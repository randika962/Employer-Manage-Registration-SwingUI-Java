/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employer_management;

public class Emp_users {

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static Object get(int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    //-----------------------Create variables----------------------
    
    public int empID;
    public String empName;
    public String empAddress;
    public String empEmail;
    public String empContact;
    
    //---------------------Parameterized Contructor---------------- 

    public Emp_users(int empID, String empName, String empAddress, String empEmail, String empContact) {
        this.empID = empID;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empEmail = empEmail;
        this.empContact = empContact;
    }
    
    //---------------------Default Contructor----------------------
    
    public Emp_users(){
    
    
    }
    
    //---------------------Using toString--------------------------

    @Override
    public String toString() {
        return "Emp_users{" + "empID=" + empID + ", empName=" + empName + ", empAddress=" + empAddress + ", empEmail=" + empEmail + ", empContact=" + empContact + '}';
    }
    
    //------------------------Get Methods--------------------------

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public String getEmpContact() {
        return empContact;
    }
    
    //----------------------Set Methods---------------------------

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public void setEmpContact(String empContact) {
        this.empContact = empContact;
    }
    
    
}
