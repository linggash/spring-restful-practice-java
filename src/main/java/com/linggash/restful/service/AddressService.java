package com.linggash.restful.service;

import com.linggash.restful.entity.User;
import com.linggash.restful.model.AddressResponse;
import com.linggash.restful.model.CreateAddressRequest;

public interface AddressService {

    AddressResponse create(User user, CreateAddressRequest request);

    AddressResponse get(User user, String contactId, String addressId);
}
