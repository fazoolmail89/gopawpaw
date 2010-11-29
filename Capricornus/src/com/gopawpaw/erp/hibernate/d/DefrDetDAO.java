package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DefrDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DefrDet
 * @author MyEclipse Persistence Tools
 */

public class DefrDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DefrDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DefrDet transientInstance) {
		log.debug("saving DefrDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DefrDet persistentInstance) {
		log.debug("deleting DefrDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DefrDet findById(com.gopawpaw.erp.hibernate.d.DefrDetId id) {
		log.debug("getting DefrDet instance with id: " + id);
		try {
			DefrDet instance = (DefrDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DefrDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DefrDet instance) {
		log.debug("finding DefrDet instance by example");
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
		log.debug("finding DefrDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DefrDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DefrDet instances");
		try {
			String queryString = "from DefrDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DefrDet merge(DefrDet detachedInstance) {
		log.debug("merging DefrDet instance");
		try {
			DefrDet result = (DefrDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DefrDet instance) {
		log.debug("attaching dirty DefrDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DefrDet instance) {
		log.debug("attaching clean DefrDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DefrDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DefrDetDAO) ctx.getBean("DefrDetDAO");
	}
}