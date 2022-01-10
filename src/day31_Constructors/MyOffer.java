package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("DC","Cydeo","SDET",85000,true,false,true,true);

        Offer offer2 = new Offer();
        offer2.setInfo("MD","Sunset","Lifeguard",40000,false,true,true,false);

        Offer offer3 = new Offer();
        offer3.setInfo("VA","MSPOOLS","Tech",65000,true,true,false,false);

        Offer offer4 = new Offer();
        offer4.setInfo("VA","IBM","SDET",150000,true,true,true,true);

        Offer offer5 = new Offer();
        offer5.setInfo("NC","IBM","SDET",900000,true,false,true,true);

        Offer offer6 = new Offer();

        offer6.setInfo("NC","IBM","SDET",900000,true,false,true,true);

        Offer offer7 = new Offer();

        offer7.setInfo("NC","IBM","SDET",900000,true,false,true,true);


        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();

        fullTimeOffers.addAll(Arrays.asList(myOffers));


        fullTimeOffers.removeIf(p -> !p.isFullTime);

        ArrayList<Offer> localOffers = new ArrayList<>();

        localOffers.addAll(Arrays.asList(myOffers));

        //2.4.1 Write a program that can remove all the offers that are not from local

        localOffers.removeIf(p -> !p.location.equals("VA"));

        ArrayList<Offer> offersWithBenefits = new ArrayList<>();

        offersWithBenefits.addAll(Arrays.asList(myOffers));

        offersWithBenefits.removeIf(p -> !p.hasBenefit  && !p.hasPTO  ); // could be OR??

        ArrayList<Offer> sdetOffers = new ArrayList<>();

        sdetOffers.removeIf(p -> !p.jobTitle.equalsIgnoreCase("SDET"));

        ArrayList<Offer> offersWith100K = new ArrayList<>();

        offersWith100K.removeIf(p -> !(p.salary >= 100000));














    }
}

/*
2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that are not for SDET
            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */
