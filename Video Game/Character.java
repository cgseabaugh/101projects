public class Character {

    private String name;
    private int healthPoints;
    private int lives;
    private int attackPoints;

    // constructor
    public Character(String name, int healthPoints, int attackPoints){
        this.name=name;
        this.healthPoints=healthPoints;
        this.attackPoints=attackPoints;
        this.lives=3;

    }

    // getters
    public String getName(){
        return this.name;
    }
    public int gethealthPoints(){
        return this.healthPoints;
    }
    public int getattackPoints(){
        return this.attackPoints;
    }

    // methods

    public void display(){
        System.out.println("___________________________________");
        System.out.println("Name: " + this.name);
        System.out.println("Health Points: " + this.healthPoints);
        System.out.println("Attack Points: " + this.attackPoints);
        System.out.println("Lives: " + this.lives);
    }

    public void attack(Character opponent){

            System.out.println("___________________________________");
            System.out.println(this.name + " is attacking ..." + opponent.name);

            int newHP = opponent.healthPoints-this.attackPoints;

            opponent.healthPoints=newHP;

            opponent.display();

            if(opponent.healthPoints <= 0){
                opponent.lives=opponent.lives-1;
                opponent.healthPoints=100;
                opponent.display();
            }

            if(opponent.lives <= 0){
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("@@ G A M E O V E R  @@");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
            }


    }
}