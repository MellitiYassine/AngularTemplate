package code.mentor.crm_personnal.Services.Interface;

import code.mentor.crm_personnal.Models.Contact;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IContactService {
    List<Contact> getAllContact();

    ResponseEntity<Contact> getContactById(Long id);

    ResponseEntity<Contact> createContact(Contact contact);

    ResponseEntity<Contact> updateContact(Long id, Contact contactDetails);

    ResponseEntity<Void> deleteContact(Long id);
}
