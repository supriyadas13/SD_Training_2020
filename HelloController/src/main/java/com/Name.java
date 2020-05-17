package com.MyMaven.HelloController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Name {
    
    @Id

    private String Value;
    
    public Person(){

    }
   
    public Name(String name){
        this.value=name;
    }

    public String getValue(){
        return value;
    }

    //public String setValue(String value){
     //   this.value=value;
    //}
}