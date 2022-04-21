/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api;


public class PagarMeConfiguration {
    //The base Uri for API calls
    public static String baseUri = "https://api.pagar.me/core/v5";

    //The username to use with basic authentication
    //TODO: Replace the basicAuthUserName with an appropriate value
    public static String basicAuthUserName = "TODO: Replace";

    //The password to use with basic authentication
    //TODO: Replace the basicAuthPassword with an appropriate value
    public static String basicAuthPassword = "TODO: Replace";


    public static void initPagarMeConfiguration(String username, String password) {
        basicAuthUserName = username;
        basicAuthPassword = password;
    }

}