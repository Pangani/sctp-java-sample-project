public class BeneficiaryService {
    private BeneficiaryRepository repository;

    // setter
    public BeneficiaryService(BeneficiaryRepository repository){
        this.repository = repository;
    }

    // register
    public void registerBeneficiary(Beneficiary beneficiary) {
        if (beneficiary.getName() == null || beneficiary.getName().isBlank()){
            throw new IllegalArgumentException(
                    "Beneficiary name is required."
            );
        }
        if (beneficiary.getNationalID() == null || beneficiary.getNationalID().isEmpty()) {
            throw new IllegalArgumentException(
                    "Beneficiary national ID is required"
            );
        }
        // saved the correct beneficiary
        repository.save(beneficiary);
    }

    public Beneficiary findBeneficiaryByNationalId(String national_id){
        for (Beneficiary ben : repository.findAll()) {
            if (ben.getNationalID().equalsIgnoreCase(national_id)) {
                return ben;
            }
        }
        return null;
    }

    public void displayAllBeneficiaries() {
        for (Beneficiary beneficiary : repository.findAll()) {
            beneficiary.displayInformation();
            System.out.println("-----------------------");
        }
    }
}
