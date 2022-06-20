/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Andile
 */

        
public class Login {
    
     public static boolean checkUsername(String username){
            boolean underscore=false;
            boolean charlength=false;
            
            for (int y=0; y<username.length(); y++){
                char i=username.charAt(y);
        if (username.charAt (y)==95){
             underscore = true;
        }
        
        if (username.length() <=5){
            charlength=true;
        }
            return underscore && charlength;
            }
            return false;
        }
        
        public static boolean checkPasswordComplexity(String password) {
            
            boolean uppercase=false;
            boolean digit=false;
            boolean specialCharacter=false;
            boolean passwordLength=false;
        
         for (int i=0; i<password.length(); i++){
             char y=password.charAt (i);
        if (password.length() >=8){
            passwordLength=true;
        }
         if (password.charAt(i)>=48 && password.charAt(i)<=57){
                digit=true;
        }
         if (password.charAt (i)>=65 && password.charAt (i)<=90){
             uppercase=true;
         }
          if (password.charAt (i)>=33 && password.charAt (i)<=47){
              specialCharacter=true;
          }
          return passwordLength && digit && uppercase && specialCharacter;
         
         }
            return false;
        }
        public static String registerUser(String[] args){
            
             return "The two above condtions have been met and the user has been registered successfully.";
             }
        
        public static boolean loginUser(String username, String password){
            
          
             //prompt user 
             System.out.println("Enter your username");
            
             
             System.out.println("Enter your password.");
             
             
             return Login.loginUser(username, password);
        }
        public static String returnLoginStatus(){
            
            return "A successful login";
        }
        

    public static String main(String[] args) {
        
       
         Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name.");
        String firstName=input.next();
        
         System.out.println("Enter your last name.");
        String lastName=input.next();
        
        System.out.println("Enter your Username.");
        String username=input.next();
        Login.checkUsername(username);
        if (Login.checkUsername(username)){
            System.out.println("Username successfully captured");
        }
        else{
            System.out.println("Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters is length.");    
        }
           
         
         System.out.println("Enter your password");
         String password=input.nextLine();
         if (Login.checkPasswordComplexity(password)){
             System.out.println("Password successfully captured.");
         }
         else{
             System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
         }
          
    
        { //Login
        System.out.println("Login here.");
        System.out.println("Enter your username.");
        String username2=input.next();
        Login.checkUsername(username);
        
        System.out.println("Enter your password.");
        String password2=input.next();
        Login.checkPasswordComplexity(password);
        if (Login.checkUsername(username) && Login.checkPasswordComplexity(password)){
           System.out.println("Welcome" + firstName + lastName + "it is great to see you again." );
          }
        else{
           System.out.println("Username or password incorrect, please try again.");
           
           
           return Login.returnLoginStatus();
        }
        //Part 2
        System.out.println("Welcome to EasyKanBan.");
        System.out.println("Select option/n Option 1)Add tasks/n Option 2)Show report/n Option 3)Quit");
        int option=input.nextInt();
        
        while (option!=3){       
        if (option==1){
            System.out.println("How many tasks do you want to add?");
            int taskNumber=input.nextInt();
            for (int x=0; x<taskNumber; x++){
                
                System.out.println("Enter the name of your task.");
                String taskName=input.nextLine();
                
                System.out.println("Task number" + x);
                
                System.out.println("Enter your task description.");
                String taskDescription=input.next();
                
                if (task.checkDescription(taskDescription)==true){
                    System.out.println("Task successfully captured");
                }
                else{
                    System.out.println("Please enter a task description of less than 50 characters");
                }
                System.out.println("Enter task duration");
                int taskDuration=input.nextInt();
                
                System.out.println("Enter your first name.");
                String name=input.nextLine();
                
                System.out.println("Enter your last name");
                String surname=input.nextLine();
                
                System.out.println("Developer details: " + name + surname);
                    
                }
            }
        
            int[] taskDuration;
            String name;
            String taskName;
            String taskStatus;
        
        if (option==2){
            String selection = (JOptionPane.showInputDialog(null, "1)Display the developer, Task Name and Task Duration for all the status of done."
                                                                + "2)Display the developer and the duration of the class with the longest duration."
                                                                + "3)Search for a task with a Task Name and display the Task Name, Developer and Task Status."
                                                                + "4)Search for all tasks assigned to a developer and display the Task Name and Taskk Status."
                                                                + "5)Delete a task using the Task Name."
                                                                + "6)Display a report that lists the full details of all captured tasks."
                                                                + "7)Exit"));
           
        
            
            if ("1".equals(selection)){
                JOptionPane.showMessageDialog(null, methods.done(name, taskName, taskStatus, taskDuration));
            }
            else if("2".equals(selection)){
                JOptionPane.showMessageDialog(null, (methods.longestDuration(name, taskDuration)));
            }
            else if("3".equals(selection)){
                JOptionPane.showMessageDialog(null, methods.searchForTask(taskName, password, name, taskStatus));
            }
            else if("4".equals(selection)){
                JOptionPane.showMessageDialog(null, methods.searchForDeveloperTasks(name, firstName, taskName, taskStatus));
            }
            else if("5".equals(selection)){
                JOptionPane.showMessageDialog(null, methods);
            }
            else if("6".equals(selection)){
                JOptionPane.showMessageDialog(null, methods.report(name, taskName, taskStatus, taskStatus));
            }
            else if("7".equals(selection)){
                System.exit(0);
        }
        String taskID=null;
        System.out.println("Task ID: " + (task.taskID(taskID, username, lastName, option)));
         
        System.out.println("1 | To do"
                         + "\n2 | Done"
                         + "\n3 | Doing");
        String select = input.next();
        String taskStatus;
        if (select=="1"){
            taskStatus = "To do";
        }
        else if (select=="2"){
            taskStatus = "Done";
        }
        else{
            taskStatus = "Doing";
        }
        JOptionPane.showMessageDialog(null, task.printTaskDetails(username, username, taskStatus, option, lastName, taskStatus, option, taskID));
        }
        System.out.println(task.taskHours(option, option));
        }
        
         
    //Question 1
        
    //Question 2
}

        
         
        


       
        
    

        
        
      

    }
}
