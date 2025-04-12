# TemaDesignPatternsPAOO
Homework.Java-2.1. Utilizați Singleton Pattern într-o clasă Config, pentru a accesa date dintr-un fișier 
în format JSON, considerat a fi fișier de configurare. Fișierul conține un string considerat a fi o 
culoare in format #RRGGBB și un integer, considerat a fi weight. Conținutul fișierului poate fi de 
forma {"color":"#F3AA34","weight": 23}. Clasa Config are membrii publici getColor si getWeight prin 
care permite accesul la variabilele menționate. Clasa citește datele din fișier doar la prima accesare a 
respectivelor metode. 

Homework.Java-2.2. Utilizați Singleton Pattern într-o clasă WebHelper care are o singura metoda: 
String getWebSiteContent(). Aceasta metoda returnează conținutul unei aceleiași pagini web (url-ul 
poate fi hard codat în clasă). Pagina web este încărcată o singură data, la prima accesare a metodei  
getWebSiteContent(). Utilizați getWebSiteContent() într-o aplicație Java . 

Homework.Java-2.3. Considerați o clasa ComplexNumber. Scrieți și utilizați un adapter de la un 
Double la ComplexNumber și de la ComplexNumber la Double (prin calculul modulului 
ComplexNumber). Folosiți adapterul pentru a implementa următoarele metode: 
• ComplexNumber suma(ComplexNumber nr1, ComplexNumber n2) calculează suma celor doua 
numere complexe (în varianta clasică, învățată la matematică)  
• ComplexNumber suma(Double nr1, Double n2) se folosește adapterul, se convertesc Double la 
ComplexNumber și se face suma lor 
• ComplexNumber suma(ComplexNumber nr1, Double n2) și ComplexNumber suma(Double nr1, 
ComplexNumber n2) adapterul convertește ComplexNumber a Double și rezultatul sumei (un 
Double) va fi convertiti (folosind adapterul) la un ComplexNumber.

Homework.Java-2.4. (Optional) Proiectați o clasă C1, care să permită citirea a două numere de la 
tastatură si calculul sumei lor, prin apelul unei metode publice getSum(). Proiectați o clasă C2, care 
primește ca parametru un string JSON cu două chei, n1 și n2 și permite accesul la numerele 
corespunzătoare cheilor n1 și n2. Investigați dezvoltarea unui adaptor al clasei C2 la C1 care să 
permită calculul sumei celor două chei. Se poate folosi următorul mod de utilizare: C1 instanceOfC1 
= new C1Adapter(instanceOfC2), instanceOfC1. getSum() 

Homework.Java-2.5. Proiectați o clasă C2Nr care să permită calculul sumei a două numere și o clasă 
C3Nr care să permită calculul sumei a trei numere. 
Exemplu de utilizare: C2Nr c2Nr = new C2Nr(1,2); c2Nr.getSum() returnează 3 
C3Nr c3Nr = new C3Nr(1,2,3); c3Nr.getSum() returnează 6 
Scrieți o metodă într-o clasă de tip Adapter care sa convertească o instanță a C2Nr la una de C3Nr..

Homework.Java-2.6. Scrieți doua clase, Product (id, name, price in USD) si Produs (id, nume, pret in 
lei). Proiectați o clasa helper care sa acționeze ca adaptor intre cele doua clase. Ar trebui o metoda 
ProductToProdus si una ProdusToProduct. Ce parametrii ar trebui sa aibă si cum sunt folosite ? 

Homework.Java-2.7. Considerați o clasa Curs la care mai mulți Studenti se înscriu. Metoda prezenta() 
din clasa Curs poate fi apelată de mai mute ori. La fiecare apel, toți studenții îi trimit numele și un 
status (prezent/absent, generat random). Metoda prezenta() afișează numele studentilor de la curs 
și status-ul returnat. 

Homework.Java-2.8. Mai multe aparate electrice sunt conectate la un prelungitor. Când prelungitorul 
este băgat sau scos din priză toate aparatele conectate trebuie să dea un mesaj corespunzător (Ex: 
aparatul de cafea a fost conectat la curent, frigiderul a fost deconectat de la curent).

Homework.Java-2.9. Design solution for computing area of rectangle passing 2 float numbers (width 
and height) and circle, passing one float number (radius). How can I give the two numbers or one 
number to the class ? What can I get the area of the selected shape ? Investigate if possible to use 
Factory to decide what Shape is involved.
