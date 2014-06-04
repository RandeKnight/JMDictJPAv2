package name.davie.andrew.jmdictjpav2;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-06-04T13:48:20.944+0100")
@StaticMetamodel(Character.class)
public class Character_ {
	public static volatile SingularAttribute<Character, String> unicode;
	public static volatile SingularAttribute<Character, String> cpTypeJis208;
	public static volatile SingularAttribute<Character, String> cpTypeUcs;
	public static volatile SetAttribute<Character, Dic_Number> dicNumbers;
	public static volatile SingularAttribute<Character, Integer> freq;
	public static volatile SingularAttribute<Character, Integer> grade;
	public static volatile SingularAttribute<Character, String> jaKun;
	public static volatile SingularAttribute<Character, String> jaOn;
	public static volatile SingularAttribute<Character, Integer> jlpt;
	public static volatile SingularAttribute<Character, String> literal;
	public static volatile SingularAttribute<Character, String> meaning;
	public static volatile SingularAttribute<Character, String> nanori;
	public static volatile SingularAttribute<Character, String> queryCodeDeroo;
	public static volatile SingularAttribute<Character, String> queryCodeFourCorner;
	public static volatile SingularAttribute<Character, String> queryCodeShDesc;
	public static volatile SingularAttribute<Character, String> queryCodeSkip;
	public static volatile SingularAttribute<Character, Integer> radicalClassical;
	public static volatile SingularAttribute<Character, Integer> radicalNelson;
	public static volatile SingularAttribute<Character, Integer> strokeCount;
}
