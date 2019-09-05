public class Contacts {

    private String firstName;
    private String lastName;
//    array of up to 3 mobile numbers
//    private long mobileNumber[] = new long[3];
    private long mobilePrimary;
    private long mobileSecondary;
    private String countryCode;

    public Contacts() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMobilePrimary() {
        return mobilePrimary;
    }

    public void setMobilePrimary(long mobilePrimary) {
        this.mobilePrimary = mobilePrimary;
    }

    public long getMobileSecondary() {
        return mobileSecondary;
    }

    public void setMobileSecondary(long mobileSecondary) {
        this.mobileSecondary = mobileSecondary;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Contacts(String firstName, String lastName, long mobilePrimary, long mobileSecondary, String countryCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilePrimary = mobilePrimary;
        this.mobileSecondary = mobileSecondary;
        this.countryCode = countryCode;

    }
    // object creation

    // updating data


}
