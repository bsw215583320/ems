package com.lanbao.ems.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Date getNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        return date;
    }
    public static Date getNextHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -10);
        date = calendar.getTime();
        return date;
    }
}
