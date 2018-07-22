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
            String superHeroString = input.substring(3);
            String superHero = finder.findYourSuperHero(superHeroString, (ArrayList) finder.superHeroes);
            System.out.println(superHero);
        } catch (Exception e) {
            System.out.println("Error :: " + e.getMessage());
        }
    }

    private String findYourSuperHero(String input, ArrayList superHeroes) {

        for (int i = 0; i < input.length(); i++) {
            String matchedChars = getMatchedCharacter(Integer.parseInt("" + input.charAt(i)));
            superHeroes = getMatchedSuperHeros(matchedChars, superHeroes, i);
        }
        if (superHeroes.size() > 0) {
            SuperHero superHero = null;
            for (int i = 0; i < superHeroes.size(); i++) {
                superHero = (SuperHero) superHeroes.get(0);
            }
            return superHero.getName();
        }

        return "";
    }

    private void printValues(ArrayList<SuperHero> superHeroes) {
        for (int i = 0; i < superHeroes.size(); i++) {
            System.out.println(i);
            System.out.println(superHeroes.get(i).getName());
        }
    }

    private ArrayList<SuperHero> getMatchedSuperHeros(String matchedChars, ArrayList superHeroes, int index) {
        listOfSuperHeros = new ArrayList<>();
        for (int i = 0; i < superHeroes.size(); i++) {
            SuperHero superHero = (SuperHero) superHeroes.get(i);
            for (int j = 0; j < matchedChars.length(); j++) {
                if (convertSmallChar(superHero.getName().charAt(index)) == matchedChars.charAt(j)) {
                    listOfSuperHeros.add(superHero);
                }
            }
        }
        return (ArrayList<SuperHero>) listOfSuperHeros;
    }

    private char convertSmallChar(char ch) {
        if (ch < 91)
            return (char) (ch + 32);
        return ch;
    }

    private String getMatchedCharacter(int number) {
        switch (number) {
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            default:
                return " ";
        }
    }

    private List<SuperHero> setUp() {
        superHeroes = new ArrayList<>();
        superHeroes.add(new SuperHero("Hulk"));
        return superHeroes;
    }
}
