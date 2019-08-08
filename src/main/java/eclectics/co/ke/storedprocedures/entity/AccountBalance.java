package eclectics.co.ke.storedprocedures.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account_balance")
@Entity
public class AccountBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "ACTUAL_BALANCE")
    private double actual_balance;
    @Column(name = "AVAILABLE_BALANCE")
    private double available_balance;
    @Column(name = "UPDATE_ON")
    private LocalDateTime update_on;
    @Column(name = "ACCOUNT_NUMBER")
    private long account_number;
}
