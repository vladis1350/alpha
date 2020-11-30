package exapmle.service.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import exapmle.models.Lesson;
import lombok.Data;

import java.util.List;

@Data
public class LessonIndexResponse {

    @JsonProperty("total")
    private String total;

    @JsonProperty("count")
    private String count;

    @JsonProperty("page")
    private String page;

    @JsonProperty("items")
    private List<Lesson> lessonList;


}
