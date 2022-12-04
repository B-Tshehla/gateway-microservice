package com.enfint.gateway.controller;

import com.enfint.gateway.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document/{applicationId}")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;

    @PostMapping("/")
    public void createDocuments(@PathVariable("applicationId") Long applicationId){
        documentService.createDocuments(applicationId);
    }

    @PostMapping("/sign")
    public void signDocuments(@PathVariable("applicationId") Long applicationId){
        documentService.signDocuments(applicationId);
    }

    @PostMapping("/sign/code")
    public void verifySesCode(@PathVariable("applicationId") Long applicationId, @RequestBody int sesCode){
        documentService.verifySesCode(applicationId,sesCode);
    }


}
