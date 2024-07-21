package projectonstructors.Model;

public class ConstructoresPoints {
    private String nameConstructors;
    private Float pointsConstructors;

    public ConstructoresPoints(String nameConstructors, Float pointsConstructors) {
        this.nameConstructors = nameConstructors;
        this.pointsConstructors = pointsConstructors;
    }

    public String getNameConstructors() {
        return nameConstructors;
    }

    public void setNameConstructors(String nameConstructors) {
        this.nameConstructors = nameConstructors;
    }

    public float getPointsConstructors() {
        return pointsConstructors;
    }

    public void setPointsConstructors(Float pointsConstructors) {
        this.pointsConstructors = pointsConstructors;
    }

    
    
}
