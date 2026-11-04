package ie.atu.sample.repository;

import ie.atu.sample.model.Booking;
import ie.atu.sample.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Booking>  findByRoomId(@Param("RoomId")String RoomId);
}
