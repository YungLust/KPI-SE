package GameZone.Builder;

import GameZone.GameZone;

public class GameZoneBuilder implements Builder{
    String owner;
    int width;
    int height;

    @Override
    public void reset() {
        width = 0;
        height = 0;
        owner = "";
    }

    @Override
    public GameZone build() {
        return new GameZone(width,height,owner);
    }

    @Override
    public void setOwner(String owner) {
        this.owner = owner;

    }
    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }
}
