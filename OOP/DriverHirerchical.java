//------------------------------------------------------------

public class DriverHirerchical {

    public static void main(String[] args) {

        GPay gpay = new GPay(
                "Google",
                "Sundar Pichai",
                "California",
                "2 Trillion",
                180000,

                "Jack",
                "Sparrow",
                "jack@gmail.com",
                "1234",
                "10-10-2002",
                9876543210L,
                "Male",

                "SBI",
                9876543210L,
                "Jack",
                1234,
                "jack@oksbi"
        );

        System.out.println("--------------- GPAY ----------------");
        System.out.println(gpay.getGoogleInfo());
        System.out.println(gpay.getGmailInfo());
        System.out.println(gpay.getGPayInfo());

        System.out.println();

        GoogleClassRoom classroom = new GoogleClassRoom(
                "Google",
                "Sundar Pichai",
                "California",
                "2 Trillion",
                180000,

                "Jack",
                "Sparrow",
                "jack@gmail.com",
                "1234",
                "10-10-2002",
                9876543210L,
                "Male",

                "Java Batch",
                "Java",
                "ABC Sir",
                "JAVA101",
                "meet.google.com/abc"
        );

        System.out.println("----------- GOOGLE CLASSROOM -----------");
        System.out.println(classroom.getGoogleInfo());
        System.out.println(classroom.getGmailInfo());
        System.out.println(classroom.getClassRoomInfo());

        System.out.println();

        GoogleDrive drive = new GoogleDrive(
                "Google",
                "Sundar Pichai",
                "California",
                "2 Trillion",
                180000,

                "Jack",
                "Sparrow",
                "jack@gmail.com",
                "1234",
                "10-10-2002",
                9876543210L,
                "Male",

                100,
                40,
                250,
                "Premium"
        );

        System.out.println("----------- GOOGLE DRIVE -----------");
        System.out.println(drive.getGoogleInfo());
        System.out.println(drive.getGmailInfo());
        System.out.println(drive.getDriveInfo());
    }
}
class Google {

    String name;
    String ceo;
    String address;
    String netWorth;
    long empStrength;

    public Google(String name, String ceo, String address,
                  String netWorth, long empStrength) {

        this.name = name;
        this.ceo = ceo;
        this.address = address;
        this.netWorth = netWorth;
        this.empStrength = empStrength;
    }

    public String getGoogleInfo() {
        return "Google [name=" + name +
                ", ceo=" + ceo +
                ", address=" + address +
                ", netWorth=" + netWorth +
                ", empStrength=" + empStrength + "]";
    }
}

//------------------------------------------------------------

class Gmail extends Google {

    String fName;
    String lName;
    String email;
    String password;
    String dob;
    long contact;
    String gender;

    public Gmail(String name, String ceo, String address,
                 String netWorth, long empStrength,
                 String fName, String lName,
                 String email, String password,
                 String dob, long contact,
                 String gender) {

        super(name, ceo, address, netWorth, empStrength);

        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.contact = contact;
        this.gender = gender;
    }

    public String getGmailInfo() {
        return "Gmail [fName=" + fName +
                ", lName=" + lName +
                ", email=" + email +
                ", password=" + password +
                ", dob=" + dob +
                ", contact=" + contact +
                ", gender=" + gender + "]";
    }
}

//------------------------------------------------------------

class GoogleClassRoom extends Gmail {

    String className;
    String subject;
    String trainer;
    String classCode;
    String link;

    public GoogleClassRoom(
            String name, String ceo, String address,
            String netWorth, long empStrength,

            String fName, String lName,
            String email, String password,
            String dob, long contact,
            String gender,

            String className,
            String subject,
            String trainer,
            String classCode,
            String link) {

        super(name, ceo, address, netWorth, empStrength,
                fName, lName, email, password,
                dob, contact, gender);

        this.className = className;
        this.subject = subject;
        this.trainer = trainer;
        this.classCode = classCode;
        this.link = link;
    }

    public String getClassRoomInfo() {
        return "GoogleClassRoom [className=" + className +
                ", subject=" + subject +
                ", trainer=" + trainer +
                ", classCode=" + classCode +
                ", link=" + link + "]";
    }
}

//------------------------------------------------------------

class GoogleDrive extends Gmail {

    int storage;
    int usedStorage;
    int files;
    String plan;

    public GoogleDrive(
            String name, String ceo, String address,
            String netWorth, long empStrength,

            String fName, String lName,
            String email, String password,
            String dob, long contact,
            String gender,

            int storage,
            int usedStorage,
            int files,
            String plan) {

        super(name, ceo, address, netWorth, empStrength,
                fName, lName, email, password,
                dob, contact, gender);

        this.storage = storage;
        this.usedStorage = usedStorage;
        this.files = files;
        this.plan = plan;
    }

    public String getDriveInfo() {
        return "GoogleDrive [storage=" + storage +
                "GB, usedStorage=" + usedStorage +
                "GB, files=" + files +
                ", plan=" + plan + "]";
    }
}

//------------------------------------------------------------

class GPay extends Gmail {

    String bankName;
    long phoneNo;
    String userName;
    int pin;
    String upiId;

    public GPay(
            String name, String ceo, String address,
            String netWorth, long empStrength,

            String fName, String lName,
            String email, String password,
            String dob, long contact,
            String gender,

            String bankName,
            long phoneNo,
            String userName,
            int pin,
            String upiId) {

        super(name, ceo, address, netWorth, empStrength,
                fName, lName, email, password,
                dob, contact, gender);

        this.bankName = bankName;
        this.phoneNo = phoneNo;
        this.userName = userName;
        this.pin = pin;
        this.upiId = upiId;
    }

    public String getGPayInfo() {
        return "GPay [bankName=" + bankName +
                ", phoneNo=" + phoneNo +
                ", userName=" + userName +
                ", pin=" + pin +
                ", upiId=" + upiId + "]";
    }
}

