package eventoswebapp.entity;

import eventoswebapp.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-08T20:12:20")
@StaticMetamodel(Mensaje.class)
public class Mensaje_ { 

    public static volatile SingularAttribute<Mensaje, String> texto;
    public static volatile SingularAttribute<Mensaje, Integer> mensajeId;
    public static volatile SingularAttribute<Mensaje, Usuario> conversacionId;
    public static volatile SingularAttribute<Mensaje, Date> enviado;
    public static volatile SingularAttribute<Mensaje, Usuario> remitenteId;

}