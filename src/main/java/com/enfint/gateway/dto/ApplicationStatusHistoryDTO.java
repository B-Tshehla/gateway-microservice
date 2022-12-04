package com.enfint.gateway.dto;


import com.enfint.gateway.util.ChangeType;
import com.enfint.gateway.util.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import java.time.LocalDate;


@Data
@AllArgsConstructor
@Builder
public class ApplicationStatusHistoryDTO {
    private Status status;
    private LocalDate time;
    private ChangeType changeType;
}

