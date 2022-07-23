public class Package {
    private String package_id;
    private String source_place;
    private String destination_place;
    private int no_of_days;
    private int package_cost;
    public String getPackage_id() {
        return package_id;
    }

    public void setPackage_id(String package_id) {
        this.package_id = package_id;
    }

    public String getSource_place() {
        return source_place;
    }

    public void setSource_place(String source_place) {
        this.source_place = source_place;
    }

    public String getDestination_place() {
        return destination_place;
    }

    public void setDestination_place(String destination_place) {
        this.destination_place = destination_place;
    }

    public int getNo_of_days() {
        return no_of_days;
    }

    public void setNo_of_days(int no_of_days) {
        this.no_of_days = no_of_days;
    }

    public int getPackage_cost() {
        return package_cost;
    }
    public void setPackage_cost(int package_cost) {
        this.package_cost = package_cost;
    }

    @Override
    public String toString(){
        return ("package_id :" + this.getPackage_id()
                +", source_place : " + this.getSource_place()
                +", destination_place :" + this.getDestination_place()
                +", no_of_days :" + this.getNo_of_days()
                +", package_cost :" + this.getPackage_cost() + "\n");
    }
}
