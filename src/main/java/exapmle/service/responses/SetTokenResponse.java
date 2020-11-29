package exapmle.service.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import exapmle.service.Status;
import lombok.Data;

@Data
public class SetTokenResponse {
    @JsonProperty("status")
    private Status status;

    @JsonProperty("message")
    private String message;

    @JsonProperty("token")
    private String token;

    @JsonProperty("name")
    private String name;

    @JsonProperty("code")
    private int code;

    @JsonProperty("type")
    private int type;
}
