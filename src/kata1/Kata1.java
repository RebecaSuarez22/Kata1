/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Rebe
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.parse("2000-12-22");
        Person person = new Person("Rebeca",nacimiento);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
        
    }
    
}
