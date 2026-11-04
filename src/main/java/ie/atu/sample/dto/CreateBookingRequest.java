package ie.atu.sample.dto;

import java.math.BigDecimal;

public record CreateBookingRequest(
            String name,
            BigDecimal amount,
            Long roomId
    ){}

