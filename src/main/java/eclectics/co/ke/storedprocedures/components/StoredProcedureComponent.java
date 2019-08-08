package eclectics.co.ke.storedprocedures.components;

import eclectics.co.ke.storedprocedures.entity.AccountBalance;
import eclectics.co.ke.storedprocedures.entity.AccountNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class StoredProcedureComponent {

    @Autowired
    private EntityManager entityManager;

    public List getNonZeros(){
        StoredProcedureQuery fetchList = entityManager.createStoredProcedureQuery
                ("accountsWithoutZeroBalance", AccountNumbers.class, AccountBalance.class);
        fetchList.execute();
        return fetchList.getResultList();
    }
}
