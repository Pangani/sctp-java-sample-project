public class Beneficiary {
    private String name;
    private String nationalID;
    private String district;
    private int iHouseholdSize;

//    constructor
    Beneficiary(String name, String nationalID, String district, int iHouseholdSize){
        this.name = name;
        this.nationalID = nationalID;
        this.district = district;
        if (iHouseholdSize < 0){
            throw new IllegalArgumentException(
                    "household cannot be less than zero"
            );
        }
        this.iHouseholdSize = iHouseholdSize;
    }

//   getters and setters
    public String getName() {
        return name;
    }
    public String getNationalID(){
        return nationalID;
    }
    public String getDistrict(){
        return district;
    }
    public int getHouseholdSize() {
        return iHouseholdSize;
    }

    public String setName(String name){
        return this.name = name;
    }
    public String setNationalID(String nationalID){
        return this.nationalID = nationalID;
    }
    public String setDistrict(String district) {
        return this.district = district;
    }
    public int setHouseholdSize(int hhsize){
        if (hhsize >= 0) {
            this.iHouseholdSize = hhsize;
        }
        return hhsize;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("National ID: " + nationalID);
        System.out.println("District: " + district);
        System.out.println("Household Size: " + iHouseholdSize);
    }

    boolean belongsToDistrict(String districtName) {
        return district.equalsIgnoreCase(districtName);
    }
}
