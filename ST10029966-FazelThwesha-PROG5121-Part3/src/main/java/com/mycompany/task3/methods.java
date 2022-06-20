/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task3;

import java.util.Arrays;

/**
 *
 * @author Andile
 */
public class methods {

    static Object done(String name, String taskName, String taskStatus, int[] taskDuration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    String[] name;
    String[] taskNames;
    String[] taskStatus;
    int[] taskDurations;
    
    public static String done(String[] name, String[] taskNames, String[] taskStatus, int[] taskDurations){
        
        for(int x=0; x<taskStatus.length; x++){
            if("Done".equalsIgnoreCase(taskStatus[x])){
                return("Developer: " + name[x] 
                     + "\n Task name: " + taskNames[x]
                     + "\n Task durations: " + taskDurations[x]);
            }
        }
        return null;
    }
    public static String longestDuration(String[] name, int[] taskDurations){
        
        String developer=null;
        int duration=taskDurations[0];
        
        for(int x=0; x<taskDurations.length; x++){
            if(duration<taskDurations[x]){
                duration=taskDurations[x];
                developer=name[x];
            }
        }
        return ("Longest task duration is " + duration + ", by developer, " + Arrays.toString(name));
    }
    public static String searchForTask(String[] taskNames, String task, String[] name, String[] taskStatus){
        
        for(int x=0; x<taskNames.length; x++){
            if (taskNames[x].equals(task)){
                return (taskNames[x] + "\n" + name[x] + "\n" + taskStatus[x]);
            }
            
        }
        return null;
    }
    public static String searchForDeveloperTasks(String[] name, String findDeveloper, String[] taskNames, String[] taskStatus){
        
        for(int x=0; x<name.length; x++){
            if (name[x].equals(findDeveloper)){
                return ("Developer tasks: " + taskNames[x] + "\n" + "Task statuses: " + taskStatus[x]);
            }
        }
        return null;
    }
    public static String report(String[] name, String[] taskNames, String[] taskStatus, String[] taskDurations){
        
        for(int x=0; x<name.length; x++){
            return (name[x] + "\t" + taskNames[x] + "\t" + taskStatus[x] + "\t" + taskDurations[x]);
        }
        return null;
    
}


    
}
