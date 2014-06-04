package name.davie.andrew.jmdictjpav2;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-06-04T13:46:29.569+0100")
@StaticMetamodel(Entry.class)
public class Entry_ {
	public static volatile SingularAttribute<Entry, Long> ent_seq;
	public static volatile SingularAttribute<Entry, String> ke_inf;
	public static volatile SingularAttribute<Entry, String> ke_pri;
	public static volatile SingularAttribute<Entry, String> keb;
	public static volatile SingularAttribute<Entry, String> re_inf;
	public static volatile SingularAttribute<Entry, String> re_nokanji;
	public static volatile SingularAttribute<Entry, String> re_pri;
	public static volatile SingularAttribute<Entry, String> re_restr;
	public static volatile SingularAttribute<Entry, String> reb;
	public static volatile SetAttribute<Entry, Audit> audits;
	public static volatile SetAttribute<Entry, Sense> senses;
	public static volatile SetAttribute<Entry, Unicode> unicodes;
}
