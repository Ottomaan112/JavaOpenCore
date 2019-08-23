public class WingChun {

    private String naamTraining1() {
        String naamTraining1 = "Conditie training";
        return naamTraining1;
    }

    private String naamTraining2() {
        String naamTraining2 = "Technieken";
        return naamTraining2;
    }

    private String naamTraining3() {
        String naamTraining3 = "Sparren";
        return naamTraining3;
    }

    private String naamTraining4() {
        String naamTraining4 = "Cooling down";
        return naamTraining4;
    }

    private String conditieTraining() {
        String tijdConditieTraining = "10.00 / 11.00";
        return tijdConditieTraining;
    }

    private String technieken() {
        String tijdTechnieken = "11.00 / 12.00";
        return tijdTechnieken;
    }

    private String sparren() {
        String tijdSparren = "12.00 / 13.00";
        return tijdSparren;
    }

    private String coolingDown() {
        String tijdCoolingDown = "13.00 / 14.00";
        return tijdCoolingDown;
    }

    private String conditieOefeningen() {
        String oefeningen = "looppas, sprinten, buikspieren en opdrukken";
        return oefeningen;
    }

    private String techniekOefeningen() {
        String oefeningen1 = "eerste vorm, tweede vorm, lopen en stoten, tan-sau en hit";
        return oefeningen1;
    }

    private String sparOefeningen() {
        String oefeningen2 = "1  vs  1,  1  vs  2,  1  vs  3";
        return oefeningen2;
    }

    private String coolingDownOefeningen() {
        String oefeningen3 = "Rekken & strekken";
        return oefeningen3;
    }



    public void printScheme() {
        System.out.println(naamTraining1() +": " + conditieTraining() + " - " + conditieOefeningen());
        System.out.println(naamTraining2() +": " + technieken() + " - " + techniekOefeningen());
        System.out.println(naamTraining3() +": " + sparren() + " - " + sparOefeningen());
        System.out.println(naamTraining4() +": " + coolingDown() + " - " + coolingDownOefeningen());
    }

}

