package CONTROLLER;

import MODEL.Offer;
import VIEW.OfferView;

public class OfferController {
    private Offer offer;
    private OfferView offerView;

    // Constructor
    public OfferController(Offer offer, OfferView offerView) {
        this.offer = offer;
        this.offerView = offerView;
    }

    
    public void showOfferDetails() {
        offerView.displayOfferDetails(offer);
    }

    
    public void applyDiscount() {
     
    }

    
    public void updateDiscountRate(double newDiscountRate) {
    
    }

   
    public void updateOfferDuration(int newDurationDays) {

    }
}
