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
   
2. Dès la connexion, on arrive directement à la page http://localhost:8080/login ou à la page http://localhost:8080/  :
    
   <img width="285" height="208" alt="image" src="https://github.com/user-attachments/assets/cc868045-ad9e-43a1-a029-6069ed802e20" />

## p1c51me extension
1. ajout dans SpringSecurityConfig "formLogin(Customizer.withDefaults())" pour avoir la page login par défaut.
   
   Connexion http://localhost:8080/login  
    <img width="258" height="173" alt="image" src="https://github.com/user-attachments/assets/8a669cbd-cfad-4334-b086-881f25074a98" />

## p1c6me en parrallele avec p1c6  
0. Modifier la classe SpringSecurityConfig : roles user et admin, créer les users user et admin  
1. Ajout d'une classe controller LoginController  
2. connexion user/user => "Whitelabel Error Page"  et modifier l'url  
   21. en  http://localhost:8080/user => affichage navigateur : "Welcome, User"  
   22. en http://localhost:8080/admin => affichage navigateur : "Whitelabel Error Page"  
   23. en http://localhost:8080/logout (natif) => pour se déconnecter  
3. connexion admin/admin => "Whitelabel Error Page"  et modifier l'url  
   31. en http://localhost:8080/admin => affichage navigateur : "Welcome, Admin"  
   32. en http://localhost:8080/user => affichage navigateur : "Welcome, User"  
   33. Conclusion : le role fonctionne bien . L'utilisateur peut accéder à la page de "user" en plus de la sienne.  
   Test avec le login "user":  
   <img width="192" height="173" alt="image" src="https://github.com/user-attachments/assets/0e1dc794-6ef1-49cf-b0ef-42947a1747e5" />
   <img width="284" height="103" alt="image" src="https://github.com/user-attachments/assets/06462a32-97e3-4808-a164-0a6261473b1b" />
   <img width="224" height="58" alt="image" src="https://github.com/user-attachments/assets/d816c01a-8540-412e-ad35-64715d7fee60" />
   <img width="140" height="55" alt="image" src="https://github.com/user-attachments/assets/5a95cded-a2ee-4ceb-8019-8a683c2df1e1" />

