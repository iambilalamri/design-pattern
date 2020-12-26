## Probleme
Imaginons la cr�ation d�un simulateur pour un magasin de meubles. Votre code contient les classes suivantes :

1. Une famille de produits appartenant � un m�me th�me : Chaise + Sofa + TableBasse.
2. Plusieurs variantes de cette famille. Par exemple, les produits Chaise + Sofa + TableBasse sont disponibles dans les variantes suivantes : Moderne, Victorien, ArtD�co.


Vous devez trouver une solution pour cr�er des objets individuels (des meubles) et les faire correspondre � d�autres objets de la m�me famille. Les clients sont agac�s lorsqu�ils re�oivent des meubles qui ne se marient pas.

De plus, vous n�avez pas envie de r��crire votre code chaque fois que vous ajoutez de nouvelles familles de produits � votre programme. Les vendeurs de meubles alimentent r�guli�rement leurs catalogues et il n�est pas envisageable de restructurer le code � chaque mise � jour.

## Solution
La premi�re chose que propose la fabrique abstraite est de d�clarer explicitement des interfaces pour chaque produit de la famille de produits (dans notre cas : chaise, sofa, table basse). Toutes les autres variantes de produits peuvent ensuite se servir de ces interfaces. Par exemple, toutes les variantes de chaises peuvent impl�menter l'interface Chaise; toutes les variantes de tables basses peuvent impl�menter TableBasse, etc.