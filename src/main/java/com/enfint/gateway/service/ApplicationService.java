package com.enfint.gateway.service;

import com.enfint.gateway.dto.LoanApplicationRequestDTO;
import com.enfint.gateway.dto.LoanOfferDTO;
import com.enfint.gateway.dto.ScoringDataDTO;
import com.enfint.gateway.fiegnClient.ApplicationClient;
import com.enfint.gateway.fiegnClient.DealClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationService {

    private final ApplicationClient applicationClient;
    private final DealClient dealClient;

    public List<LoanOfferDTO> getLoanOffers (LoanApplicationRequestDTO loanApplicationRequest){
        return applicationClient.getLoanOffers(loanApplicationRequest);
    }

    public void selectedOffer(LoanOfferDTO loanOffer){
        applicationClient.selectOffer(loanOffer);
    }

    public void calculateCredit(Long applicationId, ScoringDataDTO scoringData){
        dealClient.updateCredit(applicationId, scoringData);
    }



}
