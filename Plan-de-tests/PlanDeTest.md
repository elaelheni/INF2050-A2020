Liste des exigences
===============
- TP.1 :  Les questoins doivent etre dans l'ordre suivant : `genre, age, valeur d'achat du véhicule, année de fabrication du véhicule, réclamations, si oui : nombre de réclamations ET montant pour chaque réclamation `.
- TP.2 : Les réponses à toutes les questions sont **obligatoires**.
- TP.3 : Le genre d'une personne ne peut prendre que `h` ou `f` comme valuer, sinon la question est posée de nouveau avec un message d'erreur adequat.
- TP.4 : L'age ne peut etre qu'un `entier`, sinon la question est posée de nouveau avec un message d'erreur adequat.
- TP.5 : La valeur d'achat peut etre un `entier` ou un `double`, sinon la question est posée de nouveau avec un message d'erreur adequat.
- TP.6 : L'année de fabrication doit etre un `entier`,  sinon la question est posée de nouveau avec un message d'erreur adequat.
- TP.7 : Les seules réponses accéptées à la question `Avez-vous fait des réclamations d'assurance auto dans les 6 dernières années?` doit etre `oui` ou `non`, sinon la question est posée de nouveau avec un message d'erreur adequat.
- TP.8 : Le nombre de réclamations doit etre un `entier`.
- TP.9 : Le montant de CHAQUE reclamation doit etre un `entier` ou un `double`.
- TP.10 : Une femme de moins de 16 ans n'est pas éligible à l'assurance.
- TP.11 : Un homme de moins de 18 ans n'est pas éligible à l'assurance.
- TP.12 : Une personne agée de 100 ans ou plus n'est pas éligible à l'assurance.
- TP.13 : Une personne possédant un véhicule de plus de 25 ans n'est pas éligible à l'assurance.
- TP.14 : Une personne possédant un véhicule de plus de 100 000$ à l'achat n'est pas éligible à l'assurance.
- TP.15 : Une personne avec 4 réclamations n'est pas éligible à l'assurance.
- TP.16 : Un epersonne avec plus de 35 000$ de réclamations n'est pas éligible à l'assurance.
- TP.17 : Pour un homme de moins de 25 ans le montant de base represente 5% de la valeur d'achat du véhicule.
- TP.18 : Pour toutes les personnes de 75 ans ou plus le montant de base represente 4% de la valeur d'achat du véhicule.
- TP.19 : Pour toutes les autres personnes le montant de base représente 2% de la valeur d'achat du véhicule.
- TP.20 : Pour calculer le montant de l'assurance : `montant de base + (350*nombre de réclamations)`.
- TP.21 : Si la personne a plus de 25 00$ de réclamations une pénalité de 500$ est ajoutée au montant de l'assurance annuelle.
- TP.22 : A la fin de chaque soumission, demander à l'utilisateur si il veut faire une autre soumission. Les seules réponses accéptées sont `oui` et `non`,  sinon la question est posée de nouveau avec un message d'erreur adequat.







Plan de tests
==========

| N.  | Fonctionnalité | Résultat attendu           | Description                   | Données  |                                                                                          
| :----: | :-------------- | :--------------------------- | :----------------------------- | :---------- |
|  C1   |   TP.1 |  Message d'erreur et affichage de la question de nouveau     | Réponse érronée |    `\n` comme réponse à l'une des questions                                  |
|  C2   |  TP.2 | Message d'erreur et affichage de la question de nouveau | Réponse érronée | donner autre que `h` ou `f` comme réponse au genre
| C3    | TP.3 | Message d'erreur et affichage de la question de nouveau | Réponse erronée | Valeur de type incorrect pour l'age
| C4    | TP.4  | Message d'erreur et affichage de la question de nouveau | | Valeur de type incorrect pour le montant d'achat
|  C5   | TP.5 | Message d'erreur et affichage de la question de nouveau| Réponse érronée | Valeur de type incorrect pour le montant d'achat du véhicule |
| C6    | TP.6 | Message d'erreur et affichage de la question de nouveau | Réponse incorrecte  | Valeur de type incorrect pour l'année d'achat du véhicule
| C7    | TP.7 | Message d'erreur et affichage de la question de nouveau  | Reponse incorrecte | `oui` comme reponse a la q. de reclamations au cours des 6 annees + valeur de type incorrect pour le nombre de reclamations
| C8    | TP.8 | Message d'erreur et affichage de la question de nouveau   | Reponse erronée | `oui` comme reponse a la q. de reclamations au cours des 6 annees + valeur de type incorrect pour le montant d'une reclamation
| C9    | TP.9 | Personne non eligible, demander une nouvelle soumission |  Eligibilité | femme de moins de 16 ans + données completes |
| C10  | TP.10| Personne non eligible, demander une nouvelle soumission | Eligibilité | homme de moins de 18 ans + données complete
| C11  | TP.11| Personne non eligible, demander une nouvelle soumission| Eligibilité | personne de 100 ans ou plus + donnees completes|
| C12  | TP.12| Personne non eligible, demander une nouvelle soumission| Eligibilité | véhicule de plus de 25 ans + donnees completes|
| C13  | TP.13| Personne non eligible, demander une nouvelle soumission | Eligibilité | véhicule de + que 100000$ a l'achat + donnees completes |
| C14  | TP.14| Personne non eligible, demander une nouvelle soumission | Eligibilité | +que 4 reclamations + donnees completes |
| C15  | TP.15| Personne non eligible, demander une nouvelle soumission | Eligibilité | +de 35000$ de reclamations + donnees completes |
| C16  | TP.16| Personne non eligible, demander une nouvelle soumission | Eligibilité | +de 35000$ de reclamations + donnees completes |
| C17  | TP.17| Personne eligible, calcul du montant de base, demander une nouvelle soumission | Eligibilité | donnees comletes, homme de moins de 25 ans, moins de 25000$ de reclamation |
| C18  | TP.17| Personne eligible, calcul du montant de base, demander une nouvelle soumission | Eligibilité | donnees comletes, homme de moins de 25 ans, plus de 25000$ de reclamation |
| C18  | TP.18| Personne eligible, calcul du montant de base, demander une nouvelle soumission | Eligibilité | donnees comletes, personne de 75 ans ou plus, moins de 25000$ de reclamation |
| C19  | TP.18| Personne eligible, calcul du montant de base, demander une nouvelle soumission | Eligibilité | donnees comletes, personne de 75 ans ou plus, plus de 25000$ de reclamation |
| C20  | TP.19| Personne eligible, calcul du montant de base, demander une nouvelle soumission | Eligibilité | donnees comletes, personne de moins 75 ans (si homme plus de 25 ans), moins de 25000$ de reclamation |
| C21  | TP.19| Personne eligible, calcul du montant de base, demander une nouvelle soumission | Eligibilité | donnees comletes, personne de moins 75 ans (si homme plus de 25 ans), plus de 25000$ de reclamation |
| C22 | TP.22| Message d'erreur et affichage de la question de nouveau | Réponse erronée | données completes, personne eligible, montant calculé, repondre à la question de la nouvelle soumission par AUTRE que `oui` OU `non` |
| C23 | TP.22| Message d'erreur et affichage de la question de nouveau | Réponse erronée | données completes, personne non eligible, repondre à la question de la nouvelle soumission par AUTRE que `oui` OU `non` |


