public class Phone {
    private long id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String accountNumber;
    private Integer cityCallDuration;
    private Integer intercityCallDuration;

    public Phone(long id, String lastName, String firstName, String patronymic, String accountNumber,
                 Integer cityCallDuration, Integer intercityCallDuration) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.accountNumber = accountNumber;
        this.cityCallDuration = cityCallDuration;
        this.intercityCallDuration = intercityCallDuration;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getCityCallDuration() {
        return cityCallDuration;
    }

    public void setCityCallDuration(Integer cityCallDuration) {
        this.cityCallDuration = cityCallDuration;
    }

    public Integer getIntercityCallDuration() {
        return intercityCallDuration;
    }

    public void setIntercityCallDuration(Integer intercityCallDuration) {
        this.intercityCallDuration = intercityCallDuration;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", cityCallDuration=" + cityCallDuration +
                ", intercityCallDuration=" + intercityCallDuration +
                '}';
    }
}
