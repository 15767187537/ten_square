package com.xztx.utils;

import java.util.Date;

public class DateUtil {

    public static long dateToStamp(Date date) {
        return date.getTime() / 1000;
    }

}
