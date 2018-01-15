package app.resource;

import app.model.request.Request;
import app.model.search.model.LocationResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Repository
public class SearchResource {

    @Value("${search.key}")
    private String searchKey;

    private final String searchUri = "https://maps.googleapis.com/maps/api/place/nearbysearch/json";

    public LocationResponse getLocation(final Request request){
        RestTemplate restTemplate = new RestTemplate();
        UriComponentsBuilder searchUriBuilder = UriComponentsBuilder.fromHttpUrl(searchUri)
                .queryParam("location", request.getLocation())
                .queryParam("radius", request.getRadius())
                .queryParam("type", request.getType())
                .queryParam("keyword", request.getKeyword())
                .queryParam("key", searchKey);
        return restTemplate.getForObject(searchUriBuilder.build().encode().toUri(), LocationResponse.class);
    }
}
