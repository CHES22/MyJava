package com.javacourse.se;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lesson48_Date {
    public void doMethod() throws ParseException {

        // Sat Jun 19 20:20:23 MSK 2021 (Date)
        Date date = new Date();
        System.out.println(date);

        // Sat Jun 26 20:20:23 MSK 2021 (Calendar)
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.WEEK_OF_MONTH,1);
        System.out.println(calendar.getTime());

        //26.06.2021 (DateFormat)
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));

        // 26/06/2021 20:31 (SimpleDateFormat)
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        //parse
        Date newDate = simpleDateFormat.parse("30/01/1981 03:45");
        System.out.println(newDate);
    }
}
