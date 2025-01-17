/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class UpdateSubscriptionItemRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5146434662109658641L;
    private String description;
    private String status;
    private UpdatePricingSchemeRequest pricingScheme;
    private String name;
    private Integer cycles;
    private Integer quantity;
    private Integer minimumPrice;
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Pricing scheme
     */
    @JsonGetter("pricing_scheme")
    public UpdatePricingSchemeRequest getPricingScheme ( ) { 
        return this.pricingScheme;
    }
    
    /** SETTER
     * Pricing scheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme (UpdatePricingSchemeRequest value) { 
        this.pricingScheme = value;
    }
 
    /** GETTER
     * Item name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Item name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Number of cycles that the item will be charged
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * Number of cycles that the item will be charged
     */
    @JsonSetter("cycles")
    public void setCycles (Integer value) { 
        this.cycles = value;
    }
 
    /** GETTER
     * Quantity
     */
    @JsonGetter("quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * Quantity
     */
    @JsonSetter("quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * Minimum price
     */
    @JsonGetter("minimum_price")
    public Integer getMinimumPrice ( ) { 
        return this.minimumPrice;
    }
    
    /** SETTER
     * Minimum price
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice (Integer value) { 
        this.minimumPrice = value;
    }
 
}
