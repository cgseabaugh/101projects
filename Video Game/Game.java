public class Game{

    public static void main(String args[]){
        Character solaire = new Character("Solaire", 100, 100);
        Character lucatiel = new Character("Lucatiel", 100, 30);

        //System.out.println(solaire.getName() + "\n" + solaire.getlifePoints() + "\n" + solaire.getattackPoints());
        //System.out.println(lucatiel.getName() + "\n" + lucatiel.getlifePoints() + "\n" + lucatiel.getattackPoints());

        solaire.display();
        lucatiel.display();

        solaire.attack(lucatiel);
        lucatiel.attack(solaire);

        solaire.attack(lucatiel);
        lucatiel.attack(solaire);

        solaire.attack(lucatiel);
        lucatiel.attack(solaire);
    }
}