package com.example.gov.tests;

import com.example.gov.model.Reception;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {


    @DataProvider
    public Iterator<Object[]>receptionFromCSV() throws IOException {
        List<Object[]> list  = new ArrayList<>();
        BufferedReader reader = new BufferedReader
                (new FileReader(new File("src/test/resources/reception.csv")));
        String line =  reader.readLine();
        while (line!=null){
            String[] split = line.split(",");
            list.add(new Object[]{new Reception().setDepartment(split[0])
                    .setCity(split[1])});
            line =   reader.readLine();
        }

        return list.iterator();
    }




}
