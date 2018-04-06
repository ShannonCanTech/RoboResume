package com.company;

public class Education {
    private String school;
    private String major;
    private String degree;
    private String startMonth;
    private String startYear;
    private String gradMonth;
    private String gradYear;

    public Education() {
    }

    public Education(String school, String major, String degree, String startMonth, String startYear, String gradMonth, String gradYear) {
        this.school = school;
        this.major = major;
        this.degree = degree;
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.gradMonth = gradMonth;
        this.gradYear = gradYear;
    }

    public String educationInfo(){
        return getSchool() + '\t' + getDegree() + '\t' + getMajor() + '\t' + getStartMonth() + "/" + getStartYear() + '\t' + getGradMonth() + "/" + getGradYear();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getGradMonth() {
        return gradMonth;
    }

    public void setGradMonth(String gradMonth) {
        this.gradMonth = gradMonth;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }
}
