package com.manish.assignment3;

import com.manish.exceptions.PathNotFoundException;
import com.manish.util.Constants;
import com.manish.util.ErrorMessage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
            throws PathNotFoundException,
            IOException {

        String path = Constants.path;
        FileReader fileReader = null;
       try {
           File file = new File(path);
           if(! file.exists()) {
               throw new PathNotFoundException(ErrorMessage.getPathNotFoundMessage(path));
           }
           fileReader = new FileReader(file);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line = "";
           boolean isFirstRecord = true;
           while((line = bufferedReader.readLine()) != null) {
               if(isFirstRecord) {
                   isFirstRecord = false;
                   continue;
               }
               String[] data = line.split(Constants.DELIMETER);
               PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder()
                       .setName(data[0])
                       .setAge(Integer.parseInt(data[1]))
                       .setCompany(data[2])
                       .setBuildingCode(Integer.parseInt(data[3]))
                       .setPhoneNumber(data[4])
                       .setAddress(data[5])
                       .build();
               System.out.println(person);
           }
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if(fileReader != null) {
               fileReader.close();
           }
       }
    }
}
