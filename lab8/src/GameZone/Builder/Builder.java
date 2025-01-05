package GameZone.Builder;

import Buildings.Buildings;
import GameZone.*;

/**
 * declares methods to add/reset parameters and build {@link GameZone GameZone}
 */
public interface Builder {
    GameZoneBuilder setWidth(int width);
    GameZoneBuilder setHeight(int height);
    GameZoneBuilder setOwner(String owner);
    GameZoneBuilder reset();

    GameZone build();

}
