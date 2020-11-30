package exapmle.controller;

import exapmle.service.WebhookService;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WebhookController {
    @Autowired
    private WebhookService webhookService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void onUpdateReceived(@RequestBody String update) {
        Object obj = new JSONObject(update);
        log.info(update);
        log.info(obj+"");
    }
}
