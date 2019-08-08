package eclectics.co.ke.storedprocedures.repos.storedproceduresdata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class NonZeroAccountNumbers {

    private Long id;
    private String account_name;
    private String account_refrence_number;
    private LocalDateTime create_on;
    private Long ID;
    private Double ACTUAL_BALANCE;
    private Double AVAILABLE_BALANCE;
    private Double UPDATE_ON;
    private Double ACCOUNT_NUMBER;
}
