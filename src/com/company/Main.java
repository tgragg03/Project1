/*
Tanner Gragg
CSCI 1660
1/30/2020
 */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class


public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();


        while(true) {
            menu();
            int choice = input.nextInt();

            if (choice == 0) {
                break;
            }
            if (choice == 1) {
                String task = addTask();
                list.add(task);
            }
            if (choice == 2) {
                int task = removeTask(list);
                list.remove(task);
                System.out.println("Removing Task");
            }
            if (choice == 3) {
                int update = updateTask();
                System.out.println("What would you like to update the task to?");
                String taskUpdate = input.nextLine();
                list.set(update, taskUpdate);
                System.out.println("Task Updated");
            }
            if (choice == 4) {
                allTasks(list);
                //for(int i = 0; i < list.size(); i++) {
                //    System.out.println(list);
                //}
            }
        }
        System.out.println("Good bye");
    }
    static void menu(){
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit");
    }
    static String addTask(){
        //adds a task
        System.out.println("Please type the task:");
        String task = input.next();
        return task;
    }
    static int removeTask(ArrayList<String> a){
        //removes a task
        Scanner input = new Scanner(System.in);
        System.out.println("Please tell me which index to remove");
        int i = input.nextInt();

        return i;
    }
    static int updateTask(){
        //updates a task
        System.out.println("Updating Task");
        int a = input.nextInt();
        return a;
    }
    static void allTasks(ArrayList<String> a){
        //lists all tasks
        System.out.println("----------------");
//        for(int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i));
//        }
        System.out.println(a.toString());
        System.out.println("----------------");
    }

}
