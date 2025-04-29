package abstractclasslearning.abs;

import java.util.Date;

public abstract class Geomatric {

    private boolean filled;
    private String color;
    private Date dateCreated;

    public Geomatric() {

        dateCreated = new Date();
    }

    public Geomatric(boolean filled, String color, Date dateCreated) {
        this.filled = filled;
        this.color = color;
        this.dateCreated = dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
