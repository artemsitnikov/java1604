/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Npack;

import java.util.Date;

/**
 *
 * @author JAVA
 */
public class Student {
    private int id;
    private String name;
    private Date birth;
    private String edtype;
    private String edform;
    private int idspec;
    private boolean isactive;

    public Student() {
    }

    public Student(int id, String name, Date birth, String edtype, String edform, int idspec, boolean isactive) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.edtype = edtype;
        this.edform = edform;
        this.idspec = idspec;
        this.isactive = isactive;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudname() {
        return name;
    }

    public void setStudname(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEducationtype() {
        return edtype;
    }

    public void setEducationtype(String edtype) {
        this.edtype = edtype;
    }

    public String getEducationform() {
        return edform;
    }

    public void setEducationform(String edform) {
        this.edform = edform;
    }

    public int getIdspec() {
        return idspec;
    }

    public void setIdspec(int idspec) {
        this.idspec = idspec;
    }
   
   
}