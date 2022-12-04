package com.enfint.gateway.controller;

import com.enfint.gateway.dto.ApplicationDTO;
import com.enfint.gateway.dto.ClientDTO;
import com.enfint.gateway.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/application/{applicationId}")
    public ApplicationDTO getApplicationById(@PathVariable("applicationId") Long applicationId){
        return adminService.getApplicationById(applicationId);
    }

    @GetMapping("/client/{firstName}/{lastName}")
    public ClientDTO getClientByFirstNameAndLastName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
     return adminService.getClientByFirstNameAndLastName(firstName, lastName);
    }
}
