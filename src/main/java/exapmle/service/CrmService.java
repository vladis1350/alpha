package exapmle.service;

import exapmle.requests.SendBranchRequest;
import exapmle.service.responses.BranchIndexResponse;
import exapmle.service.responses.SetTokenResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CrmService {
    @Autowired
    private CrmProxy crmProxy;

    private String getToken() {
        AuthorizationRequest authorizationRequest = new AuthorizationRequest();

        String email = "zerdonik777@gmail.com";
        authorizationRequest.setEmail(email);
        String apiKey = "71174501-325b-11eb-92ba-ac1f6b4782be";
        authorizationRequest.setApi_key(apiKey);

        SetTokenResponse setTokenResponse = crmProxy.authorization(authorizationRequest);

        if (setTokenResponse.getToken() != null) {
            log.info("Token received: " + setTokenResponse.getToken());
            return setTokenResponse.getToken();
        } else {
            log.info("Token not received: " + setTokenResponse.getCode());
        }
        return null;
    }

    public void getBranch() {
        if (getToken() != null) {
            String token = getToken();
            SendBranchRequest sendBranchRequest = SendBranchRequest.builder()
                    .is_active("1")
                    .page("0")
                    .build();
            BranchIndexResponse branchIndexResponse = crmProxy.sendBranch(token, sendBranchRequest);
            log.info("Branch response: " + branchIndexResponse);

        }
    }
}
