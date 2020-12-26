## Probleme
Imaginez que vous etes en train de creer une application de gestion logistique. La premiere version de votre application ne propose que le transport par camion, la majeure partie de votre code est donc situee dans la classe Camion.

Au bout d’un certain temps, votre application devient populaire et de nombreuses entreprises de transport maritime vous demandent tous les jours d’ajouter la gestion de la logistique maritime dans l’application.

Ajouter un nouveau moyen de transport au programme peut creer des problemes
L’ajout d’une nouvelle classe au programme ne s’avere pas si simple que cela si le reste du code est deja couple aux classes existantes.

C'est super, n'est-ce pas? Mais qu’en est-il du code? La majeure partie est actuellement couplee a la classe Camion. Pour pouvoir ajouter des Bateaux dans l'application, il faudrait revoir la base du code. De plus, si vous decidez plus tard d'ajouter un autre type de transport dans l'application, il faudra effectuer a nouveau ces changements.

Par consequent, vous allez vous retrouver avec du code pas tres propre, rempli de conditions qui modifient le comportement du programme en fonction de la classe des objets de transport.

## Solution
Le patron de conception fabrique vous propose de remplacer les appels directs au constructeur de l’objet (a l’aide de l’operateur new) en appelant une methode fabrique speciale. Pas d’inquietude, les objets sont toujours crees avec l’operateur new, mais l’appel se fait à l’interieur de la methode fabrique. Les objets qu’elle retourne sont souvent appeles produits.