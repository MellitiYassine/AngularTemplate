package code.mentor.crm_personnal.Repositories;

import code.mentor.crm_personnal.Models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
