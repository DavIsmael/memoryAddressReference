public class Address {
    private String city;
    private String zipcode;
    private static String street;
    public Address(String city, String zipcode, String street, String[] personInfo){
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;
        personInfo[2] = this.city;
        personInfo[1] = this.street;
        personInfo[0] = this.zipcode;
    }
}