/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class ListTransfersBuilder {
    //the instance to build
    private ListTransfers listTransfers;

    /**
     * Default constructor to initialize the instance
     */
    public ListTransfersBuilder() {
        listTransfers = new ListTransfers();
    }

    /**
     * The Increments response
     */
    public ListTransfersBuilder data(List<GetTransfer> data) {
        listTransfers.setData(data);
        return this;
    }

    /**
     * Paging object
     */
    public ListTransfersBuilder paging(PagingResponse paging) {
        listTransfers.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListTransfers build() {
        return listTransfers;
    }
}