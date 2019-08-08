package eclectics.co.ke.storedprocedures.wrapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAccountWrapper {

    private String accountName;
    private String accountRefNo;
}
