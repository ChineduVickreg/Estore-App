package smallStore;

public class BillingInformation {
    private Address deliveryAddress;
    private CreditCardInformation creditCardInformation;
    private String receiverName;
    private String getReceiverNumber;

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getGetReceiverNumber() {
        return getReceiverNumber;
    }

    public void setGetReceiverNumber(String getReceiverNumber) {
        this.getReceiverNumber = getReceiverNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BillingInformation{");
        sb.append("deliveryAddress=").append(deliveryAddress);
        sb.append(", creditCardInformation=").append(creditCardInformation);
        sb.append(", receiverName='").append(receiverName).append('\'');
        sb.append(", getReceiverNumber='").append(getReceiverNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
