package Database;

import java.io.*;

/**
 * The ConfigRetriever class is responsible for reading configuration files and extracting game zone settings.
 * It supports configurations specified either as comma-separated values (e.g., "25,25")
 * or as key-value pairs separated by a colon (:), e.g.: <br>width:25<br>height:25<br>
 */
public class ConfigRetriever {
    String configName;
    File configFile;

    /**
     * Constructor to initialize the ConfigRetriever with a given configuration file name.
     * method {@link #changeConfig(String) changeConfig} is used not to repeat code
     *
     * @param configName The name of the configuration file.
     */
    public ConfigRetriever(String configName){
        changeConfig(configName);
    }

    /**
     * Reads and retrieves game zone configuration from the file.
     * The configuration may be specified in one of the following formats:
     * - Colon-separated key-value pairs (e.g.: <br>width:25<br>height:25<br>
     * - Comma-separated values (e.g., "25,25").
     *
     * @return An array of two integers representing width and height.
     *         Returns {@code null} if the configuration file is not found or contains invalid data.
     */
    public int[] getGameZoneConfig(){
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
            System.out.println("No such config name: "+configFile.getAbsolutePath());
            return null;
        }
        catch (IOException e) {
            System.out.println("Reading error: "+e);
            return null;
        }
    }

    /**
     * Parses configuration data from two lines which are colon-separated (e.g., "width:25 &lt\n&gt height:25").
     *
     * @param line1 The first line of configuration.
     * @param line2 The second line of configuration.
     * @return An array of two integers representing width and height.
     */
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

            return result;
        }
        catch (NumberFormatException e){
            System.out.println("Config error. Unable to recognize config data");
            return null;
        }
    }

    /**
     * Parses configuration data from a single comma-separated line (e.g., "25,25").
     *
     * @param line The line containing comma-separated values.
     * @return An array of two integers representing width and height.
     */
    private int[] getNumbers(String line) {
        int[] result = new int[2];
        String[] splitLine = line.split(",");
        result[0] = Integer.parseInt(splitLine[0]);
        result[1] = Integer.parseInt(splitLine[1]);
        return result;
    }

    /**
     * Changes the current configuration file to a new one.
     * If the provided name does not include the ".cfg" extension, it will be appended automatically.
     *
     * @param configName The new configuration file name. It can be either config-name.cfg either config-name
     */
    public void changeConfig(String configName){
        this.configName = configName.contains(".cfg") ? configName : (configName+".cfg");

        this.configFile = new File(".\\lab8\\src\\"+this.configName);
    }
}
