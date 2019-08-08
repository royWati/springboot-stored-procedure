package eclectics.co.ke.storedprocedures.entity;

import eclectics.co.ke.storedprocedures.repos.storedproceduresdata.NonZeroAccountNumbers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account_numbers")
@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "createNewAccount",
                procedureName = "createNewAccount",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN,name = "acc_name",
                        type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN,name = "acc_ref_no",
                                type = String.class)
                }
        ),
//        @NamedStoredProcedureQuery(
//                name = "accountsWithoutZeroBalance",
//                procedureName = "accountsWithoutZeroBalance",
//                resultClasses = {NonZeroAccountNumbers.class}
//        ),
        @NamedStoredProcedureQuery(
                name = "initiateTransaction",
                procedureName = "initiateTransaction",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN,name = "DEBIT_ACCOUNT",
                                type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN,name = "CREDIT_ACCOUNT",
                                type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN,name = "AMOUNT",
                                type = Double.class)
                }
        )
})
public class AccountNumbers  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "account_refrence_number")
    private String accountRefrenceNumber;
    @Column(name = "create_on")
    private LocalDateTime createOn;

}
