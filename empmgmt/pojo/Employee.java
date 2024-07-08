/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.pojo;

/**
 *
 * @author HP
 */
public class Employee {
    private int empNo;
    private String empName;
    private double sal;

    public Employee()
    {
        
    }
    
    public Employee(int empNo, String empName, double sal) {
        this.empNo = empNo;
        this.empName = empName;
        this.sal = sal;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
