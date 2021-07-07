/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Rebe
 */
public class Person {
    private String name;
    private LocalDate birtdate;

    public Person(String name, LocalDate birtdate) {
        this.name = name;
        this.birtdate = birtdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirtdate() {
        return birtdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirtdate(LocalDate birtdate) {
        this.birtdate = birtdate;
    }
    
    public int getAge(){
        LocalDate hoy = LocalDate.now();
        Period period = Period.between(birtdate,hoy);
        return (period.getYears());
    }
    
   
    
    
}
