package exapmle.service.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import exapmle.models.LessonType;
import lombok.Data;

import java.util.List;

@Data
public class LessonTypeResponse {

    @JsonProperty("total")
    private int total;

    @JsonProperty("count")
    private int count;

    @JsonProperty("page")
    private int page;

    @JsonProperty("items")
    private List<LessonType> items;

}
