/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Rebe
 */
public class Person {
    private String name;
    private Date birtdate;

    public Person(String name, Date birtdate) {
        this.name = name;
        this.birtdate = birtdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirtdate() {
        return birtdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirtdate(Date birtdate) {
        this.birtdate = birtdate;
    }
    
    public int getAge(){
        return (int) (new Date().getTime() - birtdate.getTime()/ 31536000000L);
    }
    
    
    
}
