package superhero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperHeroFinder {
    List<SuperHero> listOfSuperHeros, superHeroes;
    public static void main(String[] args) {
        SuperHeroFinder finder = new SuperHeroFinder();
        finder.setUp();
        Scanner scanner = new Scanner(System.in);
        String input = "00 4855";
        try {
            Validator.validate(input);
            String superHero = finder.findYourSuperHero("");
        } catch (Exception e) {
            System.out.println("Error :: " + e.getMessage());
        }
    }

    private String findYourSuperHero(String input) {
        String matchedChars = getMatchedCharacter(input.charAt(0)%48);
        List<SuperHero> matchedSuperHeros = getMatchedSuperHeros(matchedChars);
        for(int i=1;i<input.length();i++) {

            for(int j = 0; j<matchedChars.length();j++) {
            }
        }
        return "";
    }

    private List<SuperHero> getMatchedSuperHeros(String matchedChars) {
        listOfSuperHeros = new ArrayList<>();
        for(int i =0;i<superHeroes.size();i++) {
            SuperHero superHero = superHeroes.get(i);
            if(superHero.getName().charAt(0) == matchedChars.charAt(0)) {
                listOfSuperHeros.add(superHero);
            }
        }
        return listOfSuperHeros;
    }

    private String getMatchedCharacter(int number) {
        switch (number) {
            case 2: return "abc";
            case 3: return "def";
            case 4: return "ghi";
            case 5: return "jkl";
            case 6: return "mno";
            case 7: return "pqrs";
            case 8: return "tuv";
            case 9: return "wxyz";
            default: return " ";
        }
    }

    private List<SuperHero> setUp() {
        superHeroes = new ArrayList<>();
        superHeroes.add(new SuperHero("Hulk"));
        return superHeroes;
    }
}
