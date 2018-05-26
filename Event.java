package kh.rupp.mestudy.mystudy;

/**
 * Created by ACER on 04/23/2018.
 */

public class Event {
    private int id;
    private String tittle;
    private String description;
    private String location;
    private String date;
    public Event() {
    }

    public Event(int id,String tittle,String description,String location,String date) {
        this.id = id;
        this.tittle=tittle;
        this.description=description;
        this.location=location;
        this.date=date;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }







}
