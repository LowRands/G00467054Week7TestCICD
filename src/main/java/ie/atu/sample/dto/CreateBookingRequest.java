package ie.atu.sample.dto;

public record CreateBookingRequest(
            String name,
            int amount,
            String RoomId
    ){}

