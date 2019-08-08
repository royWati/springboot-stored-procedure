package eclectics.co.ke.storedprocedures.Controllers;

import eclectics.co.ke.storedprocedures.entity.AccountNumbers;
import eclectics.co.ke.storedprocedures.repos.storedproceduresdata.NonZeroAccountNumbers;
import eclectics.co.ke.storedprocedures.service.AccountsService;
import eclectics.co.ke.storedprocedures.wrapper.CreateAccountWrapper;
import eclectics.co.ke.storedprocedures.wrapper.InitiateTransactionWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("stored-procedures/accounts")
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @RequestMapping("/create-acount")
    public void createNewAccount(@RequestBody CreateAccountWrapper createAccountWrapper){

        accountsService.createNewAccount(createAccountWrapper.getAccountName(),
                createAccountWrapper.getAccountName());
    }
    @RequestMapping("/non-zero-accounts")
    public List<AccountNumbers> createNewAccount(){
       return accountsService.fetchNonZeroAccounts();
    }
    @RequestMapping("/initiate-transaction")
    public void initiateTransaction(@RequestBody InitiateTransactionWrapper initiateTransactionWrapper){
        accountsService.initiateTransaction(initiateTransactionWrapper.getDebitAccountId(),
                initiateTransactionWrapper.getCreditAccountId(),
                initiateTransactionWrapper.getAmount());
    }
}
