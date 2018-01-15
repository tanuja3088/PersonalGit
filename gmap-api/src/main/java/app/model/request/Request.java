package app.model.request;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "keyword",
        "type",
        "radius",
        "location"
})
public class Request {

    @JsonProperty("keyword")
    private String keyword;
    @JsonProperty("type")
    private String type;
    @JsonProperty("radius")
    private String radius;
    @JsonProperty("location")
    private String location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyword")
    public String getKeyword() {
        return keyword;
    }

    @JsonProperty("keyword")
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("radius")
    public String getRadius() {
        return radius;
    }

    @JsonProperty("radius")
    public void setRadius(String radius) {
        this.radius = radius;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Request{" +
                "keyword='" + keyword + '\'' +
                ", type='" + type + '\'' +
                ", radius='" + radius + '\'' +
                ", location='" + location + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
