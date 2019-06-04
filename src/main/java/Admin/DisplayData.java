package Admin;

import book.Arts;
import book.Book_Type;
import book.Commerce;
import book.Science;
import borrower.Borrower_Type;
import borrower.Student;
import borrower.Teacher;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DisplayData {
    public static void main(String[] args) {

        int number;
        char r;
        //  String j;


        String[] ScienceBooks = new String[0];
        String[] CommerceBooks=new String[0];
        String[] ArtsBooks=new String[0];
        Scanner obj1 = new Scanner(System.in);
       Scanner obj2 = new Scanner(System.in);

        Librarian l1 = new Librarian();
        Arts a1 = new Arts();
        Book_Type b1 = new Book_Type();
        Commerce c1 = new Commerce();
        Science S1 = new Science();
        Borrower_Type bt1 = new Borrower_Type();
        Student s1 = new Student();
        Teacher t1 = new Teacher();


        System.out.println("Welcome to Library Management System");
        System.out.println("Do you want to know  student Details Y/N");
        r = obj1.next().charAt(0);
        if (r == 'Y' || r == 'y') {

            System.out.println("Student Details");
            bt1.idisplay();
        }

        System.out.println("Would you like to login as student or teacher?");

        String j = obj1.nextLine();

        if (j == "student") {

            System.out.println("Student details");

            bt1.setFirstName("Sidharth");
            bt1.setLastName("Nayyar");
            bt1.setGender("Male");
            bt1.setEmail("sidnayyar1@gmail.com");
            s1.setBatchNumber(1);
            s1.setClassName("12th");

        } else if (j == "Teacher") {

            t1.setFacultyName("George");
            bt1.setGender("Male");
            t1.setSubject("Science");
        }

        System.out.println("Books available for students");
        System.out.println("Enter the course book you want to select");
        j = obj1.nextLine();
        {
            if (j == "Science") {
                System.out.println("Science books");

                ScienceBooks = new String[]{"biology", "chemistry", "maths", "Physics", "Computer Sciense"};
                for (int i = 0; i < ScienceBooks.length; i++) {
                    System.out.println("The Books are  \n" + i);
                }

            } else if (j == "Commerce") {

                CommerceBooks = new String[]{"business", "maths", "econimics", "Internation business", "Current affairs"};
                for (int i = 0; i < CommerceBooks.length; i++) {
                    System.out.println("The Books are  \n" + i);

                }

            } else if (j == "Arts") {
                ArtsBooks = new String[]{"philosopy", "Litrature", "geography", "political science", "humanities"};
                for (int i = 0; i < ArtsBooks.length; i++) {
                    System.out.println("The Books are  \n" + i);

                }
            }
            System.out.println("Enter the course book you want to issue");
            j = obj1.nextLine();
            if (j == "Science") {
                System.out.println("Enter number of books ?");
                number = obj2.nextInt();
                switch (number) {
                    case 1: {
                        bt1.idisplay();
                        for (int i = 0; i < 1; i++) {
                            System.out.println("books selected are   " + ScienceBooks[i]);

                            break;
                        }
                    }
                    case 2: {

                        bt1.idisplay();
                        for (int i = 0; i < 2; i++) {
                            System.out.println("books selected are   " + ScienceBooks[i]);
                            break;
                        }
                    }
                    case 3: {

                        bt1.idisplay();
                        for (int i = 0; i < 3; i++) {
                            System.out.println("books selected are   " + ScienceBooks[i]);
                            break;
                        }
                    }
                    case 4: {

                        bt1.idisplay();
                        for (int i = 0; i < 4; i++) {
                            System.out.println("books selected are   " + ScienceBooks[i]);
                            break;
                        }
                    }
                    case 5: {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("books selected are   " + ScienceBooks[i]);
                            break;
                        }

                    }default:
                    }
                    {
                        System.out.println("Invalid Number");


                        bt1.idisplay();

                    }


                }else if (j=="Commerce"){

                System.out.println("Enter number of books ?");
                number = obj2.nextInt();
                switch (number) {
                    case 1: {
                        bt1.idisplay();
                        for (int i = 0; i < 1; i++) {
                            System.out.println("books selected are   " + CommerceBooks[i]);

                            break;
                        }
                    }
                    case 2: {

                        bt1.idisplay();
                        for (int i = 0; i < 2; i++) {
                            System.out.println("books selected are   " + CommerceBooks[i]);
                            break;
                        }
                    }
                    case 3: {

                        bt1.idisplay();
                        for (int i = 0; i < 3; i++) {
                            System.out.println("books selected are   " + CommerceBooks[i]);
                            break;
                        }
                    }
                    case 4: {

                        bt1.idisplay();
                        for (int i = 0; i < 4; i++) {
                            System.out.println("books selected are   " + CommerceBooks[i]);
                            break;
                        }
                    }
                    case 5: {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("books selected are   " + CommerceBooks[i]);
                            break;
                        }

                    }default:
                } {
                    System.out.println("Invalid Number");


                    bt1.idisplay();

                }

            }else if(j=="Arts"){

                System.out.println("Enter number of books ?");
                number = obj2.nextInt();
                switch (number) {
                    case 1: {
                        bt1.idisplay();
                        for (int i = 0; i < 1; i++) {
                            System.out.println("books selected are   " + ArtsBooks[i]);

                            break;
                        }
                    }
                    case 2: {

                        bt1.idisplay();
                        for (int i = 0; i < 2; i++) {
                            System.out.println("books selected are   " + ArtsBooks[i]);
                            break;
                        }
                    }
                    case 3: {

                        bt1.idisplay();
                        for (int i = 0; i < 3; i++) {
                            System.out.println("books selected are   " + ArtsBooks[i]);
                            break;
                        }
                    }
                    case 4: {

                        bt1.idisplay();
                        for (int i = 0; i < 4; i++) {
                            System.out.println("books selected are   " + ArtsBooks[i]);
                            break;
                        }
                    }
                    case 5: {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("books selected are   " + ArtsBooks[i]);
                            break;
                        }

                    }default:
                } {
                    System.out.println("Invalid Number");


                    bt1.idisplay();

                }
            }

               // l1.setId(1);
            }


//            System.out.println("Librarian Details");
//
//
//            System.out.println("Do you want to know  student Details Y/N");
//            r = obj1.next().charAt(0);
//            if (r == 'Y' || r == 'y') {
//
//            }
//            else if (r == 'n' || r == 'N') {
//            }


        }
}

