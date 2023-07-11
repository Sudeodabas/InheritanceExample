public class Main {
    public static void main(String[] args) {
        Asistan a1 = new Asistan("Sude Odabaş", "0555 555 5555", "sude@gmail.com", "CENG", "öğrenci", "10.00");
        Akademisyen A1 = new Akademisyen("db", "848", "ggjfl", "hjkdl", "jbdlk");
        System.out.println(a1.getOfisSaati());
        a1.derseGir();
    }
}
