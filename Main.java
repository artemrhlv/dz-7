public class Main {

    public static void main (String[] args) {
        Planets planets = Planets.valueOf("EARTH");
        System.out.println(planets.getDistFromSun());
    }

}