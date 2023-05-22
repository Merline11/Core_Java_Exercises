public class PostalAddress {

    private String firstLine;
    private String secondLine;
    private String postCode;

    public PostalAddress(String firstLine,String secondLine,String postCode) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.postCode = postCode;
    }

    public String getDeliveryInfo(){
        return postCode.substring(postCode.length()-3);
        /*int initial = str.length()-3;
        int lastThreeCharacters;
        for(int i=initial; i<str.length(); i++) {
            lastThreeCharacters += str.charAt(i));
        }
        return lastThreeCharacters;*/
    }

    public String getAddress(String postcode){
        if(this.postCode.equals(postcode)) {
            return this.firstLine + " " + this.secondLine + " " + this.postCode;
        } else {
            return "no match";
        }
    }

    public static void main(String[] args) {
        PostalAddress postalAddress = new PostalAddress("Flat 41","Capital point","RG16QJ");
        postalAddress.getDeliveryInfo();
    }
}
