package model;

public class Location {
    private String locationId;
    private String locationCode;
    private String locationName;
    private String locationType;
    private String parentId;

    public Location(String locationId, String locationCode, String locationName, String locationType, String parentId) {
        this.locationId = locationId;
        this.locationCode = locationCode;
        this.locationName = locationName;
        this.locationType = locationType;
        this.parentId = parentId;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationType() {
        return locationType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
