package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QcdDet
 * @author MyEclipse Persistence Tools
 */

public class QcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QcdDet transientInstance) {
		log.debug("saving QcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QcdDet persistentInstance) {
		log.debug("deleting QcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QcdDet findById(com.gopawpaw.erp.hibernate.q.QcdDetId id) {
		log.debug("getting QcdDet instance with id: " + id);
		try {
			QcdDet instance = (QcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QcdDet instance) {
		log.debug("finding QcdDet instance by example");
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
		log.debug("finding QcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QcdDet instances");
		try {
			String queryString = "from QcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QcdDet merge(QcdDet detachedInstance) {
		log.debug("merging QcdDet instance");
		try {
			QcdDet result = (QcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QcdDet instance) {
		log.debug("attaching dirty QcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QcdDet instance) {
		log.debug("attaching clean QcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QcdDetDAO) ctx.getBean("QcdDetDAO");
	}
}