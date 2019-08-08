package eclectics.co.ke.storedprocedures.service;

import eclectics.co.ke.storedprocedures.components.StoredProcedureComponent;
import eclectics.co.ke.storedprocedures.entity.AccountNumbers;
import eclectics.co.ke.storedprocedures.repos.AccountNumberRepository;
import eclectics.co.ke.storedprocedures.repos.storedproceduresdata.NonZeroAccountNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private AccountNumberRepository accountNumberRepository;

    @Autowired
    private StoredProcedureComponent storedProcedureComponent;
    @Override
    public void createNewAccount(String accountName, String accountRefNo) {
        accountNumberRepository.createNewAccount(accountName, accountRefNo);
    }

    @Override
    public List<AccountNumbers> fetchNonZeroAccounts() {
         return storedProcedureComponent.getNonZeros();
    }

    @Override
    public void initiateTransaction(int debitAccount, int creditAccount, double amount) {
         accountNumberRepository.initiateTransaction(debitAccount, creditAccount, amount);
    }
}
