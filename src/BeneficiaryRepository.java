import java.util.ArrayList;

public class BeneficiaryRepository
    implements BeneficiaryRepositoryInterface {

        private ArrayList<Beneficiary> beneficiaries = new ArrayList<>();

    //    save a beneficiary
        public void save(Beneficiary beneficiary) {
            beneficiaries.add(beneficiary);
        }

    //    return all beneficiaries
        public ArrayList<Beneficiary> findAll(){
            return beneficiaries;
    }
}
