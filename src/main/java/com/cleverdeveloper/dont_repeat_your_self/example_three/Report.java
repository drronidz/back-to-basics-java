package com.cleverdeveloper.dont_repeat_your_self.example_three;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/30/2022 12:58 AM
*/

import com.diogonunes.jcolor.Attribute;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Report {


    public int id;
    public String name;
    public String product;
    public Date startDate;
    public Date endDate;
    public double total;
    public double averagePerDay;
    public double averagePerWeek;

    public Report(int id, String name, String product, String startDate, String endDate, double total) throws ParseException {
        this.id = id;
        this.name = name;
        this.product = product;
        this.startDate = formatStringToDate(startDate);
        this.endDate = formatStringToDate(endDate);
        this.total = total;
        this.averagePerDay = total / 365;
        this.averagePerWeek = total / 52;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", startDate=" + formatDateToString(startDate) +
                ", endDate=" + formatDateToString(endDate) +
                ", total=" + total +
                ", averagePerDay=" + averagePerDay +
                ", averagePerWeek=" + averagePerWeek +
                '}';
    }

    public void show () {
        System.out.println(colorize( " " + this.toString() + " ",
                Attribute.BOLD(),
                Attribute.TEXT_COLOR(0,0,0),
                Attribute.BACK_COLOR(255, 255, 255)));
    }



    public String formatDateToString(Date date) {
        return new SimpleDateFormat("dd/MM/YYYY").format(date);
    }

    public Date formatStringToDate(String date) throws ParseException {
        return new SimpleDateFormat("dd/MM/YYYY").parse(date);
    }
}
