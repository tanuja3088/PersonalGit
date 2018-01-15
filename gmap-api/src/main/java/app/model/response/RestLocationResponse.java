package app.model.response;

import java.util.List;

public class RestLocationResponse {
    private String name;
    private String vicinity;
    private List<String> type;
    private List<Double> elevations;
    private String iconUrl;
    private Boolean openNow;

    public RestLocationResponse(String name, String vicinity, List<String> type, List<Double> elevations, String iconUrl, Boolean openNow) {
        this.name = name;
        this.vicinity = vicinity;
        this.type = type;
        this.elevations = elevations;
        this.iconUrl = iconUrl;
        this.openNow = openNow;
    }

    public Boolean getOpenNow() {
        return openNow;
    }
    public void setOpenNow(Boolean openNow) {
        this.openNow = openNow;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public List<Double> getElevations() {
        return elevations;
    }

    public void setElevations(List<Double> elevations) {
        this.elevations = elevations;
    }


    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public String toString() {
        return "RestLocationResponse{" +
                "name='" + name + '\'' +
                ", vicinity='" + vicinity + '\'' +
                ", type=" + type +
                ", elevations=" + elevations +
                '}';
    }
}
