package lab3;

import java.util.Objects;

/**
 * <strong>Create PickingOrder</strong>
 * <p>
 * Define a class named <i>PickingOrder</i>. Declare a private string field that
 * holds the apple type to indicate whether the picking order for
 * <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
 * <p>
 * Also, declare a private string field that hold the bag size to indicate
 * the bag size. You have the following bag sizes   <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong>.
 */
public class PickingOrder {


    /**
     * The picking order appletype  can be one of the following choices
     * <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     * <p>
     * The default value is <strong> <code>Cortland</code></strong>
     * </p>
     */
    // ALREADY IMPLEMENTED; DO NOT MODIFY
    private String appleType;

    /**
     * The bag size can be one of the following choice
     * <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong>.
     * <p>
     * The default value is <strong> <code>TenLB</code></strong>
     * </p>
     */
    // ALREADY IMPLEMENTED; DO NOT MODIFY
    private String bagSize;


    /**
     * Default constructor set the attributes to default values
     */
    public PickingOrder() {
        // TODO: Your implementation starts here
        appleType = "Cortland";
        bagSize = "TenLB";
    }

    /**
     * Constructor create a new PickingOrder by assigned appleType and bagSize  attributes.
     *
     * @param appleType the apple type
     * @param bagSize   the bag size
     *                  <p><strong> Precondition </strong></p>
     *                  <p>The apple type should be one of the following choices
     *                  <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     *                  <p> and The bag size should be one of the following choices
     *                  <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong>.</p>
     * @throws IllegalArgumentException <p> if the apply type is not one of the following choices
     *                                  <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     *                                  or if the bag size is not one of the following choices
     *                                  <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong> </p>
     */

    public PickingOrder(String appleType, String bagSize) {

        // TODO: Your implementation starts
        this.appleType = appleType;
        this.bagSize = bagSize;

        if (appleType != "McIntosh" & appleType != "Cortland" & appleType != "Empire" & appleType != "Gala" & appleType != "Honeycrisp"){
            throw new IllegalArgumentException();
        }

        if (bagSize != "FiveLB" & bagSize != "TenLB" & bagSize != "FifteenLB" & bagSize != "TwentyLB"){
            throw new IllegalArgumentException();
        }
    }

    /**
     * Copy constructor Set the apple type and bag size by copying another picking
     * order attributes
     *
     * @param otherOrder another picking  order
     */
    public PickingOrder(PickingOrder otherOrder) {

        // TODO: Your implementation starts here
        this.appleType = otherOrder.appleType;
        this.bagSize = otherOrder.bagSize;
    }


    /**
     * Sets the apple type of this picking order object to <strong>
     * <code>newAppleType</code></strong>.
     *
     * @param newAppleType the new apple type
     *                     <p><strong> Precondition </strong></p>
     *                     <p>The apple type should be one of the following choices
     *                     <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     * @throws IllegalArgumentException <p> if the apply type is not one of the following choices
     *                                  <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     */

    public void setAppleType(String newAppleType) {

        // TODO: Your implementation starts here
        this.appleType = newAppleType;

        if (newAppleType != "McIntosh" & newAppleType != "Cortland" & newAppleType != "Empire" & newAppleType != "Gala" & newAppleType != "Honeycrisp"){
            throw new IllegalArgumentException();
        }
    }

    /**
     * Sets the bag size of this apple order object to
     * <strong><code>newBagSize</code></strong>.
     *
     * @param newBagSize the new bag size
     *                   <p><strong> Precondition </strong></p>
     *                   <p> The bag size should be one of the following choices
     *                   <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong>.</p>
     * @throws IllegalArgumentException <p>if the bag size is not one of the following choices
     *                                  <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong> </p>
     */


    public void setBagSize(String newBagSize) {

        // TODO: Your implementation starts here
        this.bagSize = newBagSize;
        if (newBagSize != "FiveLB" & newBagSize != "TenLB" & newBagSize != "FifteenLB" & newBagSize != "TwentyLB"){
            throw new IllegalArgumentException();
        }
    }


    /**
     * Get the appleType value for this picking  order
     *
     * @return the appleType  value for this picking  order
     */
    public String getAppleType() {

        // TODO: Your implementation starts here
        return appleType;
    }

    /**
     * Get the bagSize value for this picking  order
     *
     * @return the appleSize  value for this picking order
     */
    public String getBagSize() {

        // TODO: Your implementation starts here
        return bagSize;
    }


    /**
     * This method calculate the picking Order price.
     * <p>
     * After determining the apple type and bag size, the picking  order price (in dollars) can be calculated
     * according to the following rules:
     * <p> {@code  Order cost = 8 + (apple type cost)*1.2 + (bag size cost) * 2.5}  </p>
     * The following parameters for apple type and bag size:
     * <p>
     * apple type
     * </p>
     * <strong><code>McIntosh</code> : 9$ ,
     * <code>Cortland</code>: 5$,
     * <code>Empire</code>: 8$,
     * <code>Gala</code>: 6$ or
     * <code>Honeycrisp</code>: 15$</strong>.
     *
     * <p>
     * bag size
     * </p>
     * <p>
     * <code>FiveLB</code>:  6$, <code>TenLB</code>: 10.45$, <code>FifteenLB</code>: 14.5$
     * , <code>TwentyLB</code>: 15$
     * </p>
     *
     * @return The picking order  price in dollar rounded to one decimal place.
     */
    public double getPickingOrderPrice() {
        // TODO: Your implementation starts here

        double appleCost = 0;
        double bagCost = 0;
        if (getAppleType() == "McIntosh"){
            appleCost = 9;
        } else if (getAppleType() == "Cortland"){
            appleCost = 5;
        } else if (getAppleType() == "Empire"){
            appleCost = 8;
        } else if (getAppleType() == "Gala"){
            appleCost = 6;
        } else if (getAppleType() == "Honeycrisp"){
            appleCost = 15;
        }

        if (getBagSize() == "FiveLB"){
            bagCost = 6;
        } else if (getBagSize() == "TenLB"){
            bagCost = 10.45;
        } else if (getBagSize() == "FifteenLB"){
            bagCost = 14.5;
        } else if (getBagSize() == "TwentyLB"){
            bagCost = 15;
        }

        double orderCost =  8 + (appleCost)*1.2 + (bagCost) * 2.5;
        double result = (double) Math.round(orderCost*10)/10;
        return result;
    }


    // ALREADY IMPLEMENTED; DO NOT MODIFY
    @Override
    public String toString() {
        // ALREADY IMPLEMENTED; DO NOT MODIFY
        return "Picking Order with apple Type (" + appleType + ") and bag Size (" + bagSize + ")";
    }
}
