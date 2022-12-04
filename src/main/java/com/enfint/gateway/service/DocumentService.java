package com.enfint.gateway.service;

import com.enfint.gateway.fiegnClient.DocumentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentClient documentClient;

    public void createDocuments(Long applicationId){
        documentClient.sendDocuments(applicationId);
    }

    public void signDocuments(Long applicationId){
        documentClient.signDocuments(applicationId);
    }

    public void verifySesCode(Long applicationId, int sesCode){
        documentClient.documentsCode(applicationId,sesCode);
    }

}
