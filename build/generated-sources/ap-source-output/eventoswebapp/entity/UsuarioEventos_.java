package eventoswebapp.entity;

import eventoswebapp.entity.Reserva;
import eventoswebapp.entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-08T20:12:20")
@StaticMetamodel(UsuarioEventos.class)
public class UsuarioEventos_ { 

    public static volatile SingularAttribute<UsuarioEventos, String> apellidos;
    public static volatile SingularAttribute<UsuarioEventos, String> domicilio;
    public static volatile ListAttribute<UsuarioEventos, Reserva> reservaList;
    public static volatile SingularAttribute<UsuarioEventos, String> ciudad;
    public static volatile SingularAttribute<UsuarioEventos, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioEventos, Character> sexo;
    public static volatile SingularAttribute<UsuarioEventos, Integer> usuarioId;
    public static volatile SingularAttribute<UsuarioEventos, String> nombre;
    public static volatile SingularAttribute<UsuarioEventos, Integer> edad;

}