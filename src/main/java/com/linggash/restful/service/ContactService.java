package com.linggash.restful.service;

import com.linggash.restful.entity.User;
import com.linggash.restful.model.ContactResponse;
import com.linggash.restful.model.CreateContactRequest;
import com.linggash.restful.model.UpdateContactRequest;

public interface ContactService {

    ContactResponse create(User user, CreateContactRequest request);

    ContactResponse get(User user, String id);

    ContactResponse update(User user, UpdateContactRequest request);
}
