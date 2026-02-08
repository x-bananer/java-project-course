**1. (W) Using an example case (health centre, bank, etc.), discuss the meaning and characterisation of all the performance measures discussed in the lesson material using the concepts of the target system.**

Tarkastellaan suorituskykymuuttujia pankin toiminnan simulaation esimerkillä.

A (arrival count) näyttää, kuinka monta asiakasta saapui pankkiin simulaation aikana.
C (completed count) näyttää, kuinka monta asiakasta pankin palvelupisteet ehtivät palvella simulaation aikana.
B (busy time) näyttää, kuinka kauan palvelupisteet olivat yhteensä varattuja eli kuinka kauan asiakkaita palveltiin.
T (total time) on pankin toiminnan kokonaisaika simulaatiossa.

U = B / T on palvelupisteiden keskimääräinen käyttöaste.
Se näyttää, kuinka suuren osan ajasta palvelupisteet olivat käytössä eikä tyhjinä.
Jos arvo on lähellä 1 (100 %), palvelupisteet olivat lähes koko ajan varattuja.
Jos arvo on pieni, palvelupisteet olivat usein tyhjinä.

X = C/T on läpivirtaus eli kuinka monta asiakasta palvellaan keskimäärin aikayksikössä.
Esimerkiksi jos aika T on minuutteina, X kertoo, montako asiakasta palvellaan yhdessä minuutissa.

S = B/C on yhden asiakkaan keskimääräinen palveluaika yhdessä palvelupisteessä.
Se kertoo, kuinka kauan asiakasta palvellaan keskimäärin.

Ri (response time) kertoo, kuinka kauan yksi tietty asiakas oli pankissa yhteensä.
Se sisältää jonotusajan ja palveluajan palvelupisteessä.

W on kaikkien asiakkaiden yhteenlaskettu aika järjestelmässä (Ri1 + Ri2 + ... + Rin).
Se kertoo, kuinka paljon aikaa kaikki asiakkaat yhteensä viettivät pankissa saapumisesta lähtöön.

R = W/C on keskimääräinen aika, jonka yksi asiakas vietti pankissa.

N = W/T on keskimääräinen asiakkaiden määrä järjestelmässä.
Se kertoo, kuinka monta asiakasta on keskimäärin pankissa samaan aikaan, sekä jonossa että palvelupisteessä.
___

2. (W) Consider the categories in which performance measures are maintained/updated/computed. (Think in general terms: service point/customer; not in target system terms.)

Ensimmäinen ryhmä on palvelupisteen mittarit.
On loogista laskea ne palvelupisteessä, koska ne kuvaavat sitä, miten palvelupiste toimii.

- kuinka kauan palvelupiste on ollut varattu
- kuinka monta asiakasta palvelupiste on palvellut
- kuinka kuormitettu palvelupiste on
- kuinka kauan palvelu kestää keskimäärin

Nämä päivitetään, kun  palvelupiste alkaa tai lopettaa palvella asiakasta.

Toinen ryhmä on asiakkaan mittarit.
On loogista laskea ne jokaiselle asiakkaalle, koska ne kuvaavat asiakkaan kokemaa aikaa järjestelmässä.

- kuinka kauan yksi asiakas vietti järjestelmässä
- kuinka kauan kaikki asiakkaat yhteensä viettivät järjestelmässä
- asiakkaan keskimääräinen aika järjestelmässä

Nämä päivitetään, kun asiakas saapuu järjestelmään tai poistuu järjestelmästä.
___

3. (W) Design two different systems of three or four service points for a real-world destination. Use real-world concepts. Draw diagrams using the graphical representation of a service point shown in section ´Performance Variables´.

![Diagram](diagram.png)
___

4. (W) Write an algorithm in Java or pseudocode for the main loop of the simulator:

The main loop does all the things required for a three-phase simulation (presented in a section).

Think in general terms (don't think in detail) and present a general solution. No need for target system concepts.

___

5. (W) Using the names of the simulator classes, explain the simulator a) what A-phase coding means? b) what coding B-events mean? c) what coding C events means?

You can also write Java or pseudocode.

Present a general solution. No need for the target system concepts.