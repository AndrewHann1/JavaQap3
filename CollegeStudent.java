class CollegeStudent extends Student {
    private String major;
    private int year;

    public CollegeStudent(String myName, int myAge, String myGender, int myIdNum, double myGPA, int year, String major) {
        super();
        setName(myName);
        setAge(myAge);
        setGender(myGender);
        setIdNum(myIdNum);
        setGPA(myGPA);
        this.year = year;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Major: " + major +
                "\nYear: " + year;
    }
}
