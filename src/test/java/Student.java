/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Student extends Stud {
    String uni;
    public Student(String n, String s, String f, String b, String a, String p, String u) {
        super(n, s, f, b, a, p);
        uni = u;
    }
    @Override
    void printlist() {
        System.out.println(name + sname + fname + birth + addr + phone + uni);
    }
}
