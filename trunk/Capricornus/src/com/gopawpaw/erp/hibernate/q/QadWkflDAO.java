package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QadWkfl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QadWkfl
 * @author MyEclipse Persistence Tools
 */

public class QadWkflDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QadWkflDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QadWkfl transientInstance) {
		log.debug("saving QadWkfl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QadWkfl persistentInstance) {
		log.debug("deleting QadWkfl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QadWkfl findById(com.gopawpaw.erp.hibernate.q.QadWkflId id) {
		log.debug("getting QadWkfl instance with id: " + id);
		try {
			QadWkfl instance = (QadWkfl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QadWkfl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QadWkfl instance) {
		log.debug("finding QadWkfl instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding QadWkfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QadWkfl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QadWkfl instances");
		try {
			String queryString = "from QadWkfl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QadWkfl merge(QadWkfl detachedInstance) {
		log.debug("merging QadWkfl instance");
		try {
			QadWkfl result = (QadWkfl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QadWkfl instance) {
		log.debug("attaching dirty QadWkfl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QadWkfl instance) {
		log.debug("attaching clean QadWkfl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QadWkflDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QadWkflDAO) ctx.getBean("QadWkflDAO");
	}
}