package repos;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import exceptions.UsuarioException;
import modelo.Usuario;

public class RepositorioUsuarios extends Repositorio<Usuario> {

	private static RepositorioUsuarios instance;

	public static RepositorioUsuarios getInstance() {
		if (instance == null) {
			instance = new RepositorioUsuarios();
		}
		return instance;
	}

	public RepositorioUsuarios() {
		create(new Usuario("david", "david"));
		create(new Usuario("demian", "demian"));
		create(new Usuario("hernan", "hernan"));
		create(new Usuario("gonza", "gonza"));
		create(new Usuario("agus", "agus"));
	}

	public Usuario buscarPorUsername(String username) {
		List<Usuario> usuarios = searchByExample(new Usuario(username,username)).stream().collect(Collectors.toList());
		if(usuarios.isEmpty()){
			throw new UsuarioException("No existe un usuario con el username = " + username); 
		}
		return usuarios.get(0);
	}

	@Override
	protected Class<Usuario> getEntityType() {
		return Usuario.class;
	}

	@Override
	protected void addQueryByExample(CriteriaQuery criteria, Usuario t) {
		criteria.add(Restrictions.eq("username", t.getNombre()()));
	}

	@Override
	protected void addQueryAllInstances(Criteria criteria) {
	}

	@Override
	protected void addQueryByExample(CriteriaQuery<Usuario> criteria, Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void addQueryAllInstances(CriteriaQuery<Usuario> criteria) {
		// TODO Auto-generated method stub
		
	}
	
}