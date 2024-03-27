package functionalprogramming.stream;

import functionalprogramming.mock.MockDataGenerator;
import functionalprogramming.mock.StudentDTO;
import functionalprogramming.mock.Students;

import java.util.*;

public class StreamFilterAPI
{
    public static List<Students> studentsList = MockDataGenerator.getInstance().getMockDataList();


    public static void main(String[] args) {
        printYoungStudents();
    }



    public static void printYoungStudents(){
        // 1. Find people who are younger than 18
        // 2. Find the first 20 people who are younger than 18
    }



}
