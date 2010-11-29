package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QoMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QoMstr
 * @author MyEclipse Persistence Tools
 */

public class QoMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QoMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QoMstr transientInstance) {
		log.debug("saving QoMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QoMstr persistentInstance) {
		log.debug("deleting QoMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QoMstr findById(com.gopawpaw.erp.hibernate.q.QoMstrId id) {
		log.debug("getting QoMstr instance with id: " + id);
		try {
			QoMstr instance = (QoMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QoMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QoMstr instance) {
		log.debug("finding QoMstr instance by example");
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
		log.debug("finding QoMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QoMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QoMstr instances");
		try {
			String queryString = "from QoMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QoMstr merge(QoMstr detachedInstance) {
		log.debug("merging QoMstr instance");
		try {
			QoMstr result = (QoMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QoMstr instance) {
		log.debug("attaching dirty QoMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QoMstr instance) {
		log.debug("attaching clean QoMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QoMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QoMstrDAO) ctx.getBean("QoMstrDAO");
	}
}