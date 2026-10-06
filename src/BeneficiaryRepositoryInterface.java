import java.util.ArrayList;

public interface BeneficiaryRepositoryInterface {

    void save(Beneficiary beneficiary);

    ArrayList<Beneficiary> findAll();
}
