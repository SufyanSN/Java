import java.util.List;

public interface PackageDao {
    public void calculateCost(Package p);
    public List<Package> searchPackage(int price);
}
