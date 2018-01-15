package app.resource;

import app.model.elevation.model.ElevationResponse;
import app.model.request.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Repository
public class ElevationResource {

    @Value("${elevation.key}")
    private String elevationKey;

    private final String elevationUri = "https://maps.googleapis.com/maps/api/elevation/json";

    public ElevationResponse getElevation(final Request request){
        RestTemplate restTemplate = new RestTemplate();
        UriComponentsBuilder elevationUriBuilder = UriComponentsBuilder.fromHttpUrl(elevationUri)
                .queryParam("locations", request.getLocation())
                .queryParam("key", elevationKey);
        return restTemplate.getForObject(elevationUriBuilder.build().encode().toUri(), ElevationResponse.class);
    }
}
