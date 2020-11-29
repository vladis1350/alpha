package exapmle.service;

import exapmle.requests.SendBranchRequest;
import exapmle.service.responses.BranchIndexResponse;
import exapmle.service.responses.SetTokenResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@Component
@FeignClient(name = "ALFACRM-PROXY", url = "https://integrator.s20.online/v2api")
public interface CrmProxy {
    @PostMapping("/auth/login")
    public SetTokenResponse authorization(@RequestBody AuthorizationRequest authorizationRequest);

    @PostMapping("/branch/index")
    public BranchIndexResponse sendBranch(@RequestHeader("X-ALFACRM-TOKEN:") String authenticationToken, SendBranchRequest sendBranchRequest);

}
