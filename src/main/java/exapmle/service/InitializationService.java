package exapmle.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitializationService {
    @Autowired
    private CrmService crmService;

    @SneakyThrows
    public void initalize() {
        crmService.getLesson();
    }
}
