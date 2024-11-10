package code.mentor.crm_personnal.Controllers;

import code.mentor.crm_personnal.Models.Contact;
import code.mentor.crm_personnal.Services.Interface.IContactService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/contacts")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ContactController {
    private final IContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContact();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Long id) {
        return contactService.getContactById(id);
    }

    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        return contactService.createContact(contact);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable Long id, @RequestBody Contact contactDetails) {
       return contactService.updateContact(id, contactDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        return contactService.deleteContact(id);
    }
}
