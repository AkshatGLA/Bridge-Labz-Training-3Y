package Assignment.One.LevelOne;

/*
 * Program 7: Compute the volume of Earth in km^3 and miles^3.
 * Formula: Volume = (4/3) * pi * r^3
 * Radius = 6378 km. 1 mile = 1.6 km
 */
class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.14159;

        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm +
                " and in cubic miles is " + volumeMiles);
    }
}
