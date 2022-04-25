package Inheritance;
//write a program in java to create a Player class. Inherit the classes Cricket_player,
// Football_player and HockeyPlayer

// Player class
class Player{
    String name;
    int age;
    int jersyNumber;

    Player(String name, int age, int jersy){
        this.name = name;
        this.age = age;
        this.jersyNumber = jersy;
    }

    void show(){
        System.out.println("Player name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("Jersy Number: " + jersyNumber);
    }
}

// CricketPlayer
class CricketPlayer extends Player{
    int runs;
    int centuries;

    CricketPlayer(String name, int age, int jersy, int runs, int centuries){
        super(name, age, jersy);
        this.runs = runs;
        this.centuries = centuries;
    }

    public void show(){
        super.show();
        System.out.println("Runs: " + runs);
        System.out.println("Centuries: " + centuries);
    }
}

// FootballPlayer
class FootballPlayer extends Player{
    int goals;

    FootballPlayer(String name, int age, int jersy, int goals){
        super(name, age, jersy);
        this.goals = goals;
    }

    public void show(){
        super.show();
        System.out.println("Goals: "+ goals);
    }
}

// HockeyPlayer
class HockeyPlayer extends Player{
    int matchesPlayed;
    int goals;

    HockeyPlayer(String name, int age, int jersy, int matches, int goals){
        super(name, age, jersy);
        this.matchesPlayed = matches;
        this.goals = goals;
    }

    public void show(){
        super.show();
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Total goals: "+ goals);
    }
}

public class Test {
    public static void main(String[] args) {
        CricketPlayer cp = new CricketPlayer("Virat Kohli", 32, 18, 14000, 71);
        cp.show();
        System.out.println();

        FootballPlayer fp = new FootballPlayer("Sunil Chhetri", 36, 20, 65);
        fp.show();
        System.out.println();

        HockeyPlayer hp = new HockeyPlayer("Manpreet Singh", 35, 24, 50,60);
        hp.show();
    }
}
