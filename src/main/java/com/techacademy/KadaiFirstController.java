package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }

    @GetMapping("dayofweek/{val1}/")
    public String dispDayOfWeek(@PathVariable String val1){
        String days = val1;
        String A = days.substring(0,4);
        String B = days.substring(4,6);
        String C = days.substring(6,8);
        int year = Integer.parseInt(A);
        int month = Integer.parseInt(B);
        int day = Integer.parseInt(C);
        LocalDate  date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ENGLISH);
        }
    
    
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }
    @GetMapping("/minus/{val1}/{val2}")
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
