package com.enfint.gateway.fiegnClient;

import com.enfint.gateway.dto.ApplicationDTO;
import com.enfint.gateway.dto.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "adminClient",url = "http://localhost:8082/deal/admin")
public interface AdminClient {

    @GetMapping("/application/{applicationId}")
    ApplicationDTO getApplicationById(@PathVariable("applicationId") Long applicationId);

    @GetMapping("/client/{firstName}/{lastName}")
    ClientDTO getClientByFistNameAndLastName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName);
}
