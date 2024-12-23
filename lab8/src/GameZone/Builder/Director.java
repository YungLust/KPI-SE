package GameZone.Builder;

import Database.*;
import GameZone.GameZone;

public class Director {
    GameZoneBuilder builder;

    public Director() {
        builder = new GameZoneBuilder();
    }

    public GameZone buildSmallGameZone(String owner) {
        ConfigRetriever retriever = new ConfigRetriever("small");
        int[] gameZoneData = retriever.getGameZoneConfig();
        return build(gameZoneData, owner);
    }

    public GameZone buildDefaultGameZone(String owner) {
        ConfigRetriever retriever = new ConfigRetriever("default");
        int[] gameZoneData = retriever.getGameZoneConfig();
        return build(gameZoneData, owner);
    }

    public GameZone buildLargeGameZone(String owner) {
        ConfigRetriever retriever = new ConfigRetriever("large");
        int[] gameZoneData = retriever.getGameZoneConfig();
        return build(gameZoneData, owner);
    }

    private GameZone build(int[] data, String owner) {
        builder.setWidth(data[0]);
        builder.setHeight(data[1]);
        builder.setOwner(owner);
        return builder.build();
    }
}
