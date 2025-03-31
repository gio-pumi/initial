import java.util.Scanner;

public class Tips {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        String companyAddress = scanner.nextLine();
        String companyPhoneNumber = scanner.nextLine();
        String companyFaxNumber = scanner.nextLine();
        String companyWebSite = scanner.nextLine();
        String managerName = scanner.nextLine();
        String managerLastName = scanner.nextLine();
        int managerAge = Integer.parseInt(scanner.nextLine());
        String managerPhoneNumber = scanner.nextLine();


        System.out.println(companyName);
        System.out.printf("Address: %s \n",companyAddress);
        System.out.printf("Tel. %s \n", companyPhoneNumber);
        System.out.printf("Fax: %s \n", companyFaxNumber);
        System.out.printf("Web Site: %s \n", companyWebSite);
        System.out.printf("Manager: %s %s (age: %s, tel. %s) \n",managerName,managerLastName,managerAge,managerPhoneNumber);
    }
}
