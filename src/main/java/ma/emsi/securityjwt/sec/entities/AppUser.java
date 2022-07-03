package ma.emsi.securityjwt.sec.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity // entite JPA
@Data // Getters et Setters
@AllArgsConstructor // Constructeur avec tous les parametres
@NoArgsConstructor // Constructeur sans parametres
public class AppUser {
    @Id // Clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    /*relation entre la table user et la table role
    EAGER permet de charger les roles quand on fait appel au user
    Il vaut mieux initialiser la collection avec une liste vide quand EAGER*/
    private Collection<AppRole> appRoles = new ArrayList<>();
}
