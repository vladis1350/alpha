package exapmle.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("branch_ids")
    private List<Integer> branchIds;

    @JsonProperty("teacher_ids")
    private List<Integer> teacherIds;

    @JsonProperty("is_study")
    private boolean isStudy;

    @JsonProperty("study_status_id")
    private int studyStatusId;

    @JsonProperty("lead_status_id")
    private int leadStatusId;

    @JsonProperty("lead_source_id")
    private int leadSourceId;

    @JsonProperty("assigned_id")
    private int assignedId;

    @JsonProperty("legal_type")
    private int legalType;

    @JsonProperty("legal_name")
    private String legalName;

    @JsonProperty("company_id")
    private int companyId;

    @JsonProperty("dob")
    private String dob;


}
