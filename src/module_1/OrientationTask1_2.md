Käytetään samaa esimerkkiä kirjojen varaamisesta Helmet.fi-sivustolla sekä kirjojen käytöstä ja palautuksesta.

**Variability:**

Ennustettavat muutokset:
- säännöllinen kysynnän vaihtelu (esimerkiksi oppikirjoilla on usein suurempi kysyntä lukukauden aikana ja pienempi kysyntä lomien aikana);
- kirjakokoelman säännöllinen päivittäminen, jos se tapahtuu aikataulun mukaan;
- kirjan keskimääräinen laina-aika.

Ennustamattomat muutokset:
- viivästykset kirjojen palautuksessa;
- viivästykset logistiikassa ja kirjojen kuljetuksessa;
- kirjojen kuluminen tai vahingoittuminen;
- kysynnän muutokset yksittäisten ulkoisten tapahtumien vuoksi.

**Interconnectedness:**

Yleinen esimerkki järjestelmän vastavuoroisista vaikutuksista:
Kuljettaja pitää ylimääräisen vapaapäivän ja kirja saapuu kirjastoon myöhemmin,

tai

lukija palauttaa kirjan myöhässä,

tai

lukija vahingoittaa tai kadottaa kirjan, jolloin kappale ei ole enää käytettävissä.

Tämän seurauksena kirjan odotusaika pitenee ja varausjono kasvaa, ja jokainen jonossa oleva lukija joutuu odottamaan pidempään.

**Complexity:**

Kombinatorinen monimutkaisuus kirjastojärjestelmässä syntyy kirjastojen lukumäärästä, kirjojen lukumäärästä ja niiden mahdollisista jakautumis- ja siirtovaihtoehdoista eri kirjastojen välillä.

Dynaaminen monimutkaisuus kirjastojärjestelmässä syntyy palautus- ja laina-aikojen muutoksista yhdessä kysynnän nykyisen tilanteen kanssa. Esimerkiksi palautuksen viivästyminen, kuljetuksen viivästyminen tai kirjan vahingoittuminen voi aiheuttaa merkittäviä vaikutuksia silloin, kun kirjan kysyntä kasvaa äkillisesti ulkoisen tapahtuman vuoksi.