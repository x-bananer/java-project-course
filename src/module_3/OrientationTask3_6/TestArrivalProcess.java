package module_3.OrientationTask3_6;

import eduni.distributions.Negexp;
import eduni.distributions.Bernoulli;

public class TestArrivalProcess {
    /*
        Tämä ohjelma simuloi asiakkaiden saapumista pörssiin.
        Jokainen uusi saapuminen on joko ostaja tai myyjä.
        Valinta tehdään satunnaisesti Bernoulli-jakaumalla.
        Ohjelma luo useita saapumistapahtumia ja tulostaa ne lopuksi.
    */
    public static void main(String[] args) {
        // Käytämme kahta ArrivalProcess-oliota, koska ostajat ja myyjät saapuvat erikseen
        ArrivalProcess buyAP  = new ArrivalProcess(EventType.BUY_ARRIVAL,  new Negexp(10));
        ArrivalProcess sellAP = new ArrivalProcess(EventType.SELL_ARRIVAL, new Negexp(5));

        // Mutta molemmat lisäävät tapahtumat samaan EventList-olioon
        EventList events = new EventList();

        int buyCount = 0;
        int sellCount = 0;

        /*
            Bernoulli-jakauma päättää, onko saapuva asiakas ostaja vai myyjä.
            Valitsen alussa todennäköisyydet 40% ostajille ja 60% myyjille vain esimerkin vuoksi,
            koska se tuntuu realistiselta simulaatiossa.
        */
        Bernoulli coin = new Bernoulli(0.4);
        for (int i = 0; i < 100; i++) {
            // Valinnan jälkeen lisätään joko ostajan tai myyjän saapumistapahtuma listaan
            if (coin.sample() == 1) {
                buyAP.addEvent(events);
                buyCount++;
            } else {
                sellAP.addEvent(events);
                sellCount++;
            }
        }

        // Tulostetaan kaikkien luotujen tapahtumien lista
        System.out.println(events);

        /*
            Tulostetaan lyhyet tilastot ostajien ja myyjien suhteesta.
            Mitä enemmän iteraatioita, sitä lähemmäs tulos menee minun Bernoulli-jakauman todennäköisyyksiä (40% х 60%).
        */
        int total = buyCount + sellCount;
        System.out.println("BUY:  " + buyCount);
        System.out.println("SELL: " + sellCount);
        System.out.println("TOTAL: " + total);
        System.out.println("BUY %:  " + (total == 0 ? 0 : (buyCount * 100.0 / total)));
        System.out.println("SELL %: " + (total == 0 ? 0 : (sellCount * 100.0 / total)));
    }
}
