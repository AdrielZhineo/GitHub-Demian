package repos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Caja;
import modelo.Cliente;
import modelo.EstadoFactura;
import modelo.Item;
import modelo.Movimiento;
import modelo.Producto;
import modelo.TipoMovimiento;
import modelo.Usuario;

public abstract class Repositorio<T> {

	protected static final SessionFactory sessionFactory = new Configuration().configure()
			.addAnnotatedClass(Caja.class)
			.addAnnotatedClass(Cliente.class)
			.addAnnotatedClass(EstadoFactura.class)
			.addAnnotatedClass(Item.class)
			.addAnnotatedClass(Movimiento.class)
			.addAnnotatedClass(Producto.class)
			.addAnnotatedClass(TipoMovimiento.class)
			.addAnnotatedClass(Usuario.class)
			.buildSessionFactory();

	@SuppressWarnings("unchecked")
	public List<T> allInstances() {
		Session session = sessionFactory.openSession();
		try {
			Criteria criteria = session.createCriteria(getEntityType());
			this.addQueryAllInstances(criteria);
			return criteria.list();
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> searchByExample(T t) {
		Session session = sessionFactory.openSession();
		try {
			Criteria criteria = session.createCriteria(getEntityType());
			this.addQueryByExample(criteria, t);
			return criteria.list();
		} catch (HibernateException e) {
			throw new RuntimeException(e);
		} finally {
			session.close();
		}
	}

	public void create(T t) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(t);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			throw new RuntimeException(e);
		} finally {
			session.close();
		}
	}

	public void update(T t) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(t);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			throw new RuntimeException(e);
		} finally {
			session.close();
		}
	}

	public void delete(T t){
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(t);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			throw new RuntimeException(e);
		} finally {
			session.close();
		}
	}

	public void openSession() {
		sessionFactory.openSession();
	}

	protected abstract Class<T> getEntityType();
	protected abstract void addQueryByExample(Criteria criteria, T t);
	protected abstract void addQueryAllInstances(Criteria criteria);


}

