/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author virad
 */
public class MyAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Manager();
        emp.setName("Tom");
        emp.getSalary();
        
        
                
                
        Employee emp1 = new Consultant();
        emp1.setName("tim");
        System.out.println("Name =" + emp1.getName());
        emp1.getSalary();
    }
    
}
