package com.bot.interfaces.entity;

public class Automobile implements Auto{
    int maxNumberPeople;
    int massAuto;
    int speedAuto;
    public Automobile(int maxNumberPeople,int massAuto,int speedAuto){
        this.maxNumberPeople = maxNumberPeople;
        this.massAuto = massAuto;
        this.speedAuto = speedAuto;
    }

    @Override
    public int timeDistance(int numberPeople, int distance) {
        int number = numberPeople;
        int time = 0;
        boolean run = true;
        while (run){
            if(number<=maxNumberPeople){
                run=false;
                time=time+distance/speedAuto;
            }else{
                time=time+2*distance/speedAuto;
                number=number-maxNumberPeople;
            }
        }
        return time;
    }

    @Override
    public String infoMass() {
        return null;
    }
}
