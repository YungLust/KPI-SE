package GameZone.Builder;

import GameZone.*;

public interface Builder {
    void reset();

    void setWidth(int width);
    void setHeight(int height);
    void setOwner(String owner);

    GameZone build();
}
