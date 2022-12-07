package com.enfint.gateway.service;

import com.enfint.gateway.dto.ApplicationDTO;
import com.enfint.gateway.dto.ClientDTO;
import com.enfint.gateway.fiegnClient.AdminClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminClient adminClient;
    public ApplicationDTO getApplicationById(Long applicationId){
        return adminClient.getApplicationById(applicationId);
    }

    public ClientDTO getClientByFirstNameAndLastName(String firstName, String lastName){
        return adminClient.getClientByFistNameAndLastName(firstName, lastName);
    }
}
