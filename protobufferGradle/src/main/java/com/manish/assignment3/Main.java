package com.manish.assignment3;

import com.manish.exceptions.PathNotFoundException;
import com.manish.util.Constants;
import com.manish.util.ErrorMessage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static void printEmployeesData(String[] data) {
        if(data.length <= 0) {
            return;
        }
        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder()
                .setEmployeeID(Integer.parseInt(data[0]))
                .setFirstName(data[1])
                .setLastName(data[2])
                .setEmail(data[3])
                .setDepartment(data[4])
                .setBuildingCode(Integer.parseInt(data[5]))
                .setFloorNumber(Integer.parseInt(data[6]))
                .build();
        System.out.println(person);
    }

    private static void printBuildingData(String[] data) {
        PersonOuterClass.Building building = PersonOuterClass.Building.newBuilder()
                .setBuildingCode(data[0])
                .setTotalFloor(Integer.parseInt(data[1]))
                .setNumCompanies(Integer.parseInt(data[2]))
                .setCafeteriaCode(data[3])
                .build();
        System.out.println(building);
    }

    public static void print(String path, boolean isEmployeeToBePrinted) throws PathNotFoundException, IOException {
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
                if(isEmployeeToBePrinted) {
                    printEmployeesData(data);
                } else {
                    printBuildingData(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileReader != null) {
                fileReader.close();
            }
        }
    }

    public static void printBuildingData() {

    }

    public static void main(String[] args)
            throws PathNotFoundException,
            IOException {
        String employeeDataPath = Constants.EMPLOYEE_DATA_PATH;
        String buildingDataPath = Constants.BUILDING_DATA_PATH;
        print(employeeDataPath, true);
        print(buildingDataPath, false);
    }
}
