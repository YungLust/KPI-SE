package GameZone;

import GameZone.Builder.GameZoneBuilder;

import java.io.*;
import java.util.ArrayList;

public class FileDatabase {
    private File file;
    GameZoneBuilder builder = new GameZoneBuilder();

    public FileDatabase(File file){
        this.file = file;
    }

    public int[] getGameZoneConfig(String configName){

        File configFile = new File(".\\lab8\\src\\"+configName+".cfg");

        try (FileInputStream fin = new FileInputStream(configFile)) {

            InputStreamReader reader = new InputStreamReader(fin);


            int[] result = new int[2];
            int i = reader.read();
            String compositeNumber = "";

            //read from the config file
            while (i!=-1){
                char symbol = (char) i;
                if (symbol == ','){
                    
                    compositeNumber = "";
                }
                else if (symbol == ':'){

                }
                compositeNumber += i;
                i = reader.read();
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("No such config name");
        }
        catch (IOException e) {
            System.out.println("Error: "+e);
        }
        return new int[]{2,2};
    }

    public GameZone retrieveGameZone(String owner){
        return null;
    }



}
