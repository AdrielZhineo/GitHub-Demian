package repos;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Caja;
import modelo.Cliente;
import modelo.EstadoFactura;
import modelo.Factura;
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
			.addAnnotatedClass(Factura.class)
			.buildSessionFactory();

	public List<T> allInstances() {
		Session session = sessionFactory.openSession();
		try {
			CriteriaQuery<T> query = session.getCriteriaBuilder().createQuery(getEntityType());
			this.addQueryAllInstances(query);
			return session.createQuery(query).getResultList();
		} finally {
			session.close();
		}
	}

	public List<T> searchByExample(T t) {
		Session session = sessionFactory.openSession();
		try {
			CriteriaQuery<T> query = session.getCriteriaBuilder().createQuery(getEntityType());
			this.addQueryByExample(query, t);
			return session.createQuery(query).getResultList();
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
	protected abstract void addQueryByExample(CriteriaQuery<T> criteria, T t);
	protected abstract void addQueryAllInstances(CriteriaQuery<T> criteria);


}

