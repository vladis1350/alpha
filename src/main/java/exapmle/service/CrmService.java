package exapmle.service;

import exapmle.models.Lesson;
import exapmle.requests.AuthorizationRequest;
import exapmle.requests.LessonIndexRequest;
import exapmle.requests.SendLessonTypeRequest;
import exapmle.service.responses.LessonIndexResponse;
import exapmle.service.responses.LessonTypeResponse;
import exapmle.service.responses.SetTokenResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CrmService {
    @Autowired
    private CrmProxy crmProxy;

    private String token;

    private void initialToken() {
        AuthorizationRequest authorizationRequest = new AuthorizationRequest();

        String email = "";
        authorizationRequest.setEmail(email);
        String apiKey = "";
        authorizationRequest.setApi_key(apiKey);

        SetTokenResponse setTokenResponse = crmProxy.authorization(authorizationRequest);

        if (setTokenResponse.getToken() != null) {
            log.info("Token received: " + setTokenResponse.getToken());
            token = setTokenResponse.getToken();
        } else {
            log.info("Token not received: " + setTokenResponse.getCode());
        }
    }

    public void getLessonType() {
        initialToken();
        if (token != null) {
            SendLessonTypeRequest sendLessonTypeRequest = SendLessonTypeRequest.builder()
                    .group_id("1")
                    .build();
            LessonTypeResponse str = crmProxy.sendLessonType(token, "1", sendLessonTypeRequest);
            log.info("LessonType response: " + str);
        }
    }

    public void getLesson() {
        initialToken();
        if (token != null) {
            LessonIndexRequest lesson = LessonIndexRequest.builder()
                    .page("0")
                    .date_from("30.11.2020")
                    .date_to("10.12.2020")
                    .status("1").build();
            LessonIndexResponse lessonIndexResponse = crmProxy.sendLesson(token, "1", lesson);
            log.info("Lesson response: " + lessonIndexResponse);

        }
    }
}
