package com.phptravels.Utilities;

import org.testng.annotations.DataProvider;
import com.phptravels.Utilities.Xls_Reader;

import java.util.ArrayList;

public class TestUtil {
    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try{
            reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\TestData.xlsx");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for (int rowNum=2; rowNum<= reader.getRowCount("AssignmentData");rowNum++){
            String location = reader.getCellData("AssignmentData","location", rowNum);
            String noOfAdults = reader.getCellData("AssignmentData","noOfAdults", rowNum);
            String noOfChildren = reader.getCellData("AssignmentData","noOfChildren", rowNum);
            String price = reader.getCellData("AssignmentData","price", rowNum);
            myData.add(new Object[]{location,noOfAdults,noOfChildren,price});
        }
        return myData;
    }
}
