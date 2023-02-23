package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstSpringBoot {

    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }

    @GetMapping("dayofweek/{val1}/")
    public String dispDayOfWeek(@PathVariable int val1, TextStyle Textstyle){
        String days = String.valueOf(val1);
        String A = days.substring(0,4);
        String B = days.substring(4,6);
        String C = days.substring(6,8);
        int year = Integer.parseInt(A);
        int month = Integer.parseInt(B);
        int day = Integer.parseInt(C);
        var  date = LocalDate.of(year, month, day);
        DayOfWeek weekday1 = date.getDayOfWeek();
        String weekday2 = weekday1.getDisplayName(Textstyle.FULL,Locale.ENGLISH);
        return weekday2;
        }

    
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }
    @GetMapping("/minius/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }

    
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
    }
    
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }
    
}