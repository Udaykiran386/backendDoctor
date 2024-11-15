package com.doctor.doctor.controller;

import com.doctor.doctor.model.Contact;
import com.doctor.doctor.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/contact/")


public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("register")
    public ResponseEntity<Contact> register(@RequestBody Contact contact){
        return ResponseEntity.status(HttpStatus.OK).body(contactService.register(contact));
    }

}
