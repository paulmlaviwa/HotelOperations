package com.pluralsight;

public class Reservation {
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        if (roomType.equals("king")) {
            pricePerNight = 139.0;
        } else if (roomType.equals("double")) {
            pricePerNight = 124.0;
        }

        if (isWeekend) {
            pricePerNight *= 1.10; // 10% increase for weekends
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return pricePerNight * numberOfNights;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        return getPrice();
    }
}

