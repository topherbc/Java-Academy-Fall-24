package com.pluralsight;

public class Semitruck extends Vehicle{
    private boolean trailerCapable;

    public boolean isHasTrailer() {
        return trailerCapable;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.trailerCapable = hasTrailer;
    }
}
