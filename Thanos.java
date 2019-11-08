import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	ArrayList<Hero> heroList = new ArrayList<>();
    	
        // TODO 2 : Add those heroes to the list    	
    	Hero blackWidow     = new Hero("Black Widow", 34);
    	heroList.add(blackWidow);
    	
    	Hero captainAmerica = new Hero("Captain America", 100);
    	heroList.add(captainAmerica);
    	    	
    	Hero vision         = new Hero("Vision", 3);
    	heroList.add(vision );
    	    	
    	Hero ironMan        = new Hero("Iron Man", 48);
    	heroList.add(ironMan);
    	      	
    	Hero scarletWitch   = new Hero("Scarlet Witch", 29);
    	heroList.add(scarletWitch);
    	      	
    	Hero thor           = new Hero("Thor", 1500);
    	heroList.add(thor);
    	      	
    	Hero spiderMan      = new Hero("Spider-Man", 18);
    	heroList.add(spiderMan);
    	     	
    	Hero hulk           = new Hero("Hulk", 49);
    	heroList.add(hulk);
    	    	
    	Hero doctorStrange  = new Hero("Doctor Strange", 42);
    	heroList.add(doctorStrange);
    	     	

        // TODO 3 : It's Thor birthday, now he's 1501
    	thor.setAge(1501);
    	
    	String origHeroes = "";
    	for(int i = 0; i < heroList.size(); i++) {
    		origHeroes = origHeroes + "    " + heroList.get(i).getName();
    	}
    	System.out.println("Original heroList : " + origHeroes);
    	
    	System.out.println("");
    	

	
        // TODO 4 : Shuffle or randomize the heroes list
        Collections.shuffle(heroList);    	

        // TODO 5 : Keep only the half of the list
        // using subList() method
        int halfListLength = heroList.size()/2;
        List<Hero> halfHeroList = heroList.subList(0, halfListLength);
              
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        String heroes = "";
        String halfHeroes = "";
        
    	for(int i = 0; i < heroList.size(); i++) {
    		heroes = heroes + "    " + heroList.get(i).getName();
    	}
    	System.out.println("Shuffled heroList : " + heroes);
    	
    	System.out.println("");
    	
    	for(int i = 0; i < halfHeroList.size(); i++) {
    		halfHeroes = halfHeroes + "    " + halfHeroList.get(i).getName(); 
    	}
    	System.out.println("Half     heroList : " + halfHeroes);

    }
}