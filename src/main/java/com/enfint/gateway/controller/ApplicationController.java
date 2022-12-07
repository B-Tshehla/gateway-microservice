package com.enfint.gateway.controller;

import com.enfint.gateway.dto.LoanApplicationRequestDTO;
import com.enfint.gateway.dto.LoanOfferDTO;
import com.enfint.gateway.dto.ScoringDataDTO;
import com.enfint.gateway.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping("/")
    public List<LoanOfferDTO> getLoanOffers(@RequestBody LoanApplicationRequestDTO loanApplicationRequest){
        return applicationService.getLoanOffers(loanApplicationRequest);
    }
    @PostMapping("/apply")
    public void selectedOffer(@RequestBody LoanOfferDTO loanOffer){
        applicationService.selectedOffer(loanOffer);
    }

    @PostMapping("/registration/{applicationId}")
    public void calculateCredit(@PathVariable("applicationId") Long applicationId, @RequestBody ScoringDataDTO scoringData){
        applicationService.calculateCredit(applicationId,scoringData);
    }


}
