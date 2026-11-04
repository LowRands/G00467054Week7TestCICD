package ie.atu.sample.service;

import ie.atu.sample.dto.CreateBookingRequest;
import ie.atu.sample.model.Booking;
import ie.atu.sample.model.Room;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.repository.RoomRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final RoomRepository roomRepository;

    public BookingService(BookingRepository bookingRepository, RoomRepository roomRepository) {
        this.bookingRepository = bookingRepository;
        this.roomRepository = roomRepository;
    }
    public List<Booking> getALL(){
        return bookingRepository.findAll();
    }
    public List<Booking> getByAmount(BigDecimal amount){
        return bookingRepository.findByAmount(amount);
    }
    public Booking createBooking(CreateBookingRequest request){
        if(request.RoomId() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Room ID required");
        }
        if(request.name() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Booking name required");
        }
        Room room = roomRepository
                .findById(request.RoomId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Room not found"));
        Booking booking = new Booking();
        return bookingRepository.save(booking);
    }
    public List< Booking >getByRoomId(String roomId){
        return roomRepository.findByRoomId(roomId);
    }

}
