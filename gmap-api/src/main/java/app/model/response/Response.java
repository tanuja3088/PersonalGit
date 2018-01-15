package app.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    List<RestLocationResponse> restLocationResponseList;

    public List<RestLocationResponse> getRestLocationResponseList() {
        return restLocationResponseList;
    }

    public void setRestLocationResponseList(List<RestLocationResponse> restLocationResponseList) {
        this.restLocationResponseList = restLocationResponseList;
    }
}
