package com.sunglowsys.domain;

public class Address {

    private Long id ;
    private String addressLine1 ;
    private String addressLine2 ;
    private String addressLine3 ;
    private String state ;
    private String pincode ;

    public Address(){System.out.println("Address object is created");}

    public Address(Long id, String addressLine1, String addressLine2, String addressLine3, String state, String pincode) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.state = state;
        this.pincode = pincode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void checkAddress(){
        System.out.println("AddressId:" + 101);
        System.out.println("AddressLine1:" + "Vill-Nagla Nande");
        System.out.println("AddressLine2:" + "Post-Salempur Pironda");
        System.out.println("AddressLine3:" + "Dist-Kasganj");
        System.out.println("State:" + "Uttar Pradesh");
        System.out.println("Pincode:" + "207401");
    }
}


