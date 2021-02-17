/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CreateEmvDataDecryptRequestBuilder {
    //the instance to build
    private CreateEmvDataDecryptRequest createEmvDataDecryptRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateEmvDataDecryptRequestBuilder() {
        createEmvDataDecryptRequest = new CreateEmvDataDecryptRequest();
    }

    /**
     * Emv Decrypt cipher type
     */
    public CreateEmvDataDecryptRequestBuilder cipher(String cipher) {
        createEmvDataDecryptRequest.setCipher(cipher);
        return this;
    }

    /**
     * Dukpt data request
     */
    public CreateEmvDataDecryptRequestBuilder dukpt(CreateEmvDataDukptDecryptRequest dukpt) {
        createEmvDataDecryptRequest.setDukpt(dukpt);
        return this;
    }

    /**
     * Encrypted tags list
     */
    public CreateEmvDataDecryptRequestBuilder tags(List<CreateEmvDataTlvDecryptRequest> tags) {
        createEmvDataDecryptRequest.setTags(tags);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateEmvDataDecryptRequest build() {
        return createEmvDataDecryptRequest;
    }
}