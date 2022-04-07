package com.example.SurveyManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SurveyDetails {

    private String id;
    private String name;
    private String type;
    private int startDate;
    private int endDate;

    protected SurveyDetails(){
        
    }

    public SurveyDetails(String id, String name, String type, int startDate, int endDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }


}
