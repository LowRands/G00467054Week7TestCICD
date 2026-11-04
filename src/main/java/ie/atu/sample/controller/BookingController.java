package ie.atu.sample.controller;

import ie.atu.sample.dto.CreateBookingRequest;
import ie.atu.sample.model.Booking;
import ie.atu.sample.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseStatus(HttpStatus.CREATED)
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    @PostMapping
    public Booking createBooking(@RequestBody CreateBookingRequest request){
        return bookingService.createBooking(request);
    }
    @GetMapping("/{Id}")
    public Booking getBooking(@PathVariable String RoomId){
        return (Booking) bookingService.getByRoomId(RoomId);
    }
    @GetMapping("/max-capacity")
    public List<Booking> getAmount(@RequestParam("Amount") int amount){
        return bookingService.getByAmount(amount);
    }
}
