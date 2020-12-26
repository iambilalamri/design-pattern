## Probleme
Imaginons la création d’un simulateur pour un magasin de meubles. Votre code contient les classes suivantes :

1. Une famille de produits appartenant à un même thème : Chaise + Sofa + TableBasse.
2. Plusieurs variantes de cette famille. Par exemple, les produits Chaise + Sofa + TableBasse sont disponibles dans les variantes suivantes : Moderne, Victorien, ArtDéco.


Vous devez trouver une solution pour créer des objets individuels (des meubles) et les faire correspondre à d’autres objets de la même famille. Les clients sont agacés lorsqu’ils reçoivent des meubles qui ne se marient pas.

De plus, vous n’avez pas envie de réécrire votre code chaque fois que vous ajoutez de nouvelles familles de produits à votre programme. Les vendeurs de meubles alimentent régulièrement leurs catalogues et il n’est pas envisageable de restructurer le code à chaque mise à jour.

## Solution
La première chose que propose la fabrique abstraite est de déclarer explicitement des interfaces pour chaque produit de la famille de produits (dans notre cas : chaise, sofa, table basse). Toutes les autres variantes de produits peuvent ensuite se servir de ces interfaces. Par exemple, toutes les variantes de chaises peuvent implémenter l'interface Chaise; toutes les variantes de tables basses peuvent implémenter TableBasse, etc.