package Database;

import GameZone.GameZone;

import java.io.*;
import java.util.Arrays;

public class ConfigRetriever {
    public int[] getGameZoneConfig(String configName){
        configName = configName.contains(".cfg") ? configName : configName+".cfg";

        File configFile = new File(".\\lab8\\src\\"+configName);

        try (BufferedReader reader = new BufferedReader(new FileReader(configFile))) {
            int[] result = new int[2];
            String line = reader.readLine();

            if (line.contains(":")){
                String line2 = reader.readLine();
                result = getNumbers(line,line2);
            }
            else if (line.contains(",")){
                result = getNumbers(line);
            }
            else {
                System.out.println("Config error. Unable to recognize config data");
            }
            return result;
        }
        catch (FileNotFoundException e) {
            System.out.println("No such config name");
            return null;
        }
        catch (IOException e) {
            System.out.println("Reading error: "+e);
            return null;
        }
    }

    private int[] getNumbers(String line1, String line2){
        int[] result = new int[2];
        try {
            String[] splitLine1 = line1.split(":");
            String[] splitLine2 = line2.split(":");

            if (splitLine1[0].contains("width")){
                result[0] = Integer.parseInt(splitLine1[1]);
                result[1] = Integer.parseInt(splitLine2[1]);
            }
            else if (splitLine1[0].contains("height")){
                result[0] = Integer.parseInt(splitLine2[1]);
                result[1] = Integer.parseInt(splitLine1[1]);
            }
            else {
                throw new NumberFormatException();
            }
//            result[0] = Integer.parseInt(line1.split(":")[1]);
//            result[1] = Integer.parseInt(line2.split(":")[1]);

            System.out.println(Arrays.toString(result));
            return result;
        }
        catch (NumberFormatException e){
            System.out.println("Config error. Unable to recognize config data");
            return null;
        }
    }

    private int[] getNumbers(String line) {
        int[] result = new int[2];
        String[] splitLine = line.split(",");
        result[0] = Integer.parseInt(splitLine[0]);
        result[1] = Integer.parseInt(splitLine[1]);
        return result;
    }

    public GameZone retrieveGameZone(String owner){
        return null;
    }



}
