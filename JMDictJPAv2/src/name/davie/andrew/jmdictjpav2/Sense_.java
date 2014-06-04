package name.davie.andrew.jmdictjpav2;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-06-04T13:46:29.585+0100")
@StaticMetamodel(Sense.class)
public class Sense_ {
	public static volatile SingularAttribute<Sense, Integer> id;
	public static volatile SingularAttribute<Sense, Long> ent_seq;
	public static volatile SingularAttribute<Sense, String> ant;
	public static volatile SingularAttribute<Sense, String> dial;
	public static volatile SingularAttribute<Sense, String> example;
	public static volatile SingularAttribute<Sense, String> field;
	public static volatile SingularAttribute<Sense, String> gloss;
	public static volatile SingularAttribute<Sense, String> misc;
	public static volatile SingularAttribute<Sense, String> pos;
	public static volatile SingularAttribute<Sense, String> sInf;
	public static volatile SingularAttribute<Sense, String> stagk;
	public static volatile SingularAttribute<Sense, String> stagr;
	public static volatile SingularAttribute<Sense, String> xref;
	public static volatile SetAttribute<Sense, Lsource> lsources;
	public static volatile SingularAttribute<Sense, Entry> entry;
}
