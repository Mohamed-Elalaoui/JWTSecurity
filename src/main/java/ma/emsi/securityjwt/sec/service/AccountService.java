package ma.emsi.securityjwt.sec.service;

import ma.emsi.securityjwt.sec.entities.AppRole;
import ma.emsi.securityjwt.sec.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appuser); // Ajouter un utilisateur
    AppRole addNewRole(AppRole appRole); // Ajouter un rôle
    void addRoleToUser(String useName, String roleName); //Attribuer un rôle à un utilisateur
    AppUser loadUserByUserName(String username); // Charger l'utilisateur par son nom
    List<AppUser> listUsers(); // Lister les differents utilisateurs
}
