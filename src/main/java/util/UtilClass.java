package util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UtilClass {
    private static final int GRADES = 360;
    private static final double CONSTANT_AREA = 2.0;
    private static final  String ALGORITHM = "AES";

    private UtilClass(){}

    private static double calculatePolygonArea(Coordinate []coordinates) {
        double area = 0;
        // Calculate value of shoelace formula
        int j = coordinates.length - 1;
        for (int i = 0; i < coordinates.length; i++) {
            area += (coordinates[j].getCoordinatX() + coordinates[i].getCoordinatX()) *
                    (coordinates[j].getCoordinateY() - coordinates[i].getCoordinateY());
            // j is previous vertex to i
            j = i;
        }

        return Math.abs(area / CONSTANT_AREA);
    }

    public static double getPolygonArea(Integer []listPoints) {
        Coordinate []coordinates = new Coordinate[listPoints.length];
        double interval =  (double)GRADES / listPoints.length;
        double angle  = interval;

        for (int j = 0; j < listPoints.length; j++) {
            double x = listPoints[j] * Math.cos(Math.toRadians(angle));
            double y = format(listPoints[j] * Math.sin(Math.toRadians(angle)));
            Coordinate coordinate = new Coordinate(x,y);
            coordinates[j] = coordinate;
            angle = angle + interval;
        }

        return calculatePolygonArea(coordinates);
    }

    private static double format(double value) {
        return (double) Math.round(value * 1000000) / 1000000; //you can change this to round up the value(for two position use 100...)
    }


    public static void removeRepeatClasses(List<String> listClassesRepeat){
        Set<String> hs = new HashSet<String>();
        hs.addAll(listClassesRepeat);
        listClassesRepeat.clear();
        listClassesRepeat.addAll(hs);
    }

    public static String[] cutString(String value) {
        return value.split("#");
    }
}
