import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BeneficiaryRepository repository = new BeneficiaryRepository();
        BeneficiaryService service = new BeneficiaryService(repository);

        try {
            Beneficiary beneficiary1 = new Beneficiary(
                    "Roy", "HFGR234", "Zomba", 5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        Beneficiary beneficiary2 = new Beneficiary("Grace Phiri",
                "5556677",
                "Karonga",
                7);


       service.registerBeneficiary(beneficiary1);
       service.registerBeneficiary(beneficiary2);
       Beneficiary beneficiaryByID = service.findBeneficiaryByNationalId("5556677");

       if (beneficiaryByID != null){
           beneficiaryByID.displayInformation();
       } else {
           System.out.println("Beneficiary not found...");
       }


//       service.displayAllBeneficiaries();
    }
}
