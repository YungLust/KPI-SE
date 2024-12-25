package GameZone.Builder;

import GameZone.*;

/**
 * declares methods to add/reset parameters and build {@link GameZone GameZone}
 */
public interface Builder {
    void setWidth(int width);
    void setHeight(int height);
    void setOwner(String owner);

    GameZone build();
    void reset();
}
