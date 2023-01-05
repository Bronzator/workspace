package Ch8Classes;

public class Address {
    //fields
    private int bldgNum,zipcode;
    private String streetname, unitNum, city, state;
    //constructors


        //apartment
    private Address(int bldgNum,String streetname, String unitNum, String city, String state, int zipcode){
        this.bldgNum = bldgNum;
        this. streetname = streetname;
        this.unitNum = unitNum;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    //house
    Address(int bldgNum, String streetname, String city, String state, int zipcode){
        this(bldgNum,streetname,null,city,state,zipcode);
    }

    //getters

    public int getBldgNum() {
        return bldgNum;
    }

    public void setBldgNum(int bldgNum) {
        this.bldgNum = bldgNum;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    //toString

    @Override
    public String toString() {
        if (unitNum != null) {
            return " " + bldgNum +
                    " " + streetname +
                    " " + unitNum + '\n' +
                    city  +
                    " " + state +
                    " " + zipcode;
        }
        else{
            return " " + bldgNum +
                    " " + streetname + '\n' +
                     city  +
                    " " + state +
                    " " + zipcode;
        }
    }
}
