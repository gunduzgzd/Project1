package org.example;

public enum ProjectStatus {
    
    OPEN,CLOSE,PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }
    ProjectStatus(){

    }
}
