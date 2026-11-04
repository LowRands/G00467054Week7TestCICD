package ie.atu.sample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

public class Booking {
    private Long RoomId;
    private String Name;
    private BigDecimal Amount;

    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

}
