package code.mentor.crm_personnal.Services;

import code.mentor.crm_personnal.Models.Contact;
import code.mentor.crm_personnal.Repositories.ContactRepository;
import code.mentor.crm_personnal.Services.Interface.IContactServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IContactService implements IContactServiceInterface {

    private  ContactRepository contactRepository;
    @Override
    public List<Contact> getAllContact(){
        List<Contact> contacts = contactRepository.findAll();
        return contacts;
    }
}
