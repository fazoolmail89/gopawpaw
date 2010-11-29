package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QcMstr
 * @author MyEclipse Persistence Tools
 */

public class QcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QcMstr transientInstance) {
		log.debug("saving QcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QcMstr persistentInstance) {
		log.debug("deleting QcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QcMstr findById(com.gopawpaw.erp.hibernate.q.QcMstrId id) {
		log.debug("getting QcMstr instance with id: " + id);
		try {
			QcMstr instance = (QcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QcMstr instance) {
		log.debug("finding QcMstr instance by example");
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
		log.debug("finding QcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QcMstr instances");
		try {
			String queryString = "from QcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QcMstr merge(QcMstr detachedInstance) {
		log.debug("merging QcMstr instance");
		try {
			QcMstr result = (QcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QcMstr instance) {
		log.debug("attaching dirty QcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QcMstr instance) {
		log.debug("attaching clean QcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QcMstrDAO) ctx.getBean("QcMstrDAO");
	}
}