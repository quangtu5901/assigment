

package model;

/**
 *
 * @author thand
 */
public class ticker {
    private String name; 
    private String price;
    private String changerate;
    private String changeprice;
    private String volume;

    /**
     *
     * @param name
     * @param price
     * @param changerate
     * @param changeprice
     * @param volume
     */
    public ticker(String name, String price, String changerate, String changeprice, String volume) {
        this.name = name;
        this.price = price;
        this.changerate = changerate;
        this.changeprice = changeprice;
        this.volume = volume;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public String getChangerate() {
        return changerate;
    }

    /**
     *
     * @param changerate
     */
    public void setChangerate(String changerate) {
        this.changerate = changerate;
    }

    /**
     *
     * @return
     */
    public String getChangeprice() {
        return changeprice;
    }

    /**
     *
     * @param changeprice
     */
    public void setChangeprice(String changeprice) {
        this.changeprice = changeprice;
    }

    /**
     *
     * @return
     */
    public String getVolume() {
        return volume;
    }

    /**
     *
     * @param volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "ticker{" + "name=" + name + ", price=" + price + ", changerate=" + changerate + ", changeprice=" + changeprice + ", volume=" + volume + '}';
    }

    
}
