package fr.zekoyu.avajlauncher.aircraft;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    // default visibility is package private (~ in UML)
    Coordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }
    
}
