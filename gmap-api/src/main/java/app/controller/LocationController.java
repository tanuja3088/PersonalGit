package app.controller;

import app.model.request.Request;
import app.model.response.RestLocationResponse;
import app.service.GmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    GmapService gmapService;

    /*private final String location="-33.8670522,151.1957362";
    private final String radius = "500";
    private final String type = "restaurant";
    private final String keyword = "cruise";*/

    @RequestMapping(value = "/nearby", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<RestLocationResponse> greeting(@RequestBody final Request request) {
        return gmapService.getNearByResult(request);
    }
}