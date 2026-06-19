class Sportsman{ 
    String name;
    int age;
    String sport;
    String country;
    String gender;
    Sportsman(String name, int age, String sport, String country, String gender) {
        this.name = name;
        this.age = age;
        this.sport = sport;
        this.country = country;
        this.gender = gender;
    }
    void practice() {
        System.out.println(name + " is practicing " + sport);
    }
    void playMatch() {
        System.out.println(name + " is playing a match.");
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sport: " + sport);
        System.out.println("Country: " + country);
        System.out.println("Gender: " + gender+ " years");
    }
    public static void main(String[] args) {
        Sportsman s1 = new Sportsman("Virat Kohli", 37, "Cricket", "India", "male");
        s1.displayDetails();
        s1.practice();
        s1.playMatch();
    }
}