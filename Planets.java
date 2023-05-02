public enum Planets {
    MERCURY (1, 0, 6, null),
    VENUS (2, 100, 5, MERCURY),
    EARTH (3, 180, 10, VENUS),
    MARS (4, 260, 9, EARTH),
    JUPITER (5, 1030, 80, MARS),
    SATURN (6, 520, 72, JUPITER),
    URANUS (7, 630, 60, SATURN),
    NEPTUNE (8, 500, 54, URANUS);

    private int distFromSun = 120;
    private final int order;
    private final int distPrevPlanet;
    private final int radius;
    private Planets prevPlanet;

    Planets(int order, int distPrevPlanet, int radius, Planets prevPlanet) {
        this.order = order;
        this.distPrevPlanet = distPrevPlanet;
        this.radius = radius;
        this.prevPlanet = prevPlanet;
        this.distFromSun = prevPlanet != null ? prevPlanet.distFromSun + distPrevPlanet : distFromSun;
    }

    public int getDistFromSun() {
        return distFromSun;
    }
}