package MODEL;

import java.time.LocalDate;

public class Offer {
    private String offerId;
    private String offerName;
    private double discount;
    private LocalDate startDate;
    private LocalDate endDate;

    public Offer(String offerId, String offerName, double discount, LocalDate startDate, LocalDate endDate) {
        this.offerId = offerId;
        this.offerName = offerName;
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getOfferId() {
        return offerId;
    }

    public String getOfferName() {
        return offerName;
    }

    public double getDiscount() {
        return discount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
