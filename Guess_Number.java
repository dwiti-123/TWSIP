import java.util.Random;
import java.util.Scanner;


public class Guess_Number {

    public static void main(String[] args) {
            //Introduction and rules of game.
            System.out.println("Welcome to the NUMBER GUESSING GAME");
            System.out.println();
            System.out.println("In this Game you have to try to Guess the Correct Number in finite number of  Trials!!!");
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("Enter The Guess Number between 1 to 100");



            System.out.println("Select a level between 1 to 5!!!");
            Scanner sc = new Scanner(System.in);
            int select= sc.nextInt();
            int level = 0;

            int j=1;
            //code for level 1 of game---10 trials
            if(select==1) {

                System.out.println("In this you have to Guess number in 10 Trials!!!");

                // taking a random number using random class.
                int min = 1;
                int max = 100;
                Random rd = new Random();
                int i = rd.nextInt((max - min) + min) + min;

                System.out.println("welcome to the level "+select+" !!");

                while (j < 11) {
                    System.out.println("Enter number for your " + j + " Trial!!");
                    Scanner sc1 = new Scanner(System.in);
                    int guess = sc1.nextInt();

                    if (guess == i) {
                        System.out.println("guess is correct");
                        level=1;
                        break;

                    } else if (guess > i) {
                        System.out.println(" correct number is smaller than guess number ");
                    } else if (guess < i) {
                        System.out.println("correct number is greater than guess number");
                    }
                    j++;
                    if (j > 10) {
                        System.out.println("OPPS!! your all guess are incorrect.");
                        System.out.println("the correct number is " + i);
                        System.out.println("  ");
                        System.out.println("Restart the Guess Game");
                        System.out.println(" ");
                        break;
                    }

                }
            }

            //code for level 2 of game---7trials

            if(select==2 || level==1 ) {

                // taking a random number using random class.
                int min = 1;
                int max = 100;
                Random rd = new Random();
                int i = rd.nextInt((max - min) + min) + min;
                j=1;

                //if user directly select 2 then code will be executed
                if(select==2) {
                    System.out.println("welcome to the level "+select+" !!");
                    System.out.println(" ");
                    System.out.println("You have 7 trials to guess correct number");
                    System.out.println(" ");

                    while (j < 8) {
                        System.out.println("Enter number for your " + j + " Trial!!");

                        Scanner sc1 = new Scanner(System.in);
                        int guess = sc1.nextInt();

                        if (guess == i) {
                            System.out.println("guess is correct");
                            level=2;
                            break;
                        } else if (guess > i) {
                            System.out.println(" correct number is smaller than guess number ");
                        } else if (guess < i) {
                            System.out.println("correct number is greater than guess number");
                        }
                        j++;
                        if (j > 7) {
                            System.out.println(" ");
                            System.out.println("OPPS!! your all guess are incorrect.");
                            System.out.println("The correct number is " + i);
                            System.out.println("Restart the Guess Game");
                            System.out.println(" ");
                        }

                    }
                }
                //when user is able to guess correct number in given try this code will be executed.
                else {
                    System.out.println("congratulations you have moved to level 2");
                    System.out.println(" ");
                    System.out.println("You have 7 trials to guess correct number");
                    System.out.println(" ");
                    while (j < 8) {
                        System.out.println("Enter number for your " + j + " Trial!!");
                        Scanner sc1 = new Scanner(System.in);
                        int guess = sc1.nextInt();

                        if (guess == i) {
                            System.out.println("guess is correct");
                            level=2;
                            break;
                        } else if (guess > i) {
                            System.out.println(" correct number is smaller than guess number ");
                        } else if (guess < i) {
                            System.out.println("correct number is greater than guess number");
                        }
                        j++;
                        if (j > 7) {
                            System.out.println("OPPS!! your all guess are incorrect.");
                            System.out.println("the correct number is " + i);
                            System.out.println("Restart the Guess Game");
                            System.out.println(" ");
                        }

                    }
                }
            }

            //code for level 3 of game---5trials

            if(select==3 || level==2 ) {
                // taking a random number using random class.
                int min = 1;
                int max = 100;
                Random rd = new Random();
                int i = rd.nextInt((max - min) + min) + min;
                j=1;

                //if user directly select 3 then code will be executed
                if(select==3) {
                    System.out.println("welcome to the level "+select+" !!");
                    System.out.println(" ");
                    System.out.println("You have 5 trials to guess correct number");
                    System.out.println(" ");

                    while (j < 6) {
                        System.out.println("Enter number for your " + j + " Trial!!");

                        Scanner sc1 = new Scanner(System.in);
                        int guess = sc1.nextInt();

                        if (guess == i) {
                            System.out.println("guess is correct");
                            level=3;
                            break;
                        } else if (guess > i) {
                            System.out.println(" correct number is smaller than guess number ");
                        } else if (guess < i) {
                            System.out.println("correct number is greater than guess number");
                        }
                        j++;
                        if (j > 5) {
                            System.out.println(" ");
                            System.out.println("OPPS!! your all guess are incorrect.");
                            System.out.println("The correct number is " + i);
                            System.out.println("Restart the Guess Game");
                            System.out.println(" ");
                        }

                    }
                }
                //when user is able to guess correct number in given try this code will be executed.
                else {
                    System.out.println("congratulations you have moved to level 3");
                    System.out.println(" ");
                    System.out.println("You have 5 trials to guess correct number");
                    System.out.println(" ");
                    while (j < 6) {
                        System.out.println("Enter number for your " + j + " Trial!!");
                        Scanner sc1 = new Scanner(System.in);
                        int guess = sc1.nextInt();

                        if (guess == i) {
                            System.out.println("guess is correct");
                            level=3;
                            break;
                        } else if (guess > i) {
                            System.out.println(" correct number is smaller than guess number ");
                        } else if (guess < i) {
                            System.out.println("correct number is greater than guess number");
                        }
                        j++;
                        if (j > 5) {
                            System.out.println("OPPS!! your all guess are incorrect.");
                            System.out.println("the correct number is " + i);
                            System.out.println("Restart the Guess Game");
                            System.out.println(" ");
                        }

                    }
                }
            }

            //code for level 4 of game---3 trails

            if(select==4 || level==3 ) {

                // taking a random number using random class.
                int min = 1;
                int max = 100;
                Random rd = new Random();
                int i = rd.nextInt((max - min) + min) + min;
                j=1;

                //if user directly select 4 then code will be executed
                if(select==4) {
                    System.out.println("welcome to the level "+select+" !!");
                    System.out.println(" ");
                    System.out.println("You have 3 trials to guess correct number");
                    System.out.println(" ");

                    while (j < 4) {
                        System.out.println("Enter number for your " + j + " Trial!!");

                        Scanner sc1 = new Scanner(System.in);
                        int guess = sc1.nextInt();

                        if (guess == i) {
                            System.out.println("guess is correct");
                            level=4;
                            break;
                        } else if (guess > i) {
                            System.out.println(" correct number is smaller than guess number ");
                        } else if (guess < i) {
                            System.out.println("correct number is greater than guess number");
                        }
                        j++;
                        if (j > 3) {
                            System.out.println(" ");
                            System.out.println("OPPS!! your all guess are incorrect.");
                            System.out.println("The correct number is " + i);
                            System.out.println("Restart the Guess Game");
                            System.out.println(" ");
                        }

                    }
                }
                //when user is able to guess correct number in given try this code will be executed.
                else {
                    System.out.println("congratulations you have moved to level 4");
                    System.out.println(" ");
                    System.out.println("You have 3 trials to guess correct number");
                    System.out.println(" ");
                    while (j < 4) {
                        System.out.println("Enter number for your " + j + " Trial!!");
                        Scanner sc1 = new Scanner(System.in);
                        int guess = sc1.nextInt();

                        if (guess == i) {
                            System.out.println("guess is correct");
                            level=4;
                            break;
                        } else if (guess > i) {
                            System.out.println(" correct number is smaller than guess number ");
                        } else if (guess < i) {
                            System.out.println("correct number is greater than guess number");
                        }
                        j++;
                        if (j > 3) {
                            System.out.println("OPPS!! your all guess are incorrect.");
                            System.out.println("the correct number is " + i);
                            System.out.println("Restart the Guess Game");
                            System.out.println(" ");
                        }

                    }
                }
            }

            //code for level 5 of game---2 trials / final level-game over Restart Game!!!

            if(select==5 || level==4 ) {

                // taking a random number using random class.
                int min = 1;
                int max = 100;
                Random rd = new Random();
                int i = rd.nextInt((max - min) + min) + min;
                j=1;

                //if user directly select 5 then code will be executed
                if(select==3) {
                    System.out.println("welcome to the level "+select+" !!");
                    System.out.println(" ");
                    System.out.println("You have 2 trials to guess correct number");
                    System.out.println(" ");

                    while (j < 3) {
                        System.out.println("Enter number for your " + j + " Trial!!");

                        Scanner sc1 = new Scanner(System.in);
                        int guess = sc1.nextInt();

                        if (guess == i) {
                            System.out.println("guess is correct");
                            System.out.println("Congratulations!!! You Completed the game");
                            break;
                        } else if (guess > i) {
                            System.out.println(" correct number is smaller than guess number ");
                        } else if (guess < i) {
                            System.out.println("correct number is greater than guess number");
                        }
                        j++;
                        if (j > 2) {
                            System.out.println(" ");
                            System.out.println("OPPS!! your all guess are incorrect.");
                            System.out.println("The correct number is " + i);
                            System.out.println("Restart the Guess Game");
                            System.out.println(" ");
                        }

                    }
                }
                //when user is able to guess correct number in given try this code will be executed.
                else {
                    System.out.println("congratulations you have moved to level 5-final level");
                    System.out.println(" ");
                    System.out.println("You have 2 trials to guess correct number");
                    System.out.println(" ");
                    while (j < 3) {
                        System.out.println("Enter number for your " + j + " Trial!!");
                        Scanner sc1 = new Scanner(System.in);
                        int guess = sc1.nextInt();

                        if (guess == i) {
                            System.out.println("guess is correct");
                            System.out.println("Congratulations!!! You Completed the game");
                            break;
                        } else if (guess > i) {
                            System.out.println(" correct number is smaller than guess number ");
                        } else if (guess < i) {
                            System.out.println("correct number is greater than guess number");
                        }
                        j++;
                        if (j > 3) {
                            System.out.println("OPPS!! your all guess are incorrect.");
                            System.out.println("the correct number is " + i);
                            System.out.println("Restart the Guess Game");
                            System.out.println(" ");
                        }

                    }
                }
            }

        }
    }




