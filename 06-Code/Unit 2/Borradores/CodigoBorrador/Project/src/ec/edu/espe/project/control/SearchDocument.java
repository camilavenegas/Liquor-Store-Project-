/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.control;

import ec.edu.espe.project.model.BeverageData;
import java.io.*;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class SearchDocument {

    String fileName;

    File file;
    boolean answer = true;

    public SearchDocument(String fileName) {
        this.fileName = fileName;
        createFile();
    }

    public void createFile() {
        file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    public void writeFile(BeverageData userToSave) {
        try (FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter pw = new PrintWriter(fileWriter)) {
            pw.println(userToSave.fullName + "," + userToSave.mail + ","
                    + userToSave.id + "," + userToSave.age);
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
            answer = false;
        }
    }

    public boolean findUser(String seeker) {
        boolean finder = false;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] contacto = line.split(",");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return finder;
    }

    public boolean findPassword(String seeker) {
        boolean correctPass = false;

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] contact = line.split(",");
                if (contact[1].equals(seeker)) {
                    correctPass = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return correctPass;
    }
    
    public boolean readFile(){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String stringData = "";
            while (stringData != null){
                System.out.println(stringData);
                stringData = bufferReader.readLine();
            }
        }catch (IOException e){
            System.out.println(e);
            answer = false;
        }
        return answer;
    }   
    
    public void deleteFile(){
        if(!file.exists()){
            file.delete();
            System.out.println("The file" + file + "was deleted");
        }else {
            System.out.println("The file" + file + "doesnt't exist");
        }
    }
}

