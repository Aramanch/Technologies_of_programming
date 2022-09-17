package org.example;
import java.util.*;


class Person
{
    /*
    статическая переменная который существуют в одном экземпляре
    и обращаться к ним нужно по имени класса
    (внутри класса к статической переменной можно обращаться просто по имени).
    В этом случае переменная подсчитывает количество экземпляров, созданных из этого
    класса.
    */

    private static Dictionary<String, List> emps = new Hashtable<String, List>();
    public static Dictionary getEmployees(){
        return emps;
    }



}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int choice=-1;
        while (choice!=4) {
            System.out.print(
                    """
                    ================Main Menu Example =============
                    
                    1- print Employee Info 
                    2- add new Employee
                    3- change Info
                    4- exit
                    """);
            choice = in.nextInt();
            List<String> keys= new ArrayList<>();
            switch (choice) {
                case 1: {
                    System.out.print("Enter id:  ");
                    try {
                        List lst = (List) Person.getEmployees().get(in.next());
                        System.out.print("Имя: " + lst.get(0)+"\n");
                        System.out.print("Возраст: " + lst.get(1)+"\n");
                        System.out.print("Зарплата: " + lst.get(2)+"\n");
                        System.out.print(Person.getEmployees().keys()+"\n");
                    }
                    catch (Exception ex){
                        System.out.println("Try again!");
                    }

                    break;
                }
                case 2: {
                    List<String> inform = new ArrayList<>();
                    System.out.print("Enter Name:  ");
                    inform.add(0, in.next());
                    System.out.print("Enter Age:  ");
                    inform.add(1, in.next());
                    System.out.print("Enter Salary:  ");
                    inform.add(2, in.next());
                    System.out.print("Enter ID: ");
                    if (keys.contains(in.next()) == true){
                        System.out.print("Already used!");
                    }else {
                        Person.getEmployees().put(in.next(), inform);
                        keys.add(in.next());
                    }
                    Person.getEmployees().put(in.next(), inform);
//                    keys.add(in.next());


                    break;
                }

                case 3: {

                    break;
                }
                case 4: {
                    System.out.println("Exiting!!!");
                    break;
                }
                default: {
                    System.out.println("Invalid selection!!!");
                }
            }
            }
        }
    }




