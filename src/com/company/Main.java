package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = 'n';
        System.out.println("Welcome!...Following are the topics of available quizes");
        while (x == 'n') {
            System.out.println("1.English" + "\n" + "2.JAVA" + "\n" + "3.General Konwledge" + "\n" + "Insert number of the quiz you want to solve ");
            char test='Y';
            int i = sc.nextInt();
            Main obj = new Main();
            switch (i) {
                case 1:

                        test=obj.English();

                        if (test=='N'){
                            x='y';
                            System.out.println("Thanks for solving");
                }break;
                case 2:
                         test=obj.Java();
                    if (test=='N'){
                        x='y';
                        System.out.println("Thanks for solving");
                    }break;
                case 3:

                        test=obj.GeneralKnowledge();
                    if (test=='N'){
                        x='y';
                        System.out.println("Thanks for solving");
                    }break;
                default:
                    System.out.println("Thanks for solving");


            }

        }
    }
        //main function ends here
        char English ()
        {
            Scanner ob1 = new Scanner(System.in);
            int ce = 0;
            System.out.println("Q1.Select the word which has similar meaning to MISERABLE");
            System.out.println("A.Object" + "\n" + "B.Abject" + "\n" + "C.Abstract" + "\n" + "D.Obstruct");
            char a = ob1.next().charAt(0);
            {
                if (a == 'B'||a=='b') {
                    System.out.println("Correct Answer");
                    ce++;
                } else {
                    System.out.println("Incorrect Answer...try next time");
                }

            }

            System.out.println("Q2.What is the synonym for OGLE ");
            System.out.println("A.Parental" + "\n" + "B.Seaming" + "\n" + "C.Gaze" + "\n" + "D.Leach");
            char b = ob1.next().charAt(0);
            {
                if (b == 'C'||b=='c') {
                    System.out.println("Correct Answer");
                    ce++;
                } else {
                    System.out.println("Incorrect Answer...try next time");
                }

            }


            System.out.println("Q3.Antonym of INDOLENT ");
            System.out.println("A.Energetic" + "\n" + "B.Lazy" + "\n" + "C.Inert" + "\n" + "D.Inactive");
            char c = ob1.next().charAt(0);
            {
                if (c == 'A'||c=='a') {
                    System.out.println("Correct Answer");
                    ce++;
                } else {
                    System.out.println("Incorrect Answer...try next time");
                }

            }
            System.out.println("***************************");
            System.out.println("Your score is : " + ce + " points");
            System.out.println("Correct Answers are as follows:");
            System.out.println("Q1.ANS: Abject" + "\n" + "Q2.ANS: Gaze" + "\n" + "Q3.ANS: Energetic ");
            System.out.println("Enter 'Y' to retake the Quiz and 'N' to exit the quiz ");
            char d = ob1.next().charAt(0);
            return d;



        }
        //English ends here

    char Java () {
            Scanner ob2 = new Scanner(System.in);
            int cj = 0;
            System.out.println("Q1.What is the size of byte variable?");
            System.out.println("A.8 bit" + "\n" + "B.16 bit" + "\n" + "C.32 bit " + "\n" + "D.64 bit");
            char a = ob2.next().charAt(0);
            {
                if (a == 'A'||a=='a') {
                    System.out.println("Correct Answer");
                    cj++;
                } else {
                    System.out.println("Incorrect Answer...try next time");
                }

            }


            System.out.println("Q2.Method Overloading is an example of ");
            System.out.println("A.Dynamic Binding." + "\n" + "B.Static Binding" + "\n" + "C.Both of above" + "\n" + "D.None of the above");
            char b = ob2.next().charAt(0);
            {
                if (b == 'B'||b=='b') {
                    System.out.println("Correct Answer");
                    cj++;
                } else {
                    System.out.println("Incorrect Answer...try next time");
                }

            }


            System.out.println("Q3. What is the default value of byte variable? ");
            System.out.println("A.Null" + "\n" + "B.0.0" + "\n" + "C.0" + "\n" + "D.Not defined");
            char c = ob2.next().charAt(0);
            {
                if (c == 'C'||c=='c') {
                    System.out.println("Correct Answer");
                    cj++;
                } else {
                    System.out.println("Incorrect Answer...try next time");
                }

            }
            System.out.println("***************************");
            System.out.println("Your score is : " + cj + " points");
            System.out.println("Correct Answers are as follows:");
            System.out.println("Q1.ANS: 8 bit" + "\n" + "Q2.ANS: Static Binding" + "\n" + "Q3.ANS: 0 ");
            System.out.println("Enter 'Y' to retake the Quiz and 'N' to exit the quiz ");
            char d = ob2.next().charAt(0);
            return d;
        }
        //JAVA ends here
        char GeneralKnowledge ()
        {
            Scanner ob3 = new Scanner(System.in);
            int cg = 0;
            System.out.println("Q1.‘Pattana Pragathi’, is a development program of which Indian state/ UT?");
            System.out.println("A.Andhra Pradesh" + "\n" + "B.Karnataka" + "\n" + "C.Telangana " + "\n" + "D. Kerala");
            char a = ob3.next().charAt(0);
            {
                if (a == 'C'||a=='c') {
                    System.out.println("Correct Answer");
                    cg++;
                } else {
                    System.out.println("Incorrect Answer...try next time");
                }

            }


            System.out.println("Q2.Which film won the ‘Best Motion picture- drama’ award in the Golden Globe awards 2020?");
            System.out.println("A.Once Upon A Time in Hollywood" + "\n" + "B.1917" + "\n" + "C.Missing Link" + "\n" + "D.Parasite");
            char b = ob3.next().charAt(0);
            {
                if (b == 'B'||b=='b') {
                    System.out.println("Correct Answer");
                    cg++;
                } else {
                    System.out.println("Incorrect Answer...try next time");
                }

            }


            System.out.println("Q3. Dhanu Jatra is currently celebrated in which state?");
            System.out.println("A.Odisha" + "\n" + "B.Maharashtra" + "\n" + "C.Madhya Pradesh" + "\n" + "D.Jharkhand");
            char c = ob3.next().charAt(0);
            {
                if (c == 'A'||c=='a') {
                    System.out.println("Correct Answer");
                    cg++;
                } else {
                    System.out.println("Incorrect Answer...try next time");
                }

            }
            System.out.println("***************************");
            System.out.println("Your score is : " + cg + " points");
            System.out.println("Correct Answers are as follows:");
            System.out.println("Q1.ANS: Telangana" + "\n" + "Q2.ANS: 1917" + "\n" + "Q3.ANS: Odisha ");
            System.out.println("Enter 'Y' to retake the Quiz and 'N' to exit the quiz ");
            char d = ob3.next().charAt(0);
            return d;

        }
        //G.K ends here

    }

