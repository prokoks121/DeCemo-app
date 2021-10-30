# DeCemo-app
DeCemo je aplikacija koja nam nudi mnogućnost da:

* Spisak ugostiteljskih objekata (Kafici, Pabovi, Klubovi, Splavovi...)
* Prikaz ugostiteljskih objekata na mapi
* Filtriranje
* Pretraga
* Prikaz događaja
* Još mnogo toga...

### Ukoliko želite da testirate aplikaciju možete nam se obratiti putem mejla malexic.000@gmail.com kako bi dobili demo verziju aplikacije

<img src="gif/Screen_Recording_20211030-170904_DeCemo (1).gif"/>

## Kod

Kako bi postigli što bolji kvalitet, korišćena je MVVM arhitektura
koja podrazumeva korišćenje:

* View
* ViewModel (LiveData)
* Repository
  * Room (Kao interno skladište podataka)
  * Retrofit (Kao eksterno preuzimanje podataka)
  
  <img src="gif/MVVM-diagram.png" height="350px"/>

  
Umesto korišćenja RecyclerView Adapter koristili smo [Epoxy Airbnb](https://github.com/airbnb/epoxy), što nam je pomoglo kako bi uprostili naš kod i ostvarili bolji učinak.
Takodje moramo da pomenemo i [Glide](https://github.com/bumptech/glide) koje uveliko olakšava dobijanja slika uz pomoc API-a.
Za navođenje između fragmenata koristili smo JetPack Navigaion Component, što nam omogućava komunikaciju između fragmenata, slanje potrebnig podataka i slično

<img src="gif/Screen_Recording_20211030-173217_DeCemo (1).gif"/>
