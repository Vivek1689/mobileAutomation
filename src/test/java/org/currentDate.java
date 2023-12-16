package org;

import java.util.Calendar;
import java.util.Date;

public class currentDate {

    public static void main(String[] args){
        Date d= new Date();
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
        System.out.println(d.toString().split("15")[0].split("Thu")[1].trim());

    }
}
