package com.petstore.openapi.client;

import com.petstore.openapi.ApiClient;
import com.petstore.openapi.ApiException;
import com.petstore.openapi.api.PetsApi;

public class Main {
    public static void main(String[] args) throws ApiException {
        PetsApi petsApi = new PetsApi(new ApiClient());
        petsApi.setCustomBaseUrl("http://localhost:8080/v1");
        petsApi.listPets(2);
    }
}