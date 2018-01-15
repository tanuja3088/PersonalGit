package app.service;

import app.model.request.Request;
import app.model.response.RestLocationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.resource.ElevationResource;
import app.resource.SearchResource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GmapService {

    @Autowired
    ElevationResource elevationResource;

    @Autowired
    SearchResource searchResource;

    public List<RestLocationResponse> getNearByResult(Request request){
        List<RestLocationResponse> restLocationResponseList = new ArrayList<>();
        List<Double> elevations = elevationResource.getElevation(request).getResults().stream().map(elevation -> elevation.getElevation()).collect(Collectors.toList());
        searchResource.getLocation(request).getResults().stream().forEach(result -> {
            System.out.println(result);
            String icon = result.getIcon() == null ? "":result.getIcon();
            restLocationResponseList.add(new RestLocationResponse(result.getName(), result.getVicinity(),result.getTypes(),elevations, icon, new Boolean(true)));
        });
        restLocationResponseList.stream().forEach(result -> {
            System.out.println(result);
        });
        return restLocationResponseList;
    }
}
