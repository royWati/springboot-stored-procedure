package eclectics.co.ke.storedprocedures.service;

import eclectics.co.ke.storedprocedures.entity.AccountNumbers;
import eclectics.co.ke.storedprocedures.repos.storedproceduresdata.NonZeroAccountNumbers;

import java.util.List;

public interface AccountsService {

    void createNewAccount(String accountName,String accountRefNo);
    List<AccountNumbers> fetchNonZeroAccounts();
    void initiateTransaction(int debitAccount,int creditAccount,double amount);
}
