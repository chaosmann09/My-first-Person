public class Person {

    String name;
    int svnr;
    int alter;

    public Person(String name, int svnr, int alter) {
        this.name = name;
        this.svnr = svnr;
        this.alter = alter;
    }

    public void getBirthdayYear() {
        System.out.println("Die Person " + name + " ist im Jahr " + (2024 - alter) + " geboren!");
    }
}
