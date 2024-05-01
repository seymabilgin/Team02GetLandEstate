package getlandestate.pojos;

public class RegisterPojo {

    private String registerFirstName;
    private String registerLastName;
    private String registerPhoneNumber;
    private String registerEmail;
    private String registerPassword;

    public String getRegisterFirstName() {
        return registerFirstName;
    }

    public void setRegisterFirstName(String registerFirstName) {
        this.registerFirstName = registerFirstName;
    }

    public String getRegisterLastName() {
        return registerLastName;
    }

    public void setRegisterLastName(String registerLastName) {
        this.registerLastName = registerLastName;
    }

    public String getRegisterPhoneNumber() {
        return registerPhoneNumber;
    }

    public void setRegisterPhoneNumber(String registerPhoneNumber) {
        this.registerPhoneNumber = registerPhoneNumber;
    }

    public String getRegisterEmail() {
        return registerEmail;
    }

    public void setRegisterEmail(String registerEmail) {
        this.registerEmail = registerEmail;
    }

    public String getRegisterPassword() {
        return registerPassword;
    }

    public void setRegisterPassword(String registerPassword) {
        this.registerPassword = registerPassword;
    }

    public RegisterPojo(String registerFirstName, String registerLastName, String registerPhoneNumber, String registerEmail, String registerPassword) {
        this.registerFirstName = registerFirstName;
        this.registerLastName = registerLastName;
        this.registerPhoneNumber = registerPhoneNumber;
        this.registerEmail = registerEmail;
        this.registerPassword = registerPassword;
    }

    @Override
    public String toString() {
        return "RegisterPojo{" +
                "registerFirstName='" + registerFirstName + '\'' +
                ", registerLastName='" + registerLastName + '\'' +
                ", registerPhoneNumber='" + registerPhoneNumber + '\'' +
                ", registerEmail='" + registerEmail + '\'' +
                ", registerPassword='" + registerPassword + '\'' +
                '}';
    }

    public RegisterPojo() {
    }
}
