package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QorMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QorMstr
 * @author MyEclipse Persistence Tools
 */

public class QorMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QorMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QorMstr transientInstance) {
		log.debug("saving QorMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QorMstr persistentInstance) {
		log.debug("deleting QorMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QorMstr findById(com.gopawpaw.erp.hibernate.q.QorMstrId id) {
		log.debug("getting QorMstr instance with id: " + id);
		try {
			QorMstr instance = (QorMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QorMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QorMstr instance) {
		log.debug("finding QorMstr instance by example");
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
		log.debug("finding QorMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QorMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QorMstr instances");
		try {
			String queryString = "from QorMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QorMstr merge(QorMstr detachedInstance) {
		log.debug("merging QorMstr instance");
		try {
			QorMstr result = (QorMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QorMstr instance) {
		log.debug("attaching dirty QorMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QorMstr instance) {
		log.debug("attaching clean QorMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QorMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QorMstrDAO) ctx.getBean("QorMstrDAO");
	}
}