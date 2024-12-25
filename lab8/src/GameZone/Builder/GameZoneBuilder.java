package GameZone.Builder;

import GameZone.GameZone;

/**
 * Builder class to create {@link GameZone GameZone} objects
 */
public class GameZoneBuilder implements Builder{
    String owner;
    int width;
    int height;

    /**
     *  sets all the zone`s variables to empty values
     */
    @Override
    public void reset() {
        width = 0;
        height = 0;
        owner = "";
    }

    /**
     * Constructs a GameZone using the values that specified in other methods
     * @return GameZone object
     */
    @Override
    public GameZone build() {
        return new GameZone(width,height,owner);
    }

    /**
     * sets owner for GameZone
     * @param owner is an owner of GameZone
     */
    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * sets width for GameZone
     * @param width is width of GameZone
     */
    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * sets height for GameZone
     * @param height is height of GameZone
     */
    @Override
    public void setHeight(int height) {
        this.height = height;
    }
}
