package com.myshow4all.student_internship_program.payload;

import lombok.Data;

import java.util.Date;

@Data
public class DateWrapper {
    private Date date;

    public DateWrapper(Date date) {
        this.date = date;
    }


    public DateWrapper() {

    }

}
