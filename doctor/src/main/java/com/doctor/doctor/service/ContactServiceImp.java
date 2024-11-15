package com.doctor.doctor.service;

import com.doctor.doctor.model.Contact;
import com.doctor.doctor.repository.ContactRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class ContactServiceImp implements ContactService{
    private final ContactRepo contactRepo;
    @Autowired
    private EmailService emailService;

    public ContactServiceImp(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    @Override
    public Contact register(Contact contact) {
        Contact contact1=contactRepo.save(contact);
        String userDetails="Subject:"+contact1.getSubject()+
                "\n Email:"+contact1.getEmail()+
                "\n Message:"+contact1.getMessage();
        emailService.sendRegistrationMail("afrozabbassince2002@gmail.com", userDetails);

        return contact1;

    }
}
