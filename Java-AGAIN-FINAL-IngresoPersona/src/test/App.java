package test;

import repository.OptionRepository;

public class App {
    public static void main(String[] args) throws Exception {
        OptionRepository or=new OptionRepository();

        System.out.println("Hello, World!");

        or.switchesMainMenu();        
    }
}