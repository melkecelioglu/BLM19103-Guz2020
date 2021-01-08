package soru1;

/**
 * NullElemanKontrol.java
 *
 * @author Muhammet Alkan <malkan@fsm.edu.tr>
 * @date 06-Jan-2021, 11:16:58
 */
public class NullElemanKontrol extends Exception {

    String message;

    public NullElemanKontrol(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
