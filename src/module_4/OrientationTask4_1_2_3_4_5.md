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

**2. (W) Consider the categories in which performance measures are maintained/updated/computed. (Think in general terms: service point/customer; not in target system terms.)**

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

**3. (W) Design two different systems of three or four service points for a real-world destination. Use real-world concepts. Draw diagrams using the graphical representation of a service point shown in section ´Performance Variables´.**

![Diagram](diagram.png)
___

**4. (W) Write an algorithm in Java or pseudocode for the main loop of the simulator: The main loop does all the things required for a three-phase simulation (presented in a section). Think in general terms (don't think in detail) and present a general solution. No need for target system concepts.**

*Toteutetaan pörssin Order Book simulaation:*

```
when an order arrives in the system:
    put the order into the arrival queue
    send the order to the "Validation, classification and sorting service point"
    
        if the order type is "market":
            send the order to the market flow
    
        if the order type is "limit":
            send the order to the limit flow


at the same time, in the market flow:
    take a market order
    try to find a matching limit order in the order book
    
        if a matching limit order is found:
            execute the trade
            send both orders to the execution queue
        else:
            wait until a matching limit order appears


at the same time, in the limit flow:
    take a limit order
    add the limit order to the order book
    wait until a matching order appears
    
        when a matching order is found:
            execute the trade
            send both orders to the execution queue


in the execution queue:
    take an order
    wait for execution time
    remove the order from the system
```
___

**5. (W) Using the names of the simulator classes, explain the simulator a) what A-phase coding means? b) what coding B-events mean? c) what coding C events means?  You can also write Java or pseudocode. Present a general solution. No need for the target system concepts.**

**A-phase**

Simulaattori katsoo, mikä tapahtuma tapahtuu seuraavaksi, ja siirtää ajan suoraan siihen hetkeen.

**B-events**

Nämä ovat tapahtumia, jotka on jo suunniteltu tietylle ajalle. Esimerkiksi asiakas saapuu tai palvelu päättyy. Tässä vaiheessa simulaattori suorittaa kaikki tapahtumat, joiden pitää tapahtua tällä hetkellä.

**C-events**

Nämä ovat ehdollisia toimintoja. Ne tehdään vain, jos tilanne on sopiva. Esimerkiksi jos jonossa on asiakas ja palvelupiste on vapaa, palvelu voi alkaa ja C-tapahtuma suoritetaan. Jos ehto ei täyty, mitään ei tapahdu.

Example:
```
while the simulation is not finished:
    // A-phase
    take the next event from the event list
    move the simulation clock to the time of this event

    // B-phase
    execute all B-events with the current clock time
    if needed, add new B-events to the event list

    // C-phase
    while there are C-events whose conditions are true:
        execute one C-event
        if needed, add new B-events to the event list

end simulation
```