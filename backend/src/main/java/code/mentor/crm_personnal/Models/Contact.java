package code.mentor.crm_personnal.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contact {
    @Id
    private Long id;

    private String name;

    private String email;

    private String address;

}
