package com.enfint.gateway.fiegnClient;

import com.enfint.gateway.dto.ScoringDataDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "dealClient", url = "http://localhost:8082/deal")
public interface DealClient {

    @PutMapping("calculate/{applicationId}")
    void updateCredit(@PathVariable("applicationId") Long applicationId, @RequestBody ScoringDataDTO scoringData);
}
