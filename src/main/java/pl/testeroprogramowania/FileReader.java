package pl.testeroprogramowania;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private static List<String> fullNameList = new ArrayList<>();
    private static List<String> emailList = new ArrayList<>();
    private static List<String> currentAddressList = new ArrayList<>();
    private static List<String> permanentAddressList = new ArrayList<>();
    private static List<String> firstNamesList = new ArrayList<>();
    private static List<String> lastNamesList = new ArrayList<>();
    private static List<String> ageList = new ArrayList<>();
    private static List<String> salaryList = new ArrayList<>();
    private static List<String> departmentList = new ArrayList<>();
    private static List<String> phoneNumberList = new ArrayList<>();
    private static List<String> dateList = new ArrayList<>();
    private static List<String> subjectList = new ArrayList<>();
    private static List<String> passwordList = new ArrayList<>();

    private static int currentIndexFullName = 0;
    private static int currentIndexEmail = 0;
    private static int currentIndexCurrentAddress = 0;
    private static int currentIndexPermanentAddress = 0;
    private static int currentIndexFirstNames = 0;
    private static int currentIndexLastNames = 0;
    private static int currentIndexAge = 0;
    private static int currentIndexSalary = 0;
    private static int currentIndexDepartment = 0;
    private static int currentIndexPhoneNumber = 0;
    private static int currentIndexDates = 0;
    private static int currentIndexSubject = 0;
    private static int currentIndexPassword = 0;


    public static void fileReader(String fileName, List<String> list) throws IOException {
        ClassLoader classLoader = FileReader.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            if (inputStream == null) {
                throw new IOException("Nieprawidłowe dane/plik" + fileName);
            }
            list.addAll(reader.lines().toList());
        }
    }

    public static synchronized String getNextFullName() throws IOException {
        if (fullNameList.isEmpty()) {
            fileReader("FullNames", fullNameList);
        }
        String nextFullName = fullNameList.get(currentIndexFullName);
        currentIndexFullName = (currentIndexFullName + 1) % fullNameList.size();
        return nextFullName;

    }
    public static synchronized String getNextEmail() throws IOException{
        if(emailList.isEmpty()){
            fileReader("Email", emailList);
        }
        String nextEmail = emailList.get(currentIndexEmail);
        currentIndexEmail = (currentIndexEmail+1)%emailList.size();
        return nextEmail;
    }
    public static synchronized String getNextCurrentAddress()throws IOException{
        if(currentAddressList.isEmpty()){
            fileReader("CurrentAdress", currentAddressList);
        }
        String nextCurrentAddress = currentAddressList.get(currentIndexCurrentAddress);
        currentIndexCurrentAddress = (currentIndexCurrentAddress+1)%currentAddressList.size();
        return nextCurrentAddress;
    }
    public static synchronized String getNextPermanentAddress() throws IOException{
        if(permanentAddressList.isEmpty()){
            fileReader("PermamentAdress", permanentAddressList);
        }
        String nextPermanentAddress = permanentAddressList.get(currentIndexPermanentAddress);
        currentIndexPermanentAddress = (currentIndexPermanentAddress+1)%permanentAddressList.size();
        return nextPermanentAddress;
    }
    public static synchronized String getNextFirstName() throws IOException{
        if(firstNamesList.isEmpty()){
            fileReader("FirstNames", firstNamesList);
        }
        String nextFirstName = firstNamesList.get(currentIndexFirstNames);
        currentIndexFirstNames = (currentIndexFirstNames+1)%firstNamesList.size();
        return nextFirstName;
    }
    public static synchronized String getNextLastName() throws IOException{
        if(lastNamesList.isEmpty()){
            fileReader("LastNames", lastNamesList);
        }
        String nextLastName = lastNamesList.get(currentIndexLastNames);
        currentIndexLastNames = (currentIndexLastNames+1)%lastNamesList.size();
        return nextLastName;
    }
    public static synchronized String getNextAge() throws IOException{
        if(ageList.isEmpty()){
            fileReader("Age", ageList);
        }
        String nextAge = ageList.get(currentIndexAge);
        currentIndexAge = (currentIndexAge+1)%ageList.size();
        return nextAge;
    }
    public static synchronized String getNextSalary() throws IOException{
        if(salaryList.isEmpty()){
            fileReader("Salary", salaryList);
        }
        String nextSalary = salaryList.get(currentIndexSalary);
        currentIndexSalary = (currentIndexSalary+1)%salaryList.size();
        return nextSalary;
    }
    public static synchronized String getNextDepartment() throws IOException{
        if(departmentList.isEmpty()){
            fileReader("Department", departmentList);
        }
        String nextDepartment = departmentList.get(currentIndexDepartment);
        currentIndexDepartment = (currentIndexDepartment+1)%departmentList.size();
        return nextDepartment;
    }
    public static synchronized String getNextPhoneNumber() throws IOException{
        if(phoneNumberList.isEmpty()){
            fileReader("PhoneNumbers", phoneNumberList);
        }
        String nextPhoneNumber = phoneNumberList.get(currentIndexPhoneNumber);
        currentIndexPhoneNumber = (currentIndexPhoneNumber+1)% phoneNumberList.size();
        return nextPhoneNumber;

    }
    public static synchronized String getNextDate() throws IOException{
        if(dateList.isEmpty()){
            fileReader("Dates", dateList);
        }
        String nextDate = dateList.get(currentIndexDates);
        currentIndexDates = (currentIndexDates+1)%dateList.size();
        return nextDate;
    }
    public static synchronized String getNextSubject() throws IOException{
        if(subjectList.isEmpty()){
            fileReader("Subjects", subjectList);
        }
        String nextSubject = subjectList.get(currentIndexSubject);
        currentIndexSubject = (currentIndexSubject+1)%subjectList.size();
        return nextSubject;
    }
    public static synchronized String getNextPassword() throws IOException{
        if(passwordList.isEmpty()){
            fileReader("Passwords", passwordList);
        }
        String nextPassword = passwordList.get(currentIndexPassword);
        currentIndexPassword = (currentIndexPassword+1)%passwordList.size();
        return nextPassword;
    }
}
