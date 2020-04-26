package model;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public enum Constants {
	E(2.71),//2.7182818284 nepero
	PI(3.14),//3.1415926535 pigreco
	PHI(1.61),//1.6180339887 rapporto aureo
	EUMA(0.57), //0.5772156649 eulero-mascheroni
	EMTR(0.70),//0.70258 Embree-Trefethen
	PLS(1.32),//1.3247179572 numero plastico
	FEIGPR(4.66),//4.6692016091 Feigenbaum primo
	FEIGSN(2.50),// 2.5029078750 Feigenbaum secondo
	PRGEM(0.66),//0.6601618158 primi gemelli
	MILLS(1.30),//1.30637788 mills
	BRUNGEM(1.90),//1.9021605823 brum gemelli
	BRUMQUAD(0.87);// 0.8705883800 brum quadrupli
	
	private final Double value;
	
	Constants(Double value) {
		this.value = value;
	}
	
	public Double getValue() {
		return value;
	}	
	public String getName() {
		return this.name();
	}
	public String getSyntax() {
		return this.name().toLowerCase();
	}
	public static Set<String> names(){
      return Arrays.asList(Constants.values()).stream()
                                              .map(e -> e.getName())
                                              .collect(Collectors.toSet());
    }
};