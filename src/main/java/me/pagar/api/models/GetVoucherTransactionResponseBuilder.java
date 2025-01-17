/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetVoucherTransactionResponseBuilder 
        extends GetTransactionResponseBuilder {
    //the instance to build
    private GetVoucherTransactionResponse getVoucherTransactionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetVoucherTransactionResponseBuilder() {
        getVoucherTransactionResponse = new GetVoucherTransactionResponse();
    }

    /**
     * Text that will appear on the voucher's statement
     */
    public GetVoucherTransactionResponseBuilder statementDescriptor(String statementDescriptor) {
        getVoucherTransactionResponse.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Acquirer name
     */
    public GetVoucherTransactionResponseBuilder acquirerName(String acquirerName) {
        getVoucherTransactionResponse.setAcquirerName(acquirerName);
        return this;
    }

    /**
     * Acquirer affiliation code
     */
    public GetVoucherTransactionResponseBuilder acquirerAffiliationCode(String acquirerAffiliationCode) {
        getVoucherTransactionResponse.setAcquirerAffiliationCode(acquirerAffiliationCode);
        return this;
    }

    /**
     * Acquirer TID
     */
    public GetVoucherTransactionResponseBuilder acquirerTid(String acquirerTid) {
        getVoucherTransactionResponse.setAcquirerTid(acquirerTid);
        return this;
    }

    /**
     * Acquirer NSU
     */
    public GetVoucherTransactionResponseBuilder acquirerNsu(String acquirerNsu) {
        getVoucherTransactionResponse.setAcquirerNsu(acquirerNsu);
        return this;
    }

    /**
     * Acquirer authorization code
     */
    public GetVoucherTransactionResponseBuilder acquirerAuthCode(String acquirerAuthCode) {
        getVoucherTransactionResponse.setAcquirerAuthCode(acquirerAuthCode);
        return this;
    }

    /**
     * acquirer_message
     */
    public GetVoucherTransactionResponseBuilder acquirerMessage(String acquirerMessage) {
        getVoucherTransactionResponse.setAcquirerMessage(acquirerMessage);
        return this;
    }

    /**
     * Acquirer return code
     */
    public GetVoucherTransactionResponseBuilder acquirerReturnCode(String acquirerReturnCode) {
        getVoucherTransactionResponse.setAcquirerReturnCode(acquirerReturnCode);
        return this;
    }

    /**
     * Operation type
     */
    public GetVoucherTransactionResponseBuilder operationType(String operationType) {
        getVoucherTransactionResponse.setOperationType(operationType);
        return this;
    }

    /**
     * Card data
     */
    public GetVoucherTransactionResponseBuilder card(GetCardResponse card) {
        getVoucherTransactionResponse.setCard(card);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetVoucherTransactionResponse build() {
        return getVoucherTransactionResponse;
    }
}