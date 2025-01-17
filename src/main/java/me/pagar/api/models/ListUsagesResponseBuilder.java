/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class ListUsagesResponseBuilder {
    //the instance to build
    private ListUsagesResponse listUsagesResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListUsagesResponseBuilder() {
        listUsagesResponse = new ListUsagesResponse();
    }

    /**
     * The usage objects
     */
    public ListUsagesResponseBuilder data(List<GetUsageResponse> data) {
        listUsagesResponse.setData(data);
        return this;
    }

    /**
     * Paging object
     */
    public ListUsagesResponseBuilder paging(PagingResponse paging) {
        listUsagesResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListUsagesResponse build() {
        return listUsagesResponse;
    }
}