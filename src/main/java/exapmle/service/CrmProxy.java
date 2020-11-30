package exapmle.service;

import exapmle.models.Lesson;
import exapmle.requests.AuthorizationRequest;
import exapmle.requests.LessonIndexRequest;
import exapmle.requests.SendLessonTypeRequest;
import exapmle.service.responses.LessonIndexResponse;
import exapmle.service.responses.LessonTypeResponse;
import exapmle.service.responses.SetTokenResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@Component
@FeignClient(name = "ALFACRM-PROXY", url = "")
public interface CrmProxy {
    @PostMapping("/auth/login")
    public SetTokenResponse authorization(@RequestBody AuthorizationRequest authorizationRequest);

    @PostMapping("/{branch}/lesson-type/index")
    public LessonTypeResponse sendLessonType(@RequestHeader("X-ALFACRM-TOKEN") String authenticationToken,
                                         @PathVariable(name = "branch") String branch,
                                         SendLessonTypeRequest sendLessonTypeRequest);

@PostMapping("/{branch}/lesson/index")
    public LessonIndexResponse sendLesson(@RequestHeader("X-ALFACRM-TOKEN") String authenticationToken,
                                          @PathVariable(name = "branch") String branch,
                                          LessonIndexRequest lessonIndexRequest);

}
