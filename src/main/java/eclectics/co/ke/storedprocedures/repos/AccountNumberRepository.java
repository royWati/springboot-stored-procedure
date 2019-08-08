package eclectics.co.ke.storedprocedures.repos;

import eclectics.co.ke.storedprocedures.entity.AccountNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface AccountNumberRepository extends JpaRepository<AccountNumbers,Long> {

    @Procedure
    void createNewAccount(String accountName,String accountRefno);

    @Procedure
    void initiateTransaction(int debitAccount,int creditAccount,double amount);

}
