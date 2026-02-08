1. Suppose you are compiling statistics on the age structure of students in our group. You should then draw 1000 age values and these should be distributed in the same way as the age distribution of the students in the group. How do you do it? Explain the algorithm in enough details to be able to program it directly. Take an idea/model from the example on the previous section 'Your own distribution'.

Ensin määritellään opiskelijoiden ikäjakauma prosentteina.
Esimerkiksi: 20 v. - 16%, 21 v. - 18%, 22 - 18% j.n.e.


Sitten prosentit muutetaan kumulatiivisiksi väleiksi (CDF) välillä 1–100.
Enemmän CFD:sta: [https://en.wikipedia.org/wiki/Cumulative_distribution_function](https://en.wikipedia.org/wiki/Cumulative_distribution_function)


Ensimmäinen ikä saa välin 1–p1.
Toinen ikä saa välin p1+1 – (p1+p2).
Kolmas ikä saa välin (p1+p2)+1 – (p1+p2+p3) j.n.e.
Näin jatketaan, kunnes koko väli 1–100 on käytetty.


Tämän jälkeen toistetaan 1000 kertaa:
arvotaan satunnainen luku väliltä 1-100,
katsotaan taulukosta, mihin väliin luku osuu,
valitaan sitä vastaava ikä.

Joka kerta, kun ikä valitaan, kasvatetaan kyseisen iän laskuria yhdellä.

Lopuksi lasketaan, kuinka monta kertaa kukin ikä esiintyi.