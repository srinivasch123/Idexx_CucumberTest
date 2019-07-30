package com.phptravels.Utilities;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

public class TestData {
    @DataProvider
    public Iterator<Object[]> getTestData(){
        ArrayList<Object[]> testData  = TestUtil.getDataFromExcel();
        return testData.iterator();
    }
}
