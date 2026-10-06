public class Payment {
    private Beneficiary beneficiary;
    private String paymentCycle;
    private double amount;
    private PaymentStatus status;

    //constructor
    public Payment (Beneficiary beneficiary,
                    String paymentCycle,
                    double amount,
                    PaymentStatus status){
        this.beneficiary = beneficiary;
        this.paymentCycle = paymentCycle;
        this.amount = amount;
        this.status = status;
    }

    public boolean isPaid() {
        return status == PaymentStatus.PAID;
    }

    public void displayInformation() {

        System.out.println("Beneficiary: "
                + beneficiary.getName());
        System.out.println("National ID: "
                + beneficiary.getNationalID());
        System.out.println("Payment Cycle: "
                + paymentCycle);
        System.out.println("Amount: "
                + amount);
        System.out.println("Status: "
                + status);
    }
}
