import java.util.HashSet;
import java.util.Set;

public class Heavenly_body {
    private final String name;
    private final double orbitalPeriod;

    private final Set<Heavenly_body> Satellites;

    public Heavenly_body(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.Satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(Heavenly_body moon)
    {
        return this.Satellites.add(moon);
    }

    public Set<Heavenly_body> getSatellites() {
        return new HashSet<>(this.Satellites);
    }
}
