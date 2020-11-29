package exapmle.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendBranchRequest {

    @JsonProperty("id")
    private int id;

    @JsonProperty("is_active")
    private String is_active;

    @JsonProperty("page")
    private String page;

    @JsonProperty("name")
    private String name;

    @JsonProperty("subject_ids")
    private List<Integer> subjectIds;


}
