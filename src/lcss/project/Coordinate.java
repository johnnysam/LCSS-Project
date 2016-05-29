/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lcss.project;

/**
 *
 * @author Devag
 */
public class Coordinate {
    
    private float Latitude;
    private float Longitude;

    public Coordinate(float Latitude, float Longitude) {
        this.Latitude = Latitude;
        this.Longitude = Longitude;
    }

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float Latitude) {
        this.Latitude = Latitude;
    }

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float Longitude) {
        this.Longitude = Longitude;
    }
    
}
