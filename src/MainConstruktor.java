public class MainConstruktor {
    public static void main(String[] args) {
        manager asep = new manager(8000000);
        programmer anto = new programmer(7000000);


        System.out.println("Nama : " + asep.getNama());
        System.out.println("gaji pokok : " + asep.getGajiPokok());
        System.out.println("tunjangan : " + asep.gettunjangan()+"\n");
        asep.cetakinfo();
        
        System.out.println("Nama : " + anto.getNama());
        System.out.println("gaji pokok : " + anto.getGajiPokok());
        System.out.println("tunjangan : " + anto.getBonus()+"\n");
        anto.cetakinfo();



    }
}
