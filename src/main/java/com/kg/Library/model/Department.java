package com.kg.Library.model;

import java.util.ArrayList;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Columns;


/**
 * Student
 */
@Entity
public class Department {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="deptid")
    private Long id;
    @Column(name="deptname")
	private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="dept")
    private List<Book> mylist=new ArrayList<Book>();
    
    // public Library(){};
    public Department(Long id, String name){this.id=id;this.name=name;}

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id:"+id+" ,name:"+name;
    }
	// public Object thenReturn(Student student3) {
	// 	return null;
	// }
}