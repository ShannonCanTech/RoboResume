package com.company;

public class Skills {
    private String technical;
    private String soft;
    private String general;
    private int rating;

    public Skills() {
    }

    public Skills(String technical, String soft, String general, int rating) {
        this.technical = technical;
        this.soft = soft;
        this.general = general;
        this.rating = rating;
    }


    public String technicalSkills(){
        return technical + '\t';
    }

    public String softSkills(){
        return soft + '\t';
    }

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }

    public String getSoft() {
        return soft;
    }

    public void setSoft(String soft) {
        this.soft = soft;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
