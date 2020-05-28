package it.unibo.oop.mge.libraries;

import java.util.List;

public enum Constant implements GenericEnum {
    /**
     * nepero's number.
     */
    E(2.7182),
    /**
     * pi greek.
     */
    PI(3.1415),
    /**
     * golden ratio.
     */
    PHI(1.6180),
    /**
     * euler-mascheroni.
     */
    EUMA(0.5772),
    /**
     * Embree-Trefethen.
     */
    EMTR(0.7025),
    /**
     * plastic number.
     */
    PLS(1.3247),
    /**
     * Feigenbaum first.
     */
    FEIGPR(4.6692),
    /**
     * Feigenbaum secondo second.
     */
    FEIGSN(2.5029),
    /**
     * primes twins.
     */
    PRGEM(0.6601),
    /**
     * mills number.
     */
    MILLS(1.3063),
    /**
     * brim twins.
     */
    BRUNGEM(1.9021),
    /**
     * brum quad.
     */
    BRUMQUAD(0.8705);

    private final Double value;

    public static List<String> getSyntaxList() {
        return EnumUtilityImpl.getSyntaxList(Constant.class);
    }

    public static Constant getConstantFromSyntax(final String syntax) {
        return (Constant) EnumUtilityImpl.getElement(Constant.class, syntax);
    }

    Constant(final Double value) {
        this.value = value;
    }

    public Double resolve() {
        return value;
    }

    public String getSyntax() {
        return this.name().toLowerCase();
    }
};
