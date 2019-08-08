package eclectics.co.ke.storedprocedures.wrapper;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InitiateTransactionWrapper {
    private int debitAccountId;
    private int creditAccountId;
    private double amount;
}
