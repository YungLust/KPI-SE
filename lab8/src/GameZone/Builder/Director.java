package GameZone.Builder;

import Database.*;
import GameZone.GameZone;

/**
 * The Director class is responsible for managing the creation of {@link GameZone GameZone} objects.
 * It provides methods to build small, default, and large GameZone instances
 * using predefined configuration files.
 */
public class Director {

    /**
     * The GameZoneBuilder instance used to construct GameZone objects.
     */
    GameZoneBuilder builder;

    /**
     * Constructor to initialize the Director with a new GameZoneBuilder.
     */
    public Director() {
        builder = new GameZoneBuilder();
    }

    /**
     * Builds a large(10x10) GameZone using the "small.cfg" configuration file.
     *
     * @param owner The owner of the GameZone.
     * @return A GameZone instance configured with small dimensions.
     */
    public GameZone buildSmallGameZone(String owner) {
        ConfigRetriever retriever = new ConfigRetriever("small");
        int[] gameZoneData = retriever.getGameZoneConfig();
        return build(gameZoneData, owner);
    }

    /**
     * Builds a default(25x25) GameZone using the "default.cfg" configuration file.
     *
     * @param owner The owner of the GameZone.
     * @return A GameZone instance configured with default dimensions.
     */
    public GameZone buildDefaultGameZone(String owner) {
        ConfigRetriever retriever = new ConfigRetriever("default");
        int[] gameZoneData = retriever.getGameZoneConfig();
        return build(gameZoneData, owner);
    }

    /**
     * Builds a large(100x100) GameZone using the "large.cfg" configuration file.
     *
     * @param owner The owner of the GameZone.
     * @return A GameZone instance configured with large dimensions.
     */
    public GameZone buildLargeGameZone(String owner) {
        ConfigRetriever retriever = new ConfigRetriever("large");
        int[] gameZoneData = retriever.getGameZoneConfig();
        return build(gameZoneData, owner);
    }

    /**
     * Constructs a GameZone using the specified dimensions and owner.
     *
     * @param data  An array containing the width and height of the GameZone.
     * @param owner The owner of the GameZone.
     * @return A constructed GameZone instance.
     */
    private GameZone build(int[] data, String owner) {
        builder.setWidth(data[0]);
        builder.setHeight(data[1]);
        builder.setOwner(owner);
        return builder.build();
    }
}
