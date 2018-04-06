package com.company;

public class Experience {
    private String company;
    private String role;
    private String startingMonth;
    private String startingYear;
    private String endingMonth;
    private String endingYear;

    public Experience() {
    }

    public Experience(String company, String role, String startingMonth, String startingYear, String endingMonth, String endingYear) {
        this.company = company;
        this.role = role;
        this.startingMonth = startingMonth;
        this.startingYear = startingYear;
        this.endingMonth = endingMonth;
        this.endingYear = endingYear;
    }

    public String experienceInfo() {
        return getCompany() + " " + getRole()+ '\t' + getStartingMonth() + "/" + getStartingYear() + '\t' + getEndingMonth() + "/" + getEndingYear() + '\n';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String getStartingMonth() {
        return startingMonth;
    }

    public String getStartingYear() {
        return startingYear;
    }

    public String getEndingMonth() {
        return endingMonth;
    }

    public String getEndingYear() {
        return endingYear;
    }

    public void setStartingMonth(String startingMonth) {
        this.startingMonth = startingMonth;
    }

    public void setStartingYear(String startingYear) {
        this.startingYear = startingYear;
    }

    public void setEndingMonth(String endingMonth) {
        this.endingMonth = endingMonth;
    }

    public void setEndingYear(String endingYear) {
        this.endingYear = endingYear;
    }
}
