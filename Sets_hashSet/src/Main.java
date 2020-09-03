import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, Heavenly_body> SolarSystem = new HashMap<>();
    private static Set<Heavenly_body> planets = new HashSet<>();
    public static void main(String[] args) {

        Heavenly_body temp = new Heavenly_body("Mercury", 80);
        SolarSystem.put(temp.getName(), temp);
        planets.add(temp);

         temp = new Heavenly_body("venus", 225);
        SolarSystem.put(temp.getName(), temp);
        planets.add(temp);


        temp = new Heavenly_body("Earth", 365);
        SolarSystem.put(temp.getName(), temp);
        planets.add(temp);


        Heavenly_body tempMoon = new Heavenly_body("Moon", 27);
        SolarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
//        System.out.println(SolarSystem);
        temp = new Heavenly_body("Mars", 687);
        SolarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Heavenly_body("Deimos", 1.3);
        SolarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new Heavenly_body("Phobos", 0.3);
        SolarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new Heavenly_body("Jupiter", 4332);
        SolarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Heavenly_body("Io", 1.8);
        SolarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Heavenly_body("Europa", 3.5);
        SolarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Heavenly_body("Ganymede", 7.1);
        SolarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Heavenly_body("Callisto", 16.7);
        SolarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new Heavenly_body("Saturn", 10759);
        SolarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Heavenly_body("Uranus", 30660);
        SolarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Heavenly_body("Neptune", 165);
        SolarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Heavenly_body("Pluto", 248);
        SolarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(Heavenly_body planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        Heavenly_body body = SolarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for(Heavenly_body jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<Heavenly_body> moons = new HashSet<>();
        for(Heavenly_body planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(Heavenly_body moon : moons) {
            System.out.println("\t" + moon.getName());
        }


    }
}
