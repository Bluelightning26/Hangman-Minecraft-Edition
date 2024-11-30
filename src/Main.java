import java.util.Scanner;
import java.util.Random;

class Hangman_Minecraft
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int lives = 7;
        int wordSelector;
        wordSelector = rand.nextInt(30)+1;
        String word = "";
        boolean showSystemProperties = false;

        switch(wordSelector)
            {
            case 1:
                word = "mine";
                break;
            case 2:
                word = "shulker";
                break;
            case 3:
                word = "bow";
                break;
            case 4:
                word = "enderman";
                break;
            case 5:
                word = "potato";
                break;
            case 6:
                word = "villager";
                break;
            case 7:
                word = "nitwit";
                break;
            case 8:
                word = "overworld";
                break;
            case 9:
                word = "nether";
                break;
            case 10:
                word = "taiga";
                break;
            case 11:
                word = "mooshroom";
                break;
            case 12:
                word = "mojang";
                break;
            case 13:
                word = "enchant";
                break;
            case 14:
                word = "diamonds";
                break;
            case 15:
                word = "biome";
                break;
            case 16:
                word = "furnace";
                break;
            case 17:
                word = "cobblestone";
                break;
            case 18:
                word = "offhand";
                break;
            case 19:
                word = "farmer";
                break;
            case 20:
                word = "piglin";
                break;
            case 21:
                word = "redstone";
                break;
            case 22:
                word = "copper";
                break;
            case 23:
                word = "ore";
                break;
            case 24:
                word = "golem";
                break;
            case 25:
                word = "snow";
                break;
            case 26:
                word = "dungeon";
                break;
            case 27:
                word = "coordinates";
                break;
            case 28:
                word = "wolf";
                break;
            case 29:
                word = "stair";
                break;
            case 30:
                word = "mob";
                break;
                default: word = "Creeper... Aw Man";
            }



        System.out.println("\n\n\nWelcome to the game Hangman!");
        System.out.println("All the words are related to Minecraft");
        System.out.println("If you get more than 7 letters wrong a creeper will blow you up");
        System.out.println("\nReady?");
        System.out.println("The Creeper sure is...");
        System.out.println("\nEnter any key to start");
        String Null = sc.nextLine();
        System.out.println("\n\n\n\n\n");


        char[] guessedWord = new char[word.length()];

        //Spacer thingies for not guessed letters
        for (int i = 0; i < guessedWord.length; i++)
        {
        guessedWord[i] = '_';
        }


        while (lives > 0 && new String(guessedWord).contains("_"))
        {
            System.out.println("\n\nCurrent word: " + new String(guessedWord));
            System.out.println("Lives left: " + lives);
            System.out.print("Guess a letter: ");
            char guess = sc.nextLine().toLowerCase().charAt(0);

            boolean correctGuess = false;

            // Check if the guessed letter is in word
            for (int i = 0; i < word.length(); i++)
            {
                if (word.charAt(i) == guess)
                {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            //Lowers lives when wrong
            if (!correctGuess)
            {
                lives--;
                System.out.println("Wrong guess!");
            }
        }

        //Ending
        if (new String(guessedWord).equalsIgnoreCase(word))
        {
            System.out.println("Congratulations! You've guessed the word: " + word);
            System.out.println("""
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠠⠤⠤⠤⠤⠤⢀⡀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠾⢁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠦⡀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠈⠂⠄⠀⡀⠤⠤⠀⠀⠀⠠⠘⢆⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⡰⠁⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀
                    ⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⢠⠁⠀⠀⡀⠀⠀⠀⢀⡀⠀⢸⠀
                    ⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⡆⠀⠀⢰⡏⠀⠀⠀⢼⠃⠀⡎⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⢠⠀⠀⠀⠈⠀⣀⡤⡀⠈⠀⡸⠁⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⡜⠢⣀⠀⠘⡀⠀⠀⠀⡜⠞⢱⠇⠀⡠⠃⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⢰⠁⠀⠈⠑⠢⠤⠄⣀⡠⠭⠤⡌⠒⠋⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⡎⠀⠀⠀⠀⡌⠀⠀⠀⠀⠀⢰⠁⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⢀⠁⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⢀⣀⡇⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀
                    ⠀⣀⠤⠒⠉⠉⠀⡇⠀⠀⠀⠞⠀⠀⠀⠀⣀⠤⠇⠀⠤⢄⣀⠀⠀⠀
                    ⢸⡅⠀⠀⠀⠀⠀⢇⠀⠀⠀⡇⠀⠀⠀⡜⠉⠉⠢⢀⠤⠤⣚⣛⣢⡀
                    ⠀⠑⢄⠀⠀⠀⡠⣋⠵⠦⣄⣧⠔⠊⠉⠙⢦⡀⠀⢈⠖⠉⠀⠀⢠⠃
                    ⠀⠀⠀⠉⠁⠉⡏⠀⠀⠀⡘⡇⠃⠤⠤⠐⠉⠱⣄⡈⠀⢀⡠⠔⠃⠀
                    ⠀⠀⠀⠀⠀⠀⠉⠒⠤⠼⠤⢻⠀⠈⠆⠀⠀⠀⠹⡉⠉⠁⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣆⠀⠘⢀⠤⢴⠈⢱⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⢄⣸⡀⣀⠦⠊⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀*Fabulous art from emojicombos.com - not by me
                    """);
        }
        else
        {
            System.out.print("""
                    ⠀⠀⠀⠀⠀⠀⠀⣀⡤⠤⢒⣦⠶⠶⠶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⢀⡴⠋⠿⠀⠀⠈⠋⠀⠀⠀⠁⠙⠷⣦⣤⣀⠀⠀⠀⠀⠀
                    ⠀⢀⡴⠶⣴⠻⠀⠀⠐⣶⠞⠁⠀⢀⠀⠀⠀⣀⠀⠙⠀⠹⢶⣀⠀⠀⠀
                    ⢠⡿⠀⠀⠗⠀⠀⠀⠀⠃⠀⠀⢰⣏⠁⠀⠀⠈⡏⠉⠀⠀⠸⡏⢣⠀⠀
                    ⣺⠂⠀⣖⠀⠀⠀⠀⢀⡀⢀⣹⣦⡽⣦⣴⣤⣀⢠⡀⠀⢀⠀⠑⠼⣇⠀
                    ⠹⡟⡄⢈⣩⠀⠀⠲⠾⠛⡛⠋⠉⠀⡀⢀⣿⠙⠾⣦⡐⢿⡁⠀⡀⢸⡀
                    ⠀⢿⣷⡀⠀⢚⡀⠈⢉⡳⢵⡄⢠⠀⠇⣿⣿⠒⠚⠍⠁⢀⣤⡰⠛⠛⠁
                    ⠀⠀⠈⠛⠛⠋⠈⠉⠉⠙⠓⣷⠸⣼⣸⢻⣛⠓⠶⠞⠓⠛⠉⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⢀⣠⡴⣞⣭⣿⡄⠋⡇⢸⢥⡽⢳⣤⡀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠐⣯⡁⣉⠛⢏⣸⣇⣷⣉⣿⡴⢧⠈⠊⠹⣧⡀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠙⠶⣷⣆⣀⣌⠁⠘⣁⣨⡀⢈⣀⣰⣠⣿⠇⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⣿⣷⠛⡋⣏⠙⠿⠛⠉⠉⠁⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⢻⠀⡇⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⢸⠃⡇⢻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⡀⣴⣿⠟⠀⠀⣷⠈⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠐⠋⠁⠠⠃⠀⠈⠀⠈⠙⠂⠀⠀⠀⠀⠀⠀⠀⠀*Fabulous art from emojicombos.com - not by me
                """);
            System.out.println("Aw man... The Creeper exploded you :( ... The word was: " + word);
        }

        showSystemProperties = true;

        if (showSystemProperties)
            {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on November 30th 2024");
            }

    }
}