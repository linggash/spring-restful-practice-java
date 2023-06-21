package com.linggash.restful.service;

import com.linggash.restful.entity.User;
import com.linggash.restful.model.ContactResponse;
import com.linggash.restful.model.CreateContactRequest;
import com.linggash.restful.model.SearchContactRequest;
import com.linggash.restful.model.UpdateContactRequest;
import org.springframework.data.domain.Page;

public interface ContactService {

    ContactResponse create(User user, CreateContactRequest request);

    ContactResponse get(User user, String id);

    ContactResponse update(User user, UpdateContactRequest request);

    void delete(User user, String contactId);

    Page<ContactResponse> search(User user, SearchContactRequest request);
}
