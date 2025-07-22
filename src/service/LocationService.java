package service;

import model.Location;
import java.util.*;

public class LocationService {
    private HashMap<String, Location> locations = new HashMap<>();

    public void createLocation(Location location) {
        locations.put(location.getLocationId(), location);
    }

    public String getProvinceByVillageId(String villageId) {
        Location location = locations.get(villageId);

        while (location != null && !location.getLocationType().equalsIgnoreCase("PROVINCE")) {
            location = locations.get(location.getParentId());
        }

        return (location != null) ? location.getLocationName() : null;
    }

    public Location getLocationById(String id) {
        return locations.get(id);
    }

    public void clearLocations() {
        locations.clear();
    }
}
