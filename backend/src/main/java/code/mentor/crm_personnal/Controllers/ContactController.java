package code.mentor.crm_personnal.Controllers;

import code.mentor.crm_personnal.Models.Contact;
import code.mentor.crm_personnal.Services.Interface.IContactServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/contacts")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ContactController {
    private final IContactServiceInterface contactServiceInterface;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactServiceInterface.getAllContact();
    }
}
