package com.hibernate.crud.util;

import com.hibernate.crud.dto.OwnerDTO;
import com.hibernate.crud.enums.Gender;
import com.hibernate.crud.enums.PetType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class InputUtil {
    public  static void menus(){
        System.out.println("Welcome To Pet Shop");
        System.out.println("1.Save Owner");
        System.out.println("2.Find Owner");
        System.out.println("3.Update Owner");
        System.out.println("4.Delete Owner");
        System.out.println("5.Find All Owner");
    }
    public static int getInput(Scanner sc)
    {
        int option=sc.nextInt();
        if(option==1 || option==2 || option==3 || option==4 || option==5){
            return option;
        }else{
            return getInput(sc);
        }

    }
    public static boolean wantToContinue(Scanner sc){
        System.out.println("Y TO CONTINUE N TO EXIT");
        char option=sc.next().toUpperCase().charAt(0);
        return option=='Y';
    }
    public static OwnerDTO getOwner(Scanner sc){
        OwnerDTO ownerDTO=new OwnerDTO();
        System.out.println("Enter Owner ID");
        int id= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter First Name");
        String firstName=sc.nextLine();

        System.out.println("Enter Last Name");
        String lastName=sc.nextLine();

        System.out.println("Enter the Gender:"+ Arrays.asList(Gender.values()));
        String gender =sc.nextLine();

        System.out.println("Enter the city");
        String city=sc.nextLine();

        System.out.println("Enter state");
        String state=sc.nextLine();

        System.out.println("Enter mobile number");
        String mobileNumber=sc.nextLine();

        System.out.println("Enter email id");
        String emailId=sc.nextLine();

        System.out.println("Enter pet Id");
        int petId=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Pet Name");
        String petName=sc.nextLine();

        System.out.println("Enter Pet Birth Date");
        String petBirthDate=sc.nextLine();

        System.out.println("Enter Pet Gender"+Arrays.asList(Gender.values()));
        String petGender=sc.nextLine();

        System.out.println("Enter Pet Type"+Arrays.asList(PetType.values()));
        String petType=sc.nextLine();

        try{
            ownerDTO.setId(id);
            ownerDTO.setFirstName(firstName);
            ownerDTO.setLastName(lastName);
            ownerDTO.setGender(Gender.valueOf(gender));
            ownerDTO.setCity(city);
            ownerDTO.setState(state);
            ownerDTO.setMobileNumber(mobileNumber);
            ownerDTO.setEmailId(emailId);
            ownerDTO.setPetId(petId);
            ownerDTO.setPetName(petName);
            ownerDTO.setPetBirthDate(convertDate(petBirthDate));
            ownerDTO.setPetGender(Gender.valueOf(petGender));
            ownerDTO.setPetType(PetType.valueOf(petType));
        }catch(Exception e){
            System.out.println("Enter Valid Details");
            return getOwner(sc);
        }
        return ownerDTO;
    }
    public static LocalDate convertDate(String petBirthDate){
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(petBirthDate,format);

    }
}