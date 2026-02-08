3. Why can't a Singleton object be created from outside the Singleton class using the new operation?

Singleton on suunnittelumalli, joka takaa, että luokasta voi olla vain yksi olio. Se on eräänlainen globaalisti käytettävä olio, jota voidaan käyttää eri osissa sovellusta. Näin voimme olla varmoja, että aina kun käytämme tätä oliota, käytämme samoja tietoja ja metodeja, koska koko sovelluksessa on vain yksi instanssi.

Siksi Singleton-olion instanssi luodaan luokan sisällä ja annetaan käyttöön esimerkiksi metodilla getInstance. Luokan konstruktori on private, joten uutta oliota ei voi luoda new-avainsanalla luokan ulkopuolelta. Luokan ulkopuolelta ei ole keinoa luoda uutta instanssia.