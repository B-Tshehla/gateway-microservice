package com.enfint.gateway.fiegnClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "documentClient", url = "http://localhost:8082/deal/document")
public interface DocumentClient {
    @PostMapping("/{applicationId}/send")
    void sendDocuments(@PathVariable("applicationId") Long applicationId);

    @PostMapping("/{applicationId}/sign")
    void signDocuments(@PathVariable("applicationId") Long applicationId);

    @PostMapping("/{applicationId}/code")
    public void documentsCode(@PathVariable("applicationId") Long applicationId,@RequestBody Integer sesCode);
}
