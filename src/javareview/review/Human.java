/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author lamon
 */
public class Human {

    // define instance variables
    private String name;
    private int age;
    private char gender;
    
    // constructor:
    // used to create individual humans
    // "Setup" a human to use
    public Human(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void celebrateBirthday(){
        // increase Human age
        this.age++;
        // wish them a happy birthday
        System.out.println("Happy birthday " + this.name);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human bob = new Human("Bob", 20, 'M');
        System.out.println(bob.getName());
        System.out.println(bob.getAge());        
        
        Human alice = new Human("Alice", 51, 'F');
        System.out.println(alice.getName());
        System.out.println(alice.getAge());
        
        alice.celebrateBirthday();
        System.out.println(alice.getAge());
        System.out.println(bob.getAge());
    }
    
}
