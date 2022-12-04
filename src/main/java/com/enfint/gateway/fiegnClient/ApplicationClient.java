package com.enfint.gateway.fiegnClient;

import com.enfint.gateway.dto.LoanApplicationRequestDTO;
import com.enfint.gateway.dto.LoanOfferDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@FeignClient(value = "applicationClient",url = "http://localhost:8083/application")
public interface ApplicationClient {
    @PostMapping("/")
     List<LoanOfferDTO> getLoanOffers(@RequestBody LoanApplicationRequestDTO applicationRequest);

    @PutMapping("/offer")
    void selectOffer(@RequestBody LoanOfferDTO loanOffer);
}
