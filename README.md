# TpSpring5
 Spring tp note

# Consultez le projet par ici : http://localhost:8080/greeting

![Capture2](https://user-images.githubusercontent.com/76172733/103336452-843c3000-4a78-11eb-8678-6e0065ecdb1a.PNG)


# ETAPE 5 :
             # Les dépendances :



Spring : Spring est un framwork J2EE MVC

JPA : Java Persistance API est une interface de programmation permettent d'organiser les données relationnales avec des annotations

Hibernate : Permet une connexion et une relation avec la bdd plus facilement

H2 : un système de gestion de base de données relationnelle chargé en mémoire

DevTools : offre des outils en plus pour le developpement

Thymeleaf : Moteur de template

# ETAPE 13 :

-1- @GetMapping("/greeting")

-2- return "greeting";

-3- @RequestParam(name="nameGET", required=false, defaultValue="World")

# ETAPE 17 :

l'apparition d'un tableau adress article contient les colonnnes ID / CONTENT / CREATION .


# ETAPE 18 :

Hibernate gere les persistances d'objets en base de donne : créer des base de donneés suivant des modéls .
Exactement , Hibernate permet grâce aux annotations d'acceder a la base de donnée et le créer puisque il n'existe pas.

# ETAPE 20 :

Oui , on voit que tous ce qui a on a la table adresse est ajouté dans le fichier IData.sql.

# ETAPE 23 :

"@Autowired"annotation qui nous permet de faire l’injection de dépendances entre les beans.

# ETAPE 30 :
Le but de Bootstrap est de permettre, par exemple, de rendre facilement un site responsive design sans avoir besoin de coder toute la partie CSS.
Le Framework propose des modèles en HTML, CSS et JavaScript, pour mettre en page des composants de navigations, des boutons, des images, des blocs. Il définit un système de grille qui lui est propre
Du coup , Simplment pour travailler avec boostrap j'ai juste ajouté juste cette ligne ( suivant la documentation de boostrap):

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

RQ : Ji'utilisé la dérniere version de boostrap.


# P2 : ETAPE 6 :

1-Oui  necessité  d'avoir le clé ( gratuit) 


2-L'url :  http://api.openweathermap.org/data/2.5/weather


3-Il faut utliser GET


4- api.openweathermap.org/data/2.5/weather?param=val,... + liste de paramétres


5-temperature sur api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}

 -meteo sur api.openweathermap.org/data/2.5/forecast?lat={lat}&lon={lon}&appid={API key}
 
 ![Capture](https://user-images.githubusercontent.com/76172733/103336325-214a9900-4a78-11eb-9a0e-b4022d7c6da2.PNG)

# LIEN GIT :

https://github.com/radhwenkkkkkk/TpSpring5


