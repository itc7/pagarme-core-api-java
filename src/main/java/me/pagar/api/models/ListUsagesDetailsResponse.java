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
public class ListUsagesDetailsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5489787417170910522L;
    private List<GetUsageResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The usage objects
     */
    @JsonGetter("data")
    public List<GetUsageResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The usage objects
     */
    @JsonSetter("data")
    public void setData (List<GetUsageResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * paging object
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * paging object
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}