package code.mentor.crm_personnal.Services;

import code.mentor.crm_personnal.Models.Contact;
import code.mentor.crm_personnal.Repositories.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class IContactService implements code.mentor.crm_personnal.Services.Interface.IContactService {

    private  ContactRepository contactRepository;
    @Override
    public List<Contact> getAllContact(){
        return contactRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public ResponseEntity<Contact> getContactById( Long id) {
        Optional<Contact> contact = contactRepository.findById(id);
        return contact.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @Override
    public ResponseEntity<Contact> createContact(Contact contact) {
        Contact savedContact = contactRepository.save(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedContact);
    }

    @Override
    public ResponseEntity<Contact> updateContact(Long id, Contact contactDetails) {
        Optional<Contact> contact = contactRepository.findById(id);

        if (contact.isPresent()) {
            Contact updatedContact = contact.get();
            updatedContact.setName(contactDetails.getName());
            updatedContact.setEmail(contactDetails.getEmail());
            updatedContact.setAddress(contactDetails.getAddress());
            contactRepository.save(updatedContact);
            return ResponseEntity.ok(updatedContact);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @Override
    public ResponseEntity<Void> deleteContact(Long id) {
        if (contactRepository.existsById(id)) {
            contactRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
