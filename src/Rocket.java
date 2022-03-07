public class Rocket {

    private String code;
    private int propeller;

    public Rocket(String code, int propeller) throws Exception {
        checkCode(code);
        this.code = code;
        this.propeller = propeller;
    }

    private void checkCode(String code) throws Exception {
        if (code.length() != 8) throw new Exception();
    }

    public String getCode() {
        return code;
    }

    public int getPropeller() {
        return propeller;
    }
}
