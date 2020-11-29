package exapmle.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {

    @JsonProperty("id")
    private String id;

    @JsonProperty("is_active")
    private String is_active;

    @JsonProperty("branch_id")
    private String branch_id;

    @JsonProperty("name")
    private String name;
}
