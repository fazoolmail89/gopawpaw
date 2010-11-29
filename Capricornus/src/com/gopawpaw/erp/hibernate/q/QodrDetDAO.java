package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QodrDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QodrDet
 * @author MyEclipse Persistence Tools
 */

public class QodrDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QodrDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QodrDet transientInstance) {
		log.debug("saving QodrDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QodrDet persistentInstance) {
		log.debug("deleting QodrDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QodrDet findById(com.gopawpaw.erp.hibernate.q.QodrDetId id) {
		log.debug("getting QodrDet instance with id: " + id);
		try {
			QodrDet instance = (QodrDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QodrDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QodrDet instance) {
		log.debug("finding QodrDet instance by example");
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
		log.debug("finding QodrDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QodrDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QodrDet instances");
		try {
			String queryString = "from QodrDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QodrDet merge(QodrDet detachedInstance) {
		log.debug("merging QodrDet instance");
		try {
			QodrDet result = (QodrDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QodrDet instance) {
		log.debug("attaching dirty QodrDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QodrDet instance) {
		log.debug("attaching clean QodrDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QodrDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QodrDetDAO) ctx.getBean("QodrDetDAO");
	}
}