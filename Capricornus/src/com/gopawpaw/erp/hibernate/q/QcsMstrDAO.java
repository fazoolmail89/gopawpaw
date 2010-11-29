package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QcsMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QcsMstr
 * @author MyEclipse Persistence Tools
 */

public class QcsMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QcsMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QcsMstr transientInstance) {
		log.debug("saving QcsMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QcsMstr persistentInstance) {
		log.debug("deleting QcsMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QcsMstr findById(com.gopawpaw.erp.hibernate.q.QcsMstrId id) {
		log.debug("getting QcsMstr instance with id: " + id);
		try {
			QcsMstr instance = (QcsMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QcsMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QcsMstr instance) {
		log.debug("finding QcsMstr instance by example");
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
		log.debug("finding QcsMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QcsMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QcsMstr instances");
		try {
			String queryString = "from QcsMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QcsMstr merge(QcsMstr detachedInstance) {
		log.debug("merging QcsMstr instance");
		try {
			QcsMstr result = (QcsMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QcsMstr instance) {
		log.debug("attaching dirty QcsMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QcsMstr instance) {
		log.debug("attaching clean QcsMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QcsMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QcsMstrDAO) ctx.getBean("QcsMstrDAO");
	}
}