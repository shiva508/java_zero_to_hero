package com.pool;

public enum Classmate {
    SHIVA(408),NITHYA(504),KOUSAR(423),GEETA;
    Integer rollNumber;
    Classmate(Integer rollNumber){
    }
    Classmate(){
        this.rollNumber=501;
    }
    public Integer getRollNumber() {
        return rollNumber;
    }
}
