package name.davie.andrew.jmdictjpav2;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-06-04T13:46:29.561+0100")
@StaticMetamodel(Audit.class)
public class Audit_ {
	public static volatile SingularAttribute<Audit, Integer> id;
	public static volatile SingularAttribute<Audit, Long> ent_seq;
	public static volatile SingularAttribute<Audit, Date> updDate;
	public static volatile SingularAttribute<Audit, String> updDetl;
	public static volatile SingularAttribute<Audit, Entry> entry;
}
