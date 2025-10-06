OpenClassrooms Course 'Sécurisez votre application web avec Spring Security' - Official GitHub repository
## p1c3me par rapport à p1c3
1. ajout de .gitignore à la racine
    - exclude .ide
    - exluce le repertoire target
2. démarrage OK : mot de passe généré pour le user "d5a7d41a-ea95-4ef2-8653-17d2fa48a57d" :
   
   - Page de login:
   
<img width="208" height="160" alt="image" src="https://github.com/user-attachments/assets/36da160c-b7f7-499f-9081-94d8e08d6e74" />

   - Page de retour si mot de passe KO avec le login user  :  

<img width="200" height="198" alt="image" src="https://github.com/user-attachments/assets/62518add-99b6-4ae2-832d-6a612fdb215a" />

   - Page de retour si mot de passe OK avec le login user :

<img width="285" height="108" alt="image" src="https://github.com/user-attachments/assets/65278742-85ea-480b-a804-bd09688e4b57" />

## p1c5me en parallele avec p1c5
1. Ajout de la classe SpringSecurityConfig , configuration minimale de la Sécurité via Spring Security  
   - qui exige l'authentification pour tout
   - ne précises aucune règle personnalisée (ni authorizeRequests, ni login, logout, etc.).
   - Toutes les requêtes seront autorisées.
   - Il n'y aura pas d'écran de login, ni de mécanisme d’authentification.
   
2. Dès la connexion, on arrive directement à la page http://localhost:8080/login ou à la page http://localhost:8080 :  
    
   <img width="285" height="208" alt="image" src="https://github.com/user-attachments/assets/cc868045-ad9e-43a1-a029-6069ed802e20" />
