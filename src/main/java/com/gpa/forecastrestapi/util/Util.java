package com.gpa.forecastrestapi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {


    public static SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");

    public static Date currentDate() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        String data = formater.format(currentDate);
        return formater.parse(data);
    }

    public static String lastDayOfMonth(String mes) throws ParseException {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.MONTH, Integer.parseInt(mes)-1);
        return String.valueOf(instance.getActualMaximum(Calendar.DAY_OF_MONTH));
    }

    public static Date findInicialDateLastThirtyDays() throws ParseException {
        Date inicialDate = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(inicialDate );
        cal.add(Calendar.DATE, -30);
        inicialDate = cal.getTime();
        String data = formater.format(inicialDate);
        inicialDate = formater.parse(data);
        return inicialDate;
    }


}
