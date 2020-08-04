package Model;

import androidx.annotation.NonNull;

public class Viewport {
    private Southwest southwest;
    private Northeast northeast;
    public Southwest getSouthwest(){
        return southwest;
    }
    public void setSouthwest(Southwest southwest) {
        this.southwest = southwest;
    }
    public Northeast getNortheast(){
        return northeast;
    }
    public void setNorthwest(Northeast northeast) {
        this.northeast = northeast;
    }

    @NonNull
    @Override
    public String toString() {
        return "ClassPojo [ southwest = "+southwest+", northeast ="+northeast+"]" ;
    }
}
