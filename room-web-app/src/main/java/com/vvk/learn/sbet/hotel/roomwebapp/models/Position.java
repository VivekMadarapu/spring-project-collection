package com.vvk.learn.sbet.hotel.roomwebapp.models;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString() {
        return switch (this) {
            case CONCIERGE -> "Concierge";
            case HOUSEKEEPING -> "Housekeeping";
            case FRONT_DESK -> "Front Desk";
            case SECURITY -> "Security";
        };
    }

}
