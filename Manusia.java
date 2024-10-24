
public class Manusia extends Node {

    private String nama = "";
    private String skill = "";
    private int umur = 0;
    private String hobi = "";

    public Manusia(String nama, String skill, int umur, String hobi) {
        this.nama = nama;
        this.skill = skill;
        this.umur = umur;
        this.hobi = hobi;
    }

    public String getNama() {
        return nama;
    }

    public String getSkill() {
        return skill;
    }

    public int getUmur() {
        return umur;
    }

    public String getHobi() {
        return hobi;
    }

    @Override
    public String getData() {
        
        return String.format("%s\t\t\t|%s\t|%d\t|%s", nama, skill, umur, hobi);
    }
}
