Compte Client – Application React + API Spring Boot 

Frontend : React + Bootstrap

Backend : Spring Boot + H2 Database
<img width="1809" height="659" alt="Screenshot 2025-12-01 223242" src="https://github.com/user-attachments/assets/d5e2548f-04b6-44bf-829e-dc04c35acc5f" />
.
<img width="1708" height="282" alt="Screenshot 2025-12-01 223255" src="https://github.com/user-attachments/assets/86a7f707-303a-4c10-9d2c-7fe05f915b09" />

📌 Fonctionnalités
✔ Frontend (React)

Affichage de la liste des comptes

Formulaire d’ajout d’un compte

Consommation de l’API REST avec Axios

Interface simple avec Bootstrap

✔ Backend (Spring Boot)

API REST accessible sur http://localhost:8082/api/comptes

Endpoints :

GET /api/comptes → liste des comptes

POST /api/comptes → ajouter un compte

Stockage en base H2 (en mémoire)

CORS activé pour React (localhost:3000)

📦 Installation et exécution
1️⃣ Backend – Spring Boot
🔧 Prérequis

Java 17+

Maven

▶️ Lancement
mvn spring-boot:run


API disponible sur :

http://localhost:8082/api/comptes

🗄 Console H2 (optionnel)
http://localhost:8082/h2-console

2️⃣ Frontend – React
🔧 Prérequis

Node.js

npm

📥 Installation
npm install

▶️ Lancer l’application
npm start


Application disponible sur :

http://localhost:3000

🛠 Technologies utilisées
Backend

Spring Boot

Spring Web

Spring Data JPA

H2 Database

Lombok

Frontend

React

Axios

Bootstrap

📂 Structure du projet
/backend
   ├─ src/main/java/com/example/compteapi/
   │    ├─ controllers
   │    ├─ entities
   │    ├─ repositories
   │    ├─ services
   │    └─ CompteApiApplication.java
   └─ application.properties

/frontend
   ├─ src/components
   │    ├─ CompteList.js
   │    └─ CompteForm.js
   ├─ src/config.js
   └─ App.js



📌 Auteur
Nom: Chaibi Rachid  

Cours : Architecture Microservices : Conception, Déploiement et Orchestration

Date: Decembre 2025 

Encadré par: Pr. Mohamed LACHGAR
