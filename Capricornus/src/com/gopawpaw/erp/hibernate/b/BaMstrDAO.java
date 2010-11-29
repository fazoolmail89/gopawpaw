package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BaMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BaMstr
 * @author MyEclipse Persistence Tools
 */

public class BaMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BaMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BaMstr transientInstance) {
		log.debug("saving BaMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BaMstr persistentInstance) {
		log.debug("deleting BaMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BaMstr findById(com.gopawpaw.erp.hibernate.b.BaMstrId id) {
		log.debug("getting BaMstr instance with id: " + id);
		try {
			BaMstr instance = (BaMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BaMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BaMstr instance) {
		log.debug("finding BaMstr instance by example");
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
		log.debug("finding BaMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BaMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BaMstr instances");
		try {
			String queryString = "from BaMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BaMstr merge(BaMstr detachedInstance) {
		log.debug("merging BaMstr instance");
		try {
			BaMstr result = (BaMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BaMstr instance) {
		log.debug("attaching dirty BaMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BaMstr instance) {
		log.debug("attaching clean BaMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BaMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BaMstrDAO) ctx.getBean("BaMstrDAO");
	}
}