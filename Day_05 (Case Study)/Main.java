import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String package_id,source_place,destination_place;
        int no_of_days,package_cost;
        int ch;

        PackageDao dao = new PackageDaoImpl();

        List<Package> list = new ArrayList<>();

        while (true){
            System.out.println("OPTIONS");
            System.out.println(" 1. Add a trip package \n 2. Search for a trip package \n 3. Exit");
            System.out.print("Enter choice :");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter package_id(Length=7),source_place,destination_place,no_of_days :");
                    package_id = scanner.next();
                    source_place = scanner.next();
                    destination_place = scanner.next();
                    no_of_days = scanner.nextInt();

                    try {
                        if (package_id.length() == 7){
                            Package package_ = new Package();
                            package_.setPackage_id(package_id);
                            package_.setSource_place(source_place);
                            package_.setDestination_place(destination_place);
                            package_.setNo_of_days(no_of_days);

                            try {
                                dao.calculateCost(package_);
                            }catch (Exception e){
                                System.out.println(e.getStackTrace());
                            }
                        }
                        else {
                            throw new InvalidPackageIdException("InvalidPackageIdException");
                        }
                    }catch (InvalidPackageIdException e){
                        System.out.println(e);
                        InvalidPackageIdException.printMessage();
                    }
                    break;

                case 2:
                    System.out.print("Enter Price limit to search:");
                    int price = scanner.nextInt();
                    try {
                        list = dao.searchPackage(price);

                        list.forEach(p -> System.out.println(p));

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println(e.getStackTrace());
                    }
                    System.out.println("--------------------------------------------------------------------------------------------------------------");
                    break;

                case 3:
                    System.exit(1);
            }
            System.out.println("\n");
        }

    }
}

class InvalidPackageIdException extends Exception{
    public InvalidPackageIdException(String message) {
        super(message);
    }

    public static void printMessage(){
        System.out.println("(Message : Invalid Package Id)");
    }

    @Override
    public String toString() {
        return "InvalidPackageIdException";
    }
}
