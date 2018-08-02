package com.kg.Library.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;


/**
 * Student
 */
@Entity

public class Book {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="Name")
	private String name;

    @ManyToOne
    @JoinColumn(name="deptid")
    private Department dept;
	
    
    public Book(){};
    public Book(Long id, String name){this.id=id;this.name=name;}

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
/**
 * @return the dept
 */
public Department getDept() {
    return dept;
}
/**
 * @param dept the dept to set
 */
public void setDept(Department dept) {
    this.dept = dept;
}

    @Override
    public String toString() {
        return "id:"+id+" ,name:"+name;
    }
	// public Object thenReturn(Student student3) {
	// 	return null;
	// }
}