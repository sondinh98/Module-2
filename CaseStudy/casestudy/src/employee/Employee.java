package employee;

public  class Employee {
    private int id;
    private String name;
    private String birthday;
    private String gender;

    public Employee(int id, String name, String birthday, String gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public  double getSalary () {
        return 0;
    };

    @Override
    public String toString() {
        return String.format("%-10s%-20s%-20s%-10s",id,name,birthday,gender);
    }
}
