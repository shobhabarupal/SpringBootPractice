package com.db.SpringBoot.SpringBootPractice.Model;

import java.util.List;

public class PermEmployee {

    private int rollno;
    private List<TempEmployee> temp;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public List<TempEmployee> getTemp() {
        return temp;
    }

    public void setTemp(List<TempEmployee> temp) {
        this.temp = temp;
    }
}
