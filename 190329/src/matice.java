public class matice {

    private int pocetRadku;
    private int pocetSloupcu;
    private double[][] hodnoty;



    public matice(int pocetRadku, int pocetSloupcu) {
        this.pocetRadku = pocetRadku;
        this.pocetSloupcu = pocetSloupcu;
        this.hodnoty=new double[pocetRadku][pocetSloupcu];
    }



    public double ziskejHodnotu(int radek, int sloupec){
        double hodnota=this.hodnoty[radek-1][sloupec-1];
        return hodnota;
    }

    public void nastavHodnotu(int radek,int sloupec,double hodnota){
        this.hodnoty[radek-1][sloupec-1]=hodnota;
    }

    public matice soucinSkalar(double cislo){
        matice nova=new matice(this.pocetRadku, this.pocetSloupcu);
            for (int radek=0; radek<pocetRadku; radek++){
                for (int sloupec=0; sloupec<pocetSloupcu;sloupec++){
                   nova.hodnoty[radek][sloupec]=
                    cislo*this.hodnoty[radek][sloupec];
                }
        }
            return nova;
    }





    @Override
    public String toString() {
        // StringBuilder slouží pro efektivní postupné skládání řetezce
        StringBuilder sb = new StringBuilder();

        // procházení jednotlivých hodnot matice
        for (int r = 0; r < pocetRadku; r++) { // 1. cyklus prochází řádky matice od shora dolů
            for (int s = 0; s < pocetSloupcu; s++) { // 2. cyklus prochází jednotlivé sloupce aktuálního řádku zleva doprava
                // hodnotu na aktuální pozici převedeme na String a uložíme do StringBuilderu
                sb.append(String.format("%3.2f ", hodnoty[r][s]));
            }

            // Kosmetická záležitost: na konci řádku umažeme mezeru, která je zde navíc a nahradíme ji odřádkováním
            sb.deleteCharAt(sb.length() - 1);
            sb.append('\n');
        }

        // Kosmetická záležitost: na konci řetězce odstraníme odřádkování
        sb.deleteCharAt(sb.length() - 1);

        // když už nic jiného nebudeme přidávat, převedeme StringBuilder na řetězec (String) pomocí metody toString() a vrátíme ho
        return sb.toString();
    }



}
