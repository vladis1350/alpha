package exapmle.service.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class BranchIndexResponse {

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
