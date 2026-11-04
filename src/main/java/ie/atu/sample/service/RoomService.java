package ie.atu.sample.service;

import ie.atu.sample.model.Room;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository, BookingRepository bookingRepository) {
        this.roomRepository = roomRepository;
    }
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

}
