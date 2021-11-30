public class Controller {

    private List<Fahrzeug> fahrzeugList;

    public Controller(){
        fahrzeugList = new List<>();
        insertAutos(10);
    }

    public void insertAutos(int n){
        for(int i = 0; i < n; i++){
            Fahrzeug myFahrzeug = new Fahrzeug((int) (Math.random() * (1000 - 1) + 1), (int) (Math.random() * (201 - 30) + 30), (int) (Math.random() * (5 - 2) + 2));
            fahrzeugList.append(myFahrzeug);
            System.out.println("Fahrzeug Nummer: " + myFahrzeug.getNummer() + " hat die PS: " + myFahrzeug.getPs() + " und die Anzahl an Räder von " + myFahrzeug.getAnzahlraeder());
        }
    }

    public void searchNummer(int n){
        int counter = 0;
        fahrzeugList.toFirst();
        while(fahrzeugList.hasAccess()){
            if(fahrzeugList.getContent().getNummer() == n){
                counter++;
            }
            fahrzeugList.next();
        }
        //System.out.println("Es befinden sich: " + counter + " Autos mit der Nummer: " + n);
    }

    public void allPS(){
        int allPS = 0;
        fahrzeugList.toFirst();
        while(fahrzeugList.hasAccess()){
            allPS = allPS + fahrzeugList.getContent().getPs();
            fahrzeugList.next();
        }
       // System.out.println("Die Gesamte PS sind: " + allPS);
    }

    public void onlyThreeRad(){
        fahrzeugList.toFirst();
        while(fahrzeugList.hasAccess()){
            if(fahrzeugList.getContent().getAnzahlraeder() == 3){
                System.out.println("Die Typ Nummer: " + fahrzeugList.getContent().getNummer() + " hat nur drei Räder");
            }
            fahrzeugList.next();
        }
    }

    public void smallestPS(){
        int smallestNumber = 200;
        fahrzeugList.toFirst();
        while(fahrzeugList.hasAccess()){
            if(fahrzeugList.getContent().getPs() < smallestNumber){
                smallestNumber = fahrzeugList.getContent().getPs();
            }
            fahrzeugList.next();
        }
        fahrzeugList.toFirst();
        while (fahrzeugList.hasAccess()){
            if(fahrzeugList.getContent().getPs() == smallestNumber) {
                System.out.println("Das Auto mit den wenigsten PS ist Nummer: " + fahrzeugList.getContent().getNummer() + " und hat: " + fahrzeugList.getContent().getPs() + " PS");
            }
            fahrzeugList.next();
        }
    }
}
