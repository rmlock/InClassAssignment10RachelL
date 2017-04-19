package com.example.android.inclassassignment10_rachellockerman;

import java.util.Calendar;

/**
 * Created by Rachel Lockerman on 4/5/2017.
 */

public class User {
    String name;
    String placement;
    String time;

    public User() {

    }

    public User(String name, String placement, String time) {
        this.name = name;
        this.placement = placement;

        this.time = time;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String toReadableTime() {
        long postTime = Long.valueOf(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(postTime);
        return calendar.getTime().toString();
    }

    public String toString() {
        return "Welcome: " + name + '\n' + "Your placement is: " + placement + '\n' +"Last Updated: " + toReadableTime();
    }

}
