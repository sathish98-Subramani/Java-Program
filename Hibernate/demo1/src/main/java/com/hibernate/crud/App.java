package com.hibernate.crud;

import com.hibernate.crud.service.OwnerService;
import com.hibernate.crud.service.impl.OwnerServiceImpl;
import com.hibernate.crud.util.InputUtil;

import java.util.Scanner;

public class App {
    private OwnerService ownerService;

    public static void main(String[] args) {
        App app=new App();
        app.run();

    }
    public void run(){

        ownerService=new OwnerServiceImpl();
        try(Scanner sc=new Scanner(System.in)){

            do{
                InputUtil.menus();
                int option=InputUtil.getInput(sc);
                switch (option){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Invalid Option");
                }

            }while(InputUtil.wantToContinue(sc));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}