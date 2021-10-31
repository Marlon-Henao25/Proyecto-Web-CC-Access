package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-31T00:19:09")
@StaticMetamodel(Eventos.class)
public class Eventos_ { 

    public static volatile SingularAttribute<Eventos, String> nombreEvento;
    public static volatile SingularAttribute<Eventos, Date> fechaEvento;
    public static volatile SingularAttribute<Eventos, String> descripción;
    public static volatile SingularAttribute<Eventos, Integer> idEvento;
    public static volatile SingularAttribute<Eventos, Date> horaEvento;
    public static volatile SingularAttribute<Eventos, String> lugarEvento;

}